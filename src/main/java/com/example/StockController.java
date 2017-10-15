package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@GetMapping("/stocks")
	@CrossOrigin
	public List<Stock> getStocks() {
		List<Stock> stockList = new ArrayList<Stock>();
		stockList.add(new Stock("Google Inc", "GOOGLE", 13.34));
		stockList.add(new Stock("Facebook Inc", "FB", 62.72));
		stockList.add(new Stock("Apple Inc", "APPLE", 20.34));
		return stockList;
	}
}

class Stock {

	private String name;
	private String symbol;
	private Double price;

	public Stock() {
	}

	public Stock(String name, String symbol, Double price) {
		this.name = name;
		this.symbol = symbol;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
