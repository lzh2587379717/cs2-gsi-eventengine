/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.event.weapon;

import io.github.lzh2587379717.cs2.gsi.domain.event.AbstractGsiEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.jspecify.annotations.Nullable;

@Getter
@EqualsAndHashCode(callSuper = true)
public class AmmoReserveChangeEvent extends AbstractGsiEvent {

	private final String steamId;
	private final String weaponName;
	private final @Nullable Integer previousAmmoReserve;
	private final @Nullable Integer currentAmmoReserve;

	public AmmoReserveChangeEvent(String steamId, String weaponName, @Nullable Integer previousAmmoReserve,
								  @Nullable Integer currentAmmoReserve) {
		this.steamId = steamId;
		this.weaponName = weaponName;
		this.previousAmmoReserve = previousAmmoReserve;
		this.currentAmmoReserve = currentAmmoReserve;
	}

}
