/**
 *
 */
package com.github.apz.springsample.mybatis.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * 商品の検索条件。
 * @author A-pZ
 *
 */
@Builder
@ToString
@Getter
public class ItemCondition {
	private Integer id;
	private ItemPublish status;
	private TrueOrFalse display;
}
