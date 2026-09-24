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
public enum EventErrorEntry implements ErrorEntry {

	EVENT_PUBLISH_FAILED("GSI_ERROR_EVENT_000", "gsi.error.event.publish-failed"),
	EVENT_PROCESSING_FAILED("GSI_ERROR_EVENT_001", "gsi.error.event.processing-failed"),
	EVENT_LISTENER_ERROR("GSI_ERROR_EVENT_002", "gsi.error.event.listener-error");

	private final String errorCode;
	private final String i18nKey;

}
