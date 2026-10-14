/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.phase;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.PhasePhase;
import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class PhaseCountdownChangeEvent extends AbstractGsiEvent {

	private final PhasePhase previousPhase;
	private final PhasePhase currentPhase;

	public PhaseCountdownChangeEvent(PhasePhase previousPhase, PhasePhase currentPhase) {
		this.previousPhase = previousPhase;
		this.currentPhase = currentPhase;
	}

}
