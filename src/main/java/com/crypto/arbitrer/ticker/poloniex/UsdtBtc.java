package com.crypto.arbitrer.ticker.poloniex;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "last",
    "lowestAsk",
    "highestBid",
    "percentChange",
    "baseVolume",
    "quoteVolume",
    "isFrozen",
    "postOnly",
    "high24hr",
    "low24hr"
})
@Generated("jsonschema2pojo")
public class UsdtBtc {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("last")
    private String last;
    @JsonProperty("lowestAsk")
    private String lowestAsk;
    @JsonProperty("highestBid")
    private String highestBid;
    @JsonProperty("percentChange")
    private String percentChange;
    @JsonProperty("baseVolume")
    private String baseVolume;
    @JsonProperty("quoteVolume")
    private String quoteVolume;
    @JsonProperty("isFrozen")
    private String isFrozen;
    @JsonProperty("postOnly")
    private String postOnly;
    @JsonProperty("high24hr")
    private String high24hr;
    @JsonProperty("low24hr")
    private String low24hr;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }

    @JsonProperty("lowestAsk")
    public String getLowestAsk() {
        return lowestAsk;
    }

    @JsonProperty("lowestAsk")
    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    @JsonProperty("highestBid")
    public String getHighestBid() {
        return highestBid;
    }

    @JsonProperty("highestBid")
    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    @JsonProperty("percentChange")
    public String getPercentChange() {
        return percentChange;
    }

    @JsonProperty("percentChange")
    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    @JsonProperty("baseVolume")
    public String getBaseVolume() {
        return baseVolume;
    }

    @JsonProperty("baseVolume")
    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("quoteVolume")
    public String getQuoteVolume() {
        return quoteVolume;
    }

    @JsonProperty("quoteVolume")
    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    @JsonProperty("isFrozen")
    public String getIsFrozen() {
        return isFrozen;
    }

    @JsonProperty("isFrozen")
    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    @JsonProperty("postOnly")
    public String getPostOnly() {
        return postOnly;
    }

    @JsonProperty("postOnly")
    public void setPostOnly(String postOnly) {
        this.postOnly = postOnly;
    }

    @JsonProperty("high24hr")
    public String getHigh24hr() {
        return high24hr;
    }

    @JsonProperty("high24hr")
    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    @JsonProperty("low24hr")
    public String getLow24hr() {
        return low24hr;
    }

    @JsonProperty("low24hr")
    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }

}