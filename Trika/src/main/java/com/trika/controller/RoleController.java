package com.trika.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trika.data.RoleDTO;
import com.trika.services.RoleService;
import com.trika.util.JsonUtil;

@RestController
@RequestMapping(value="/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/new")
	public String addNewRole(@RequestBody RoleDTO roleDTO, BindingResult bindingResult) throws IOException
	{
		return JsonUtil.getJSON(roleService.create(roleDTO, bindingResult));
	}
	
	@RequestMapping(value="/get-one", method=RequestMethod.POST)
	public @ResponseBody String getOne(@Valid @RequestParam("id") Integer id)
	{
		return JsonUtil.getJSON(roleService.findOne(id));
	}
}
