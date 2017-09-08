package com.toyo.operation.history.model;

import io.swagger.annotations.ApiModelProperty;

public class SynthesisStatusModel {
	
	@ApiModelProperty(required = true)
	public String item;
	@ApiModelProperty(required = true)
	public String tag;
	@ApiModelProperty(required = true)
	public String UOM;
	
	@ApiModelProperty(required = true)
	public float[] pastValues;	
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}	

	public float[] getPastValues() {
		return pastValues;
	}

	public void setPastValues(float[] pastValues) {
		this.pastValues = pastValues;
	}

	
	
	
	
	
}


