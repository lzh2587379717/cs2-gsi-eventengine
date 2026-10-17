/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service.detector;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.MapPhase;
import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.event.map.*;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;
import io.github.lzh2587379717.cs2.gsi.domain.service.ChangeDetector;

import java.util.ArrayList;
import java.util.List;

public class MapPhaseDetector implements ChangeDetector {

	@Override
	public List<GsiEvent> detect(GameState previous, GameState current) {
		if (current.getMap() == null || previous.getMap() == null) {
			return List.of();
		}

		MapPhase prev = previous.getMap().getPhase();
		MapPhase curr = current.getMap().getPhase();
		if (prev == null || curr == null || prev == curr) {
			return List.of();
		}

		List<GsiEvent> events = new ArrayList<>();
		events.add(new MapPhaseChangeEvent(prev, curr));

		if (curr == MapPhase.WARMUP) {
			events.add(new WarmupStartEvent());
		}
		if (prev == MapPhase.WARMUP && curr == MapPhase.LIVE) {
			events.add(new MatchStartEvent());
		}
		if (curr == MapPhase.INTERMISSION) {
			events.add(new IntermissionStartEvent());
		}
		if (prev == MapPhase.INTERMISSION) {
			events.add(new IntermissionEndEvent());
		}
		if (curr == MapPhase.GAMEOVER) {
			events.add(new MatchEndEvent());
		}

		return events;
	}

}
