/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.player;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.Side;
import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class PlayerTeamChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final Side previousTeam;
	private final Side currentTeam;

	public PlayerTeamChangeEvent(String steamId, Side previousTeam, Side currentTeam) {
		this.steamId = steamId;
		this.previousTeam = previousTeam;
		this.currentTeam = currentTeam;
	}

}
