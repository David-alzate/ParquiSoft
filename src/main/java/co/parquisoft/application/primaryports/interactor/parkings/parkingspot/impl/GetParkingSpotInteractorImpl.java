package co.parquisoft.application.primaryports.interactor.parkings.parkingspot.impl;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parkingspot.GetParkingSpotInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.ParkingSpotDTOMapper;
import co.parquisoft.application.usecase.parkings.parkingspot.GetParkingSpot;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetParkingSpotInteractorImpl implements GetParkingSpotInteractor {

    private final GetParkingSpot getParkingSpot;

    public GetParkingSpotInteractorImpl(GetParkingSpot getParkingSpot) {
        this.getParkingSpot = getParkingSpot;
    }

    @Override
    public List<ParkingSpotDTO> execute() {
        List<ParkingSpotDomain> results = getParkingSpot.execute();
        return ParkingSpotDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
