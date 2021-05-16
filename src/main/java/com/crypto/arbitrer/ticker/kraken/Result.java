package com.crypto.arbitrer.ticker.kraken;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"XXBTZUSD"
})
@Generated("jsonschema2pojo")
public class Result {

	@JsonProperty("XXBTZUSD")
	private Xxbtzusd xxbtzusd;
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public Result() {
	}
	
	/**
	*
	* @param xxbtzusd
	*/
	public Result(Xxbtzusd xxbtzusd) {
		super();
		this.xxbtzusd = xxbtzusd;
	}
	
	@JsonProperty("XXBTZUSD")
	public Xxbtzusd getXxbtzusd() {
		return xxbtzusd;
	}
	
	@JsonProperty("XXBTZUSD")
	public void setXxbtzusd(Xxbtzusd xxbtzusd) {
		this.xxbtzusd = xxbtzusd;
	}

}

