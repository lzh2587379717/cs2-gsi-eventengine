/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class AbstractGsiEvent implements GsiEvent {

	private final String id;
	private final long timestamp;

	protected AbstractGsiEvent() {
		this.id = UUID.randomUUID().toString();
		this.timestamp = System.currentTimeMillis();
	}

}
