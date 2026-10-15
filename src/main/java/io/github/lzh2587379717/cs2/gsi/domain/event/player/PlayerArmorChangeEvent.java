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
public class PlayerArmorChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final int previousArmor;
	private final int currentArmor;

	public PlayerArmorChangeEvent(String steamId, int previousArmor, int currentArmor) {
		this.steamId = steamId;
		this.previousArmor = previousArmor;
		this.currentArmor = currentArmor;
	}

}
