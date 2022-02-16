package br.com.papait.bruno.api.parkingcontrol.service;

import br.com.papait.bruno.api.parkingcontrol.model.ParkingSpot;
import br.com.papait.bruno.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ParkingSpotService {

  private final ParkingSpotRepository parkingSpotRepository;

  public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
    this.parkingSpotRepository = parkingSpotRepository;
  }

  @Transactional
  public ParkingSpot save(ParkingSpot parkingSpot) {
    return parkingSpotRepository.save(parkingSpot);
  }

  public boolean existsByLicensePlateCar(String licensePlateCar) {
    return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
  }

  public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
    return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
  }

  public boolean existsByApartmentAndBlock(String apartment, String block) {
    return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
  }

  public List<ParkingSpot> findAll() {
    return parkingSpotRepository.findAll();
  }
}
