/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.grenade;

import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class InfernoSpreadEvent extends AbstractGsiEvent {

	private final String owner;
	private final String grenadeId;

	public InfernoSpreadEvent(String owner, String grenadeId) {
		this.owner = owner;
		this.grenadeId = grenadeId;
	}

}
