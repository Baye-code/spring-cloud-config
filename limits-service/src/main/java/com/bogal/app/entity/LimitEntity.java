package com.bogal.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


public class LimitEntity {
	
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
		
	public LimitEntity() {
	}
	
	public LimitEntity(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	@Override
	public String toString() {
		return "LimitEntity [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	

}
