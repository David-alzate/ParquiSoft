package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class ParkingResponse extends ResponseWithData<ParkingDTO> {

    public static ParkingResponse build(final List<String> messages, final List<ParkingDTO> data) {
        ParkingResponse response = new ParkingResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
