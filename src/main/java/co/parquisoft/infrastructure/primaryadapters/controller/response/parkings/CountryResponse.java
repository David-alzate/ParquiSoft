package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CountryDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class CountryResponse extends ResponseWithData<CountryDTO> {

    public static CountryResponse build(final List<String> messages, final List<CountryDTO> data) {
        CountryResponse response = new CountryResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
