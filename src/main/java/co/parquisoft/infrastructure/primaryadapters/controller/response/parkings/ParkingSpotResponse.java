package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class ParkingSpotResponse extends ResponseWithData<ParkingSpotDTO> {

    public static ParkingSpotResponse build(final List<String> messages, final List<ParkingSpotDTO> data) {
        ParkingSpotResponse response = new ParkingSpotResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
