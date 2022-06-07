package com.topekox.retrofit.hookbin;

import lombok.Data;

/**
 * https://lookup.binlist.net/45717360
 */

@Data
public class CreditCardBin {
	
	private String scheme;
	
	private String type;
	
	private String brand;
	
	private boolean prepaid;
	
	private Number number;
	
	private Country country;
	
	private Bank bank;
	
	@Data
	public static class Number {
		
		private int length;
		
		private boolean luhn;
		
	}
	
	@Data
	public static class Country {
		
		private String numeric;
		
		private String alpha2;
		
		private String name;
		
		private String emoji;
		
		private String currency;
		
		private int latitude;
		
		private int longitude;
	}
	
	@Data
	public static class Bank {
		
		private String name;
		
		private String url;
		
		private String phone;
		
		private String city;
		
	}
	
}
