/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RoundOutcome {

	@JsonProperty("ct_win_elimination") CT_WIN_ELIMINATION,
	@JsonProperty("t_win_elimination") T_WIN_ELIMINATION,
	@JsonProperty("ct_win_time") CT_WIN_TIME,
	@JsonProperty("ct_win_defuse") CT_WIN_DEFUSE,
	@JsonProperty("t_win_bomb") T_WIN_BOMB

}
