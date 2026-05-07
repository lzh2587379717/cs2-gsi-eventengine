/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import io.github.lzh2587379717.cs2.gsi.domain.enumeration.BombState;
import lombok.Data;

@Data
public class Bomb {

	private BombState state;
	private String countdown;
	private String player;
	private String position;

}
