/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.GrenadeType;
import lombok.Data;

@Data
public abstract class Grenade {

	private String owner;
	private String lifetime;
	private GrenadeType type;

	protected Grenade(GrenadeType type) {
		this.type = type;
	}

}
