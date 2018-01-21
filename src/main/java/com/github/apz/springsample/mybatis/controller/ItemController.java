/**
 *
 */
package com.github.apz.springsample.mybatis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.apz.springsample.mybatis.model.Item;
import com.github.apz.springsample.mybatis.model.ItemCondition;
import com.github.apz.springsample.mybatis.model.ItemPublish;
import com.github.apz.springsample.mybatis.model.TrueOrFalse;
import com.github.apz.springsample.mybatis.service.ItemService;

import lombok.RequiredArgsConstructor;

/**
 * 商品検索RestController。
 * @author A-pZ
 *
 */
@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

	private final ItemService service;

	@GetMapping("/list")
	public List<Item> searchItems(@RequestParam Optional<String> publish, @RequestParam Optional<String> display) {
		ItemCondition condition = ItemCondition.builder()
				.status(ItemPublish.getDisplayStatus(publish.orElse("")))
				.display(TrueOrFalse.getTrueOrFalse(display.orElse("")))
				.build();

		return service.selectItems(condition);
	}

}
