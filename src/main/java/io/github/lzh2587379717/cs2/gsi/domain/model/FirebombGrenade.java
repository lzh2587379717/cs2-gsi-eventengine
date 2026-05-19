/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.GrenadeType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FirebombGrenade extends Grenade {

	private String position;
	private String velocity;

	public FirebombGrenade() {
		super(GrenadeType.FIREBOMB);
	}

}
