/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.service;

import io.github.lzh2587379717.cs2.gsi.domain.event.GsiEvent;
import io.github.lzh2587379717.cs2.gsi.domain.model.GameState;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class GsiChangeDetector {

	private final List<ChangeDetector> detectors;

	public GsiChangeDetector(List<ChangeDetector> detectors) {
		this.detectors = Objects.requireNonNull(detectors, "detectors must not be null");
	}

	public List<GsiEvent> detectChanges(@Nullable GameState previous, GameState current) {
		if (previous == null) {
			return List.of();
		}

		return detectors.stream()
				.flatMap(detector -> detector.detect(previous, current).stream())
				.toList();
	}

}
