/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.model;

import lombok.Data;

@Data
public class Provider {

	private String name;
	private int appid;
	private int version;
	private String steamid;
	private long timestamp;

}
