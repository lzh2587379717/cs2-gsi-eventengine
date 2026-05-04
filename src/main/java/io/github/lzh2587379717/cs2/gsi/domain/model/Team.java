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
public class Team {

	private int score;
	@JsonProperty("consecutive_round_losses")
	private int consecutiveRoundLosses;
	@JsonProperty("timeouts_remaining")
	private int timeoutsRemaining;
	@JsonProperty("matches_won_this_series")
	private int matchesWonThisSeries;

	private String name;
	private String flag;

}
