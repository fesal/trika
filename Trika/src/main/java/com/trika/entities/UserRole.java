package com.trika.entities;

public enum UserRole {
	ADMINISTRATOR, MANAGER, EMPLOYEE;
	
	public static UserRole getRoleByName(String nameRole){
		if(nameRole.equals(UserRole.ADMINISTRATOR.name())){
			return UserRole.ADMINISTRATOR;
		}else if(nameRole.equals(UserRole.MANAGER.name())){
			return UserRole.MANAGER;
		}else if(nameRole.equals(UserRole.EMPLOYEE.name())){
			return UserRole.EMPLOYEE;
		}
		return null;
	}
}
