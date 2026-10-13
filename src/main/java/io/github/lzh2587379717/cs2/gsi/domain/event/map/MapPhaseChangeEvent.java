/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.map;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.MapPhase;
import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class MapPhaseChangeEvent extends AbstractGsiEvent {

	private final MapPhase previousPhase;
	private final MapPhase currentPhase;

	public MapPhaseChangeEvent(MapPhase previousPhase, MapPhase currentPhase) {
		this.previousPhase = previousPhase;
		this.currentPhase = currentPhase;
	}

}
