package com.crypto.arbitrer.ticker;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PriceBitfinex{
    @JsonProperty("MyArray") 
    public List<List<Object>> myArray;
}