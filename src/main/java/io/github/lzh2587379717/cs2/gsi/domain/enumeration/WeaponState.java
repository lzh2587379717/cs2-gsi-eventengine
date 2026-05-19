/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WeaponState {

	@JsonProperty("active") ACTIVE,
	@JsonProperty("holstered") HOLSTERED,
	@JsonProperty("reloading") RELOADING

}
