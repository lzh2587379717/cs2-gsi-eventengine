/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.map;

import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class CtScoreEvent extends AbstractGsiEvent {

	private final int previousScore;
	private final int currentScore;

	public CtScoreEvent(int previousScore, int currentScore) {
		this.previousScore = previousScore;
		this.currentScore = currentScore;
	}

}
