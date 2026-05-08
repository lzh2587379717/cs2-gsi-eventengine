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

import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public class InfernoGrenade extends Grenade {

	private Map<String, String> flames;

	public InfernoGrenade() {
		super(GrenadeType.INFERNO);
	}

}
