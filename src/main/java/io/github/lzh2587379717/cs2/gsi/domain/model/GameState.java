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
public class GameState {

	private Provider provider;
	private Auth auth;

	private Map map;
	private Round round;
	@JsonProperty("phase_countdowns")
	private Phase phaseCountdowns;

	private PlayerObserved player;
	private Bomb bomb;

	@JsonProperty("allplayers")
	private java.util.Map<String, Player> allPlayers;
	private java.util.Map<String, Grenade> grenades;

	private GameState previously;

}
