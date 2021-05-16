
package com.crypto.arbitrer.ticker.coinbase;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base",
    "currency",
    "amount"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("base")
    private String base;
    
    @JsonProperty("currency")
    private String currency;
    
    @JsonProperty("amount")
    private Double amount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param amount
     * @param currency
     * @param base
     */
    public Data(String base, String currency, Double amount) {
        super();
        this.base = base;
        this.currency = currency;
        this.amount = amount;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
