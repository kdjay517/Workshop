package com.bridgelabz.demo;

import java.util.*;

public class SweetStore {

	private List<Sweet> sweetList = new ArrayList();
	
	public void add(Sweet sweet) {
		sweetList.add(sweet);
	}
	
	public List getList() {
		return sweetList;
	}
	
	public void deleteSweet(Sweet sweet) {
		sweetList.remove(sweet);
	}
	
	public Sweet getSweet(String name) {
		for (Sweet sweet : sweetList) {
			if (sweet.name.equals(name)) {
			return sweet;
			}
			
		}
		return null;
	}




}
