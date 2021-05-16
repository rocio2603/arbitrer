package com.crypto.arbitrer.ticker.kraken;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"error",
"result"
})
@Generated("jsonschema2pojo")
public class PriceKraken {

@JsonProperty("error")
private List<Object> error = null;
@JsonProperty("result")
private Result result;

/**
* No args constructor for use in serialization
*
*/
public PriceKraken() {
}

/**
*
* @param result
* @param error
*/
public PriceKraken(List<Object> error, Result result) {
super();
this.error = error;
this.result = result;
}

@JsonProperty("error")
public List<Object> getError() {
return error;
}

@JsonProperty("error")
public void setError(List<Object> error) {
this.error = error;
}

@JsonProperty("result")
public Result getResult() {
return result;
}

@JsonProperty("result")
public void setResult(Result result) {
this.result = result;
}

}


