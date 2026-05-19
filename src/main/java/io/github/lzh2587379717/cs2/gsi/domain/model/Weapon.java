/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.WeaponState;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.WeaponType;
import lombok.Data;

@Data
public class Weapon {

	private String name;
	private String paintkit;
	private WeaponType type;
	private WeaponState state;

	@JsonProperty("ammo_clip")
	private Integer ammoClip;
	@JsonProperty("ammo_clip_max")
	private Integer ammoClipMax;
	@JsonProperty("ammo_reserve")
	private Integer ammoReserve;

}
