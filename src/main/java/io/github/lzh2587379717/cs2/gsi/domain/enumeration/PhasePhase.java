/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PhasePhase {

	@JsonProperty("freezetime") FREEZETIME,
	@JsonProperty("bomb") BOMB,
	@JsonProperty("warmup") WARMUP,
	@JsonProperty("live") LIVE,
	@JsonProperty("over") OVER,
	@JsonProperty("defuse") DEFUSE,
	@JsonProperty("paused") PAUSED,
	@JsonProperty("timeout_ct") TIMEOUT_CT,
	@JsonProperty("timeout_t") TIMEOUT_T

}
