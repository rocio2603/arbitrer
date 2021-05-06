
package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "symbol",
    "lastTradeRate",
    "bidRate",
    "askRate"
})
@Generated("jsonschema2pojo")
public class PriceBittrex {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("lastTradeRate")
    private Double lastTradeRate;
    @JsonProperty("bidRate")
    private String bidRate;
    @JsonProperty("askRate")
    private String askRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceBittrex() {
    }

    /**
     * 
     * @param symbol
     * @param lastTradeRate
     * @param bidRate
     * @param askRate
     */
    public PriceBittrex(String symbol, Double lastTradeRate, String bidRate, String askRate) {
        super();
        this.symbol = symbol;
        this.lastTradeRate = lastTradeRate;
        this.bidRate = bidRate;
        this.askRate = askRate;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("lastTradeRate")
    public Double getLastTradeRate() {
        return lastTradeRate;
    }

    @JsonProperty("lastTradeRate")
    public void setLastTradeRate(Double lastTradeRate) {
        this.lastTradeRate = lastTradeRate;
    }

    @JsonProperty("bidRate")
    public String getBidRate() {
        return bidRate;
    }

    @JsonProperty("bidRate")
    public void setBidRate(String bidRate) {
        this.bidRate = bidRate;
    }


    @JsonProperty("askRate")
    public String getAskRate() {
        return askRate;
    }

    @JsonProperty("askRate")
    public void setAskRate(String askRate) {
        this.askRate = askRate;
    }
}
