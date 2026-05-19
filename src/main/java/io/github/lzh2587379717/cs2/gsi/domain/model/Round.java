/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundBomb;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.RoundPhase;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.Side;
import lombok.Data;

@Data
public class Round {

	private RoundPhase phase;
	private RoundBomb bomb;

	@JsonProperty("win_team")
	private Side winTeam;

}
