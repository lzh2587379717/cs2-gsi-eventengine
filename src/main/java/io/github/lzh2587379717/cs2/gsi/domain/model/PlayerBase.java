/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.lzh2587379717.cs2.gsi.domain.enumeration.Side;
import lombok.Data;

@Data
public class PlayerBase {

	private String steamid;
	private String name;
	private String clan;

	@JsonProperty("observer_slot")
	private Integer observerSlot;

	private Side team;
	private PlayerState state;

	private String position;
	private String forward;

}
