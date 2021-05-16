
package com.crypto.arbitrer.ticker.coinbase;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})
@Generated("jsonschema2pojo")
public class PriceCoinbase {

    @JsonProperty("data")
    private Data data;

    /**
     * No args constructor for use in serialization
     * 
     */
    
    public PriceCoinbase() {
    }

    /**
     * 
     * @param data
     */
    public PriceCoinbase(Data data) {
        super();
        this.data = data;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }


}
