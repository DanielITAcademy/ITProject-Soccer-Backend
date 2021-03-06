package com.itacademy.soccer.controller.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itacademy.soccer.dto.Player;
import com.itacademy.soccer.dto.Sale;

public class SaleJson {

	private Long id;
	
	private Date limit_date;
	
	private float initial_price;
	
	private Long player_id;
	
	public SaleJson(){
		
	}
	
	public SaleJson(Long id, Date limit_date, float initial_price, Long player_id) {
		this.id = id;
		this.limit_date = limit_date;
		this.initial_price = initial_price;
		this.player_id = player_id;
	}

	public Sale setJsonToObject() {
		
		Sale sale = new Sale();
		
		sale.setId(this.id);
		sale.setLimitDate(this.limit_date);
		sale.setInitialPrice(this.initial_price);
		
		Player player = new Player();
		player.setId(this.player_id);
		sale.setPlayer(player);
		
		return sale;
	}
	
	public static SaleJson parseObjectToJson(Sale sale) {
		
		SaleJson json = new SaleJson();
		
		json.setId(sale.getId());
		json.setInitial_price(sale.getInitialPrice());
		json.setLimit_date(sale.getLimitDate());
		json.setPlayer_id(sale.getPlayer().getId());
		
		return json;
	}
	
	public static List<SaleJson> parseListToJson(List<Sale> salesList) {
		
		List<SaleJson> jsonList = new ArrayList<>();
		
		for (Sale s : salesList) {
			SaleJson json = parseObjectToJson(s);
			jsonList.add(json);
		}
		
		return jsonList;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLimit_date() {
		return limit_date;
	}

	public void setLimit_date(Date limit_date) {
		this.limit_date = limit_date;
	}

	public float getInitial_price() {
		return initial_price;
	}

	public void setInitial_price(float initial_price) {
		this.initial_price = initial_price;
	}

	public Long getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Long player_id) {
		this.player_id = player_id;
	}
	
}
