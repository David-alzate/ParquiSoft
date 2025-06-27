package co.parquisoft.application.primaryports.interactor.parkings.parking.impl;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.application.primaryports.interactor.parkings.parking.GetParkingsInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.ParkingDTOMapper;
import co.parquisoft.application.usecase.parkings.parking.GetParkings;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetParkingsInteractorImpl implements GetParkingsInteractor {

    private final GetParkings getParkings;

    public GetParkingsInteractorImpl(GetParkings getParkings) {
        this.getParkings = getParkings;
    }

    @Override
    public List<ParkingDTO> execute() {
        List<ParkingDomain> parkingDomains = getParkings.execute();
        return ParkingDTOMapper.INSTANCE.toDtoCollection(parkingDomains);
    }
}
