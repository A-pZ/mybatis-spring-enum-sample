/**
 *
 */
package com.github.apz.springsample.mybatis.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品表示ステータス。
 * @author A-pZ
 *
 */
@Getter
@AllArgsConstructor
public enum ItemPublish {
	NONE("0"), PUBLISH("1"), MEMBER_ONLY("2"), NO_VALUE("");

	private String value;

	public static ItemPublish getDisplayStatus(String value) {
		return Arrays.stream(values())
				.filter(v -> v.getValue().equals(value))
				.findFirst()
				.orElse(NO_VALUE);
	}
}
