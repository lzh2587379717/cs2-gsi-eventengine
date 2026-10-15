/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.observer;

import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.jspecify.annotations.Nullable;

@Getter
@EqualsAndHashCode(callSuper = true)
public class SpectateTargetChangeEvent extends AbstractGsiEvent {

	private final @Nullable String previousTarget;
	private final @Nullable String currentTarget;

	public SpectateTargetChangeEvent(@Nullable String previousTarget, @Nullable String currentTarget) {
		this.previousTarget = previousTarget;
		this.currentTarget = currentTarget;
	}

}
