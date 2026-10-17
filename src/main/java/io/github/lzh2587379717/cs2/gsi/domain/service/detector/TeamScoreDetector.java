/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service.detector;

import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.map.CtScoreEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.map.TScoreEvent;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;
import io.github.lzh2587379717.cs2.gsi.domain.service.ChangeDetector;

import java.util.ArrayList;
import java.util.List;

public class TeamScoreDetector implements ChangeDetector {

	@Override
	public List<GsiEvent> detect(GameState previous, GameState current) {
		if (current.getMap() == null || previous.getMap() == null) {
			return List.of();
		}

		int prevCt = previous.getMap().getTeamCt().getScore();
		int currCt = current.getMap().getTeamCt().getScore();
		int prevT = previous.getMap().getTeamT().getScore();
		int currT = current.getMap().getTeamT().getScore();

		List<GsiEvent> events = new ArrayList<>();
		if (currCt != prevCt) {
			events.add(new CtScoreEvent(prevCt, currCt));
		}
		if (currT != prevT) {
			events.add(new TScoreEvent(prevT, currT));
		}

		return events;
	}

}
