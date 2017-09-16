package com.trika.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trika.data.RoleDTO;
import com.trika.entities.Role;
import com.trika.entities.UserRole;

@Component
public class RoleComponent {

	public Role getRole(final RoleDTO roleDTO){
		final Role role = new Role();
		if(roleDTO==null){
			return role;
		}
		if(roleDTO.getId() != 0){
			role.setId(roleDTO.getId());
		}
		role.setRole(UserRole.getRoleByName(roleDTO.getRole()));
		return role;
	}

	public RoleDTO getRoleDTO(final Role role) {
		final RoleDTO roleDTO = new RoleDTO();
		if(role==null){
			return roleDTO;
		}
		roleDTO.setId(role.getId());
		roleDTO.setRole(role.getRole().name());
		return roleDTO;
	}
	
	public List<RoleDTO> getRoleDTOs(List<Role> roles){
		List<RoleDTO> tableDTOs = new ArrayList<>();
		for(Role role :roles) {
			tableDTOs.add(getRoleDTO(role));
		}
		return tableDTOs;
	}
}
