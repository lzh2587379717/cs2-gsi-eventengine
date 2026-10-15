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
public class PlayerRoundKillsChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final int previousKills;
	private final int currentKills;

	public PlayerRoundKillsChangeEvent(String steamId, int previousKills, int currentKills) {
		this.steamId = steamId;
		this.previousKills = previousKills;
		this.currentKills = currentKills;
	}

}
