package com.crypto.arbitrer.ticker.okex;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"instType",
"instId",
"last",
"lastSz",
"askPx",
"askSz",
"bidPx",
"bidSz",
"open24h",
"high24h",
"low24h",
"volCcy24h",
"vol24h",
"ts",
"sodUtc0",
"sodUtc8"
})
@Generated("jsonschema2pojo")
public class Datum {

	@JsonProperty("instType")
	private String instType;
	@JsonProperty("instId")
	private String instId;
	@JsonProperty("last")
	private String last;
	@JsonProperty("lastSz")
	private String lastSz;
	@JsonProperty("askPx")
	private String askPx;
	@JsonProperty("askSz")
	private String askSz;
	@JsonProperty("bidPx")
	private String bidPx;
	@JsonProperty("bidSz")
	private String bidSz;
	@JsonProperty("open24h")
	private String open24h;
	@JsonProperty("high24h")
	private String high24h;
	@JsonProperty("low24h")
	private String low24h;
	@JsonProperty("volCcy24h")
	private String volCcy24h;
	@JsonProperty("vol24h")
	private String vol24h;
	@JsonProperty("ts")
	private String ts;
	@JsonProperty("sodUtc0")
	private String sodUtc0;
	@JsonProperty("sodUtc8")
	private String sodUtc8;
	
	@JsonProperty("instType")
	public String getInstType() {
		return instType;
	}
	
	@JsonProperty("instType")
	public void setInstType(String instType) {
		this.instType = instType;
	}
	
	@JsonProperty("instId")
	public String getInstId() {
		return instId;
	}
	
	@JsonProperty("instId")
	public void setInstId(String instId) {
		this.instId = instId;
	}
	
	@JsonProperty("last")
	public String getLast() {
		return last;
	}
	
	@JsonProperty("last")
	public void setLast(String last) {
		this.last = last;
	}
	
	@JsonProperty("lastSz")
	public String getLastSz() {
		return lastSz;
	}
	
	@JsonProperty("lastSz")
	public void setLastSz(String lastSz) {
		this.lastSz = lastSz;
	}
	
	@JsonProperty("askPx")
	public String getAskPx() {
		return askPx;
	}
	
	@JsonProperty("askPx")
	public void setAskPx(String askPx) {
		this.askPx = askPx;
	}
	
	@JsonProperty("askSz")
	public String getAskSz() {
		return askSz;
	}
	
	@JsonProperty("askSz")
	public void setAskSz(String askSz) {
		this.askSz = askSz;
	}
	
	@JsonProperty("bidPx")
	public String getBidPx() {
		return bidPx;
	}
	
	@JsonProperty("bidPx")
	public void setBidPx(String bidPx) {
		this.bidPx = bidPx;
	}
	
	@JsonProperty("bidSz")
	public String getBidSz() {
		return bidSz;
	}
	
	@JsonProperty("bidSz")
	public void setBidSz(String bidSz) {
		this.bidSz = bidSz;
	}
	
	@JsonProperty("open24h")
	public String getOpen24h() {
		return open24h;
	}
	
	@JsonProperty("open24h")
	public void setOpen24h(String open24h) {
		this.open24h = open24h;
	}
	
	@JsonProperty("high24h")
	public String getHigh24h() {
		return high24h;
	}
	
	@JsonProperty("high24h")
	public void setHigh24h(String high24h) {
		this.high24h = high24h;
	}
	
	@JsonProperty("low24h")
	public String getLow24h() {
		return low24h;
	}
	
	@JsonProperty("low24h")
	public void setLow24h(String low24h) {
		this.low24h = low24h;
	}
	
	@JsonProperty("volCcy24h")
	public String getVolCcy24h() {
		return volCcy24h;
	}
	
	@JsonProperty("volCcy24h")
	public void setVolCcy24h(String volCcy24h) {
		this.volCcy24h = volCcy24h;
	}
	
	@JsonProperty("vol24h")
	public String getVol24h() {
		return vol24h;
	}
	
	@JsonProperty("vol24h")
	public void setVol24h(String vol24h) {
		this.vol24h = vol24h;
	}
	
	@JsonProperty("ts")
	public String getTs() {
		return ts;
	}
	
	@JsonProperty("ts")
	public void setTs(String ts) {
		this.ts = ts;
	}
	
	@JsonProperty("sodUtc0")
	public String getSodUtc0() {
		return sodUtc0;
	}
	
	@JsonProperty("sodUtc0")
	public void setSodUtc0(String sodUtc0) {
		this.sodUtc0 = sodUtc0;
	}
	
	@JsonProperty("sodUtc8")
	public String getSodUtc8() {
		return sodUtc8;
	}
	
	@JsonProperty("sodUtc8")
	public void setSodUtc8(String sodUtc8) {
		this.sodUtc8 = sodUtc8;
	}

}
