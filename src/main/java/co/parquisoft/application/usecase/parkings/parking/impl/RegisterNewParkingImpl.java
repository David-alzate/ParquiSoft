package co.parquisoft.application.usecase.parkings.parking.impl;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.ParkingEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.ParkingRepository;
import co.parquisoft.application.usecase.parkings.parking.RegisterNewParking;
import co.parquisoft.application.usecase.parkings.parking.rulesvalidator.RegisterNewParkingRulesValidator;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewParkingImpl implements RegisterNewParking {

    private final ParkingRepository parkingRepository;
    private final RegisterNewParkingRulesValidator registerNewParkingRulesValidator;

    public RegisterNewParkingImpl(ParkingRepository parkingRepository, RegisterNewParkingRulesValidator registerNewParkingRulesValidator) {
        this.parkingRepository = parkingRepository;
        this.registerNewParkingRulesValidator = registerNewParkingRulesValidator;
    }

    @Override
    public void execute(ParkingDomain domain) {
        registerNewParkingRulesValidator.validate(domain);

        ParkingEntity parkingEntity = ParkingEntityMapper.INSTANCE.toEntity(domain);
        parkingRepository.save(parkingEntity);
    }
}
