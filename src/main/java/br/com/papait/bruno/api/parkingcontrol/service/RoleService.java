package br.com.papait.bruno.api.parkingcontrol.service;

import br.com.papait.bruno.api.parkingcontrol.model.RoleModel;
import br.com.papait.bruno.api.parkingcontrol.repository.RoleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {

	private final RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	@Transactional
	public RoleModel save(RoleModel roleModel) {
		return roleRepository.save(roleModel);
	}

	public Page<RoleModel> findAll(Pageable pageable) {
		return this.roleRepository.findAll(pageable);
	}
}
