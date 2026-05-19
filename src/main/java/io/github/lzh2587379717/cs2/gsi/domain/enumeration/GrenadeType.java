/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GrenadeType {

	@JsonProperty("decoy") DECOY,
	@JsonProperty("smoke") SMOKE,
	@JsonProperty("frag") FRAG,
	@JsonProperty("firebomb") FIREBOMB,
	@JsonProperty("flashbang") FLASHBANG,
	@JsonProperty("inferno") INFERNO

}
