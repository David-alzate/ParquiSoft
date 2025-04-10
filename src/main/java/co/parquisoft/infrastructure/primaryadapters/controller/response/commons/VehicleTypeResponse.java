package co.parquisoft.infrastructure.primaryadapters.controller.response.commons;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class VehicleTypeResponse extends ResponseWithData<VehicleTypeDTO> {

    public static VehicleTypeResponse build(final List<String> messages, final List<VehicleTypeDTO> data) {
        VehicleTypeResponse response = new VehicleTypeResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
