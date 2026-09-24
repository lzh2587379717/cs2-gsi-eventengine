/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GameStateErrorEntry implements ErrorEntry {

	GAME_STATE_PARSE_ERROR("GSI_ERROR_GAME_STATE_000", "gsi.error.game-state.parse-error"),
	MISSING_GAME_STATE("GSI_ERROR_GAME_STATE_001", "gsi.error.game-state.missing");

	private final String errorCode;
	private final String i18nKey;

}
