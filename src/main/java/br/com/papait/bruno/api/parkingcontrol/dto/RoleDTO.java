package br.com.papait.bruno.api.parkingcontrol.dto;

import br.com.papait.bruno.api.parkingcontrol.enums.RoleName;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class RoleDTO {

	private UUID roleId;

	@Enumerated(EnumType.STRING)
	private RoleName roleName;

	public UUID getRoleId() {
		return roleId;
	}

	public void setRoleId(UUID roleId) {
		this.roleId = roleId;
	}

	public RoleName getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}
}
