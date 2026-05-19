/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.PhasePhase;
import lombok.Data;

@Data
public class Phase {

	private PhasePhase phase;

	@JsonProperty("phase_ends_in")
	private String phaseEndsIn;

}
