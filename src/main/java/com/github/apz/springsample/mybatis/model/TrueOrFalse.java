/**
 *
 */
package com.github.apz.springsample.mybatis.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 真偽フラグ。
 * @author A-pZ
 *
 */
@Getter
@AllArgsConstructor
public enum TrueOrFalse {
	TRUE("1"), FALSE("0"), NONE("");

	private String value;

	public static TrueOrFalse getTrueOrFalse(String input) {
		return Arrays.asList(values()).stream()
				.filter(value -> value.getValue().equals(input))
				.findFirst().orElse(NONE);
	}
}
