/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service.detector;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundPhase;
import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.FreezeTimeStartEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.RoundEndEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.RoundPhaseChangeEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.round.RoundStartEvent;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;
import io.github.lzh2587379717.cs2.gsi.domain.service.ChangeDetector;

import java.util.ArrayList;
import java.util.List;

public class RoundPhaseDetector implements ChangeDetector {

	@Override
	public List<GsiEvent> detect(GameState previous, GameState current) {
		if (current.getRound() == null || previous.getRound() == null) {
			return List.of();
		}

		RoundPhase prev = previous.getRound().getPhase();
		RoundPhase curr = current.getRound().getPhase();
		if (prev == null || curr == null || prev == curr) {
			return List.of();
		}

		List<GsiEvent> events = new ArrayList<>();
		events.add(new RoundPhaseChangeEvent(prev, curr));

		if (curr == RoundPhase.FREEZETIME) {
			events.add(new FreezeTimeStartEvent());
		}
		if (curr == RoundPhase.LIVE) {
			events.add(new RoundStartEvent());
		}
		if (curr == RoundPhase.OVER) {
			events.add(new RoundEndEvent());
		}

		return events;
	}

}
