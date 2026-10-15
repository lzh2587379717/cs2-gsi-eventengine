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
public class PlayerHelmetChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final boolean previousHelmet;
	private final boolean currentHelmet;

	public PlayerHelmetChangeEvent(String steamId, boolean previousHelmet, boolean currentHelmet) {
		this.steamId = steamId;
		this.previousHelmet = previousHelmet;
		this.currentHelmet = currentHelmet;
	}

}
