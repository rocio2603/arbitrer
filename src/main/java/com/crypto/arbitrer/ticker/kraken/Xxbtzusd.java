package com.crypto.arbitrer.ticker.kraken;

import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"a",
"b",
"c",
"v",
"p",
"t",
"l",
"h",
"o"
})
@Generated("jsonschema2pojo")
public class Xxbtzusd {

	@JsonProperty("a")
	private List<String> a = null;
	@JsonProperty("b")
	private List<String> b = null;
	@JsonProperty("c")
	private List<String> c = null;
	@JsonProperty("v")
	private List<String> v = null;
	@JsonProperty("p")
	private List<String> p = null;
	@JsonProperty("t")
	private List<Integer> t = null;
	@JsonProperty("l")
	private List<String> l = null;
	@JsonProperty("h")
	private List<String> h = null;
	@JsonProperty("o")
	private String o;
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public Xxbtzusd() {
	}
	
	/**
	*
	* @param p
	* @param a
	* @param b
	* @param c
	* @param t
	* @param v
	* @param h
	* @param l
	* @param o
	*/
	public Xxbtzusd(List<String> a, List<String> b, List<String> c, List<String> v, List<String> p, List<Integer> t, List<String> l, List<String> h, String o) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.v = v;
		this.p = p;
		this.t = t;
		this.l = l;
		this.h = h;
		this.o = o;
	}
	
	@JsonProperty("a")
	public List<String> getA() {
		return a;
	}
	
	@JsonProperty("a")
	public void setA(List<String> a) {
		this.a = a;
	}
	
	@JsonProperty("b")
	public List<String> getB() {
		return b;
	}
	
	@JsonProperty("b")
	public void setB(List<String> b) {
		this.b = b;
	}
	
	@JsonProperty("c")
	public List<String> getC() {
		return c;
	}
	
	@JsonProperty("c")
	public void setC(List<String> c) {
		this.c = c;
	}
	
	@JsonProperty("v")
	public List<String> getV() {
		return v;
	}
	
	@JsonProperty("v")
	public void setV(List<String> v) {
		this.v = v;
	}
	
	@JsonProperty("p")
	public List<String> getP() {
		return p;
	}
	
	@JsonProperty("p")
	public void setP(List<String> p) {
		this.p = p;
	}
	
	@JsonProperty("t")
	public List<Integer> getT() {
		return t;
	}
	
	@JsonProperty("t")
	public void setT(List<Integer> t) {
		this.t = t;
	}
	
	@JsonProperty("l")
	public List<String> getL() {
		return l;
	}
	
	@JsonProperty("l")
	public void setL(List<String> l) {
		this.l = l;
	}
	
	@JsonProperty("h")
	public List<String> getH() {
		return h;
	}
	
	@JsonProperty("h")
	public void setH(List<String> h) {
		this.h = h;
	}
	
	@JsonProperty("o")
	public String getO() {
		return o;
	}
	
	@JsonProperty("o")
	public void setO(String o) {
		this.o = o;
	}

}