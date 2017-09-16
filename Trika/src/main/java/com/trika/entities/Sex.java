package com.trika.entities;

public enum Sex {
	MALE, FEMALE;
	
	public static Sex getSex(String sex){
		if(sex.equalsIgnoreCase(Sex.MALE.name())){
			return Sex.MALE;
		}else if(sex.equalsIgnoreCase(Sex.FEMALE.name())){
			return Sex.FEMALE;
		}
		return null;
	}
}
