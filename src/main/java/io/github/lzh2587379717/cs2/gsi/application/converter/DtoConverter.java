/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.application.converter;

public interface DtoConverter<D, E> {

	E toDomain(D dto);

}
