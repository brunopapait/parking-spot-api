package br.com.papait.bruno.api.parkingcontrol.repository;

import br.com.papait.bruno.api.parkingcontrol.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
