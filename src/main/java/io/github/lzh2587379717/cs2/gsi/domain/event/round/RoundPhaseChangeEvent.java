/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.round;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundPhase;
import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class RoundPhaseChangeEvent extends AbstractGsiEvent {

	private final RoundPhase previousPhase;
	private final RoundPhase currentPhase;

	public RoundPhaseChangeEvent(RoundPhase previousPhase, RoundPhase currentPhase) {
		this.previousPhase = previousPhase;
		this.currentPhase = currentPhase;
	}

}
