/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.MapPhase;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundOutcome;
import lombok.Data;

@Data
public class Map {

	private String mode;
	private String name;
	private MapPhase phase;
	private int round;

	@JsonProperty("team_ct")
	private Team teamCt;

	@JsonProperty("team_t")
	private Team teamT;

	@JsonProperty("num_matches_to_win_series")
	private int numMatchesToWinSeries;

	@JsonProperty("current_spectators")
	private int currentSpectators;

	@JsonProperty("souvenirs_total")
	private int souvenirsTotal;

	@JsonProperty("round_wins")
	private java.util.Map<String, RoundOutcome> roundWins;

}
