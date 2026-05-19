/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WeaponType {

	@JsonProperty("Knife") KNIFE,
	@JsonProperty("Pistol") PISTOL,
	@JsonProperty("Rifle") RIFLE,
	@JsonProperty("SniperRifle") SNIPER_RIFLE,
	@JsonProperty("Submachine Gun") SUBMACHINE_GUN,
	@JsonProperty("Shotgun") SHOTGUN,
	@JsonProperty("Machine Gun") MACHINE_GUN,
	@JsonProperty("Grenade") GRENADE,
	C4

}
