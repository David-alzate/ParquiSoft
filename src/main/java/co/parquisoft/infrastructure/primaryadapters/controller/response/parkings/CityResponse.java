package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CityDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class CityResponse extends ResponseWithData<CityDTO> {

    public static CityResponse build(final List<String> messages, final List<CityDTO> data) {
        CityResponse response = new CityResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
