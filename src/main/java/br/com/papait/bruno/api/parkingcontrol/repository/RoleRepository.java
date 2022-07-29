package br.com.papait.bruno.api.parkingcontrol.repository;

import br.com.papait.bruno.api.parkingcontrol.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, UUID> {
}
