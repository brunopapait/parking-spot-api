package br.com.papait.bruno.api.parkingcontrol.controller;

import br.com.papait.bruno.api.parkingcontrol.dto.RoleDTO;
import br.com.papait.bruno.api.parkingcontrol.model.RoleModel;
import br.com.papait.bruno.api.parkingcontrol.service.RoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

	private final RoleService roleService;

	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}

	@PostMapping
	public ResponseEntity<Object> save(@RequestBody @Valid RoleDTO roleDTO) {

		RoleModel roleModel = new RoleModel();
		BeanUtils.copyProperties(roleDTO, roleModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(roleService.save(roleModel));
	}

	@GetMapping
	public ResponseEntity<Page<RoleModel>> findAll(Pageable pageable) {
		return ResponseEntity.status(HttpStatus.OK).body(this.roleService.findAll(pageable));
	}
}
