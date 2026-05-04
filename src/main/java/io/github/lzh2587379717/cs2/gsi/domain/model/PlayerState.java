/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlayerState {

	private int health;
	private int armor;
	private boolean helmet;
	private int flashed;
	private int smoked;
	private int burning;
	private int money;

	@JsonProperty("round_kills")
	private int roundKills;
	@JsonProperty("round_killhs")
	private int roundKillhs;
	@JsonProperty("round_totaldmg")
	private int roundTotalDmg;
	@JsonProperty("equip_value")
	private int equipValue;

	private boolean defusekit;

}
