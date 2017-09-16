package com.trika.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.trika.component.RoleComponent;
import com.trika.data.RoleDTO;
import com.trika.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private RoleComponent roleComp;
	
	public Object create(final RoleDTO roleDTO, final BindingResult bindingResult) {
		/*Role t = roleComp.getRole(roleDTO);
		t.setStatus(Status.ACTIVE);
		t.setTimeCreated(new Date());
		t.setRestaurant(r);
		tableRepository.save(t); */
		return null;
	}
	
	public Object findOne(Integer id) {
		return roleComp.getRoleDTO(roleRepository.findOne(id));//find(id));
	}

	public List<RoleDTO> findAll() {
		return roleComp.getRoleDTOs(roleRepository.findAll());
	}

}
