package co.parquisoft.application.primaryports.interactor.parkings.parking.impl;

import co.parquisoft.application.primaryports.interactor.parkings.parking.DeleteParkingInteractor;
import co.parquisoft.application.usecase.parkings.parking.DeleteParking;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class DeleteParkingInteractorImpl implements DeleteParkingInteractor {

    private final DeleteParking deleteParking;

    public DeleteParkingInteractorImpl(DeleteParking deleteParking) {
        this.deleteParking = deleteParking;
    }

    @Override
    public void execute(UUID data) {
        deleteParking.execute(data);
    }
}
