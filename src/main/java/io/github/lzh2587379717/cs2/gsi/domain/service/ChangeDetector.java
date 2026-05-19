/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service;

import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;

import java.util.List;

public interface ChangeDetector {

	List<GsiEvent> detect(GameState previous, GameState current);

}
