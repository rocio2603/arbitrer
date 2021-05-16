package com.crypto.arbitrer.ticker.poloniex;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "USDT_BTC"
})
@Generated("jsonschema2pojo")
public class PricePoloniex {

    @JsonProperty("USDT_BTC")
    private UsdtBtc usdtBtc;
    
    @JsonProperty("USDT_ETH")
    private UsdtBtc usdtEth;

    @JsonProperty("USDT_BTC")
    public UsdtBtc getUsdtBtc() {
        return usdtBtc;
    }

    @JsonProperty("USDT_BTC")
    public void setUsdtBtc(UsdtBtc usdtBtc) {
        this.usdtBtc = usdtBtc;
    }

}