/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.player;

import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class PlayerHealthChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final int previousHealth;
	private final int currentHealth;

	public PlayerHealthChangeEvent(String steamId, int previousHealth, int currentHealth) {
		this.steamId = steamId;
		this.previousHealth = previousHealth;
		this.currentHealth = currentHealth;
	}

}
