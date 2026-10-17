/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service.detector;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundOutcome;
import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.CtWinDefuseEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.CtWinEliminationEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.CtWinTimeEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.TWinBombEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.TWinEliminationEvent;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;
import io.github.lzh2587379717.cs2.gsi.domain.service.ChangeDetector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoundWinDetector implements ChangeDetector {

	@Override
	public List<GsiEvent> detect(GameState previous, GameState current) {
		if (current.getMap() == null) {
			return List.of();
		}

		Map<String, RoundOutcome> rawPrevWins =
				previous.getMap() == null ? null : previous.getMap().getRoundWins();
		Map<String, RoundOutcome> prevWins = rawPrevWins == null ? Map.of() : rawPrevWins;
		Map<String, RoundOutcome> currWins = current.getMap().getRoundWins();
		if (currWins == null || prevWins.size() >= currWins.size()) {
			return List.of();
		}

		List<GsiEvent> events = new ArrayList<>();
		for (var entry : currWins.entrySet()) {
			if (prevWins.containsKey(entry.getKey())) {
				continue;
			}
			events.add(detectOutcomeEvent(entry.getValue()));
		}
		return events;
	}

	private GsiEvent detectOutcomeEvent(RoundOutcome outcome) {
		return switch (outcome) {
			case CT_WIN_ELIMINATION -> new CtWinEliminationEvent();
			case T_WIN_ELIMINATION -> new TWinEliminationEvent();
			case CT_WIN_TIME -> new CtWinTimeEvent();
			case CT_WIN_DEFUSE -> new CtWinDefuseEvent();
			case T_WIN_BOMB -> new TWinBombEvent();
		};
	}

}
