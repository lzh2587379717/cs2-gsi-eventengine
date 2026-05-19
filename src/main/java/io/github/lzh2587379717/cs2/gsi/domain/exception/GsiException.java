/*
 * Copyright (c) 2026 LZH
 *
 * Licensed under the MIT License.
 * See LICENSE file in the project root for full license information.
 */

package io.github.lzh2587379717.cs2.gsi.domain.exception;

import lombok.Getter;
import org.jspecify.annotations.Nullable;

import java.util.Objects;

@Getter
public class GsiException extends RuntimeException {

	private static final Object[] EMPTY_ARGS = new Object[0];

	private final ErrorEntry errorEntry;
	private final Object @Nullable [] args;

	private GsiException(ErrorEntry errorEntry, Object @Nullable [] args, @Nullable Throwable cause) {
		super(String.format("GSI error: [%s]", errorEntry.getErrorCode()), cause);
		this.errorEntry = errorEntry;
		this.args = args != null ? args : EMPTY_ARGS;
	}

	public static Builder builder(ErrorEntry errorEntry) {
		return new Builder(errorEntry);
	}

	public static class Builder {

		private final ErrorEntry errorEntry;
		private @Nullable Throwable cause;
		private Object @Nullable [] args;

		private Builder(ErrorEntry errorEntry) {
			this.errorEntry = Objects.requireNonNull(errorEntry, "errorEntry must not be null");
		}

		public Builder cause(@Nullable Throwable cause) {
			this.cause = cause;
			return this;
		}

		public Builder args(Object @Nullable ... args) {
			this.args = args;
			return this;
		}

		public GsiException build() {
			return new GsiException(errorEntry, args, cause);
		}

	}

}
