package com.trika.controller;

import com.trika.util.JsonUtil;

public abstract class BaseAbstractController {

	
	protected String getJSON(Object object){
			return JsonUtil.getJSON(object);
	}
}
