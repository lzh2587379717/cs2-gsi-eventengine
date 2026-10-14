/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.bomb;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.BombState;
import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class BombStateChangeEvent extends AbstractGsiEvent {

	private final BombState previousState;
	private final BombState currentState;

	public BombStateChangeEvent(BombState previousState, BombState currentState) {
		this.previousState = previousState;
		this.currentState = currentState;
	}

}
