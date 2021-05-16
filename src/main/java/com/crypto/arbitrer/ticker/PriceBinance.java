
package com.crypto.arbitrer.ticker;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "symbol",
    "price"
})
@Generated("jsonschema2pojo")
public class PriceBinance {

    @JsonProperty("symbol")
    private String symbol;
    
    @JsonProperty("price")
    private Double price;
   
 

    /**
     * No args constructor for use in serialization
     * 
     */
    public PriceBinance() {
    }

    /**
     * 
     * @param symbol
     * @param price
     */
    public PriceBinance(String symbol, Double price) {
        super();
        this.symbol = symbol;
        this.price = price;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

}
