package br.com.papait.bruno.api.parkingcontrol.repository;

import br.com.papait.bruno.api.parkingcontrol.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {

  boolean existsByLicensePlateCar(String licensePalteCar);
  boolean existsByParkingSpotNumber(String parkingSpotNumber);
  boolean existsByApartmentAndBlock(String apartment, String block);
}
