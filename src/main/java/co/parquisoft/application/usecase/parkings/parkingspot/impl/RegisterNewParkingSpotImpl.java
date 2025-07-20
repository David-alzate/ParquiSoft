package co.parquisoft.application.usecase.parkings.parkingspot.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingSpotEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingSpotEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingSpotRepository;
import co.parquisoft.application.usecase.parkings.parkingspot.RegisterNewParkingSpot;
import co.parquisoft.application.usecase.parkings.parkingspot.rulesvalidator.RegisterNewParkingSpotRulesValidator;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingSpotImpl implements RegisterNewParkingSpot {

    private final ParkingSpotRepository parkingSpotRepository;
    private final RegisterNewParkingSpotRulesValidator registerNewParkingSpotRulesValidator;

    public RegisterNewParkingSpotImpl(ParkingSpotRepository parkingSpotRepository, RegisterNewParkingSpotRulesValidator registerNewParkingSpotRulesValidator) {
        this.parkingSpotRepository = parkingSpotRepository;
        this.registerNewParkingSpotRulesValidator = registerNewParkingSpotRulesValidator;
    }

    @Override
    public void execute(ParkingSpotDomain domain) {
        registerNewParkingSpotRulesValidator.validate(domain);
        ParkingSpotEntity parkingSpotEntity = ParkingSpotEntityMapper.INSTANCE.toEntity(domain);
        parkingSpotRepository.save(parkingSpotEntity);
    }
}
