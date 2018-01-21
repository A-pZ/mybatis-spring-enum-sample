/**
 *
 */
package com.github.apz.springsample.mybatis.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品テーブル(Item)の1レコード。
 * @author A-pZ
 *
 */
@Getter @Setter
public class Item {
	private Integer id;
	private String name;
	private ItemPublish status;
	private TrueOrFalse display;
}
