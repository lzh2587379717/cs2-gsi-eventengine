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
public enum SystemErrorEntry implements ErrorEntry {

	I18N_KEY_NOT_CONFIGURED("GSI_ERROR_SYSTEM_000", "gsi.error.system.i18n-key-not-configured");

	private final String errorCode;
	private final String i18nKey;

}
