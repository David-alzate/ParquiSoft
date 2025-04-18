package co.parquisoft.infrastructure.primaryadapters.controller.response.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class StatusResponse extends ResponseWithData<StatusDTO> {

    public static StatusResponse build(final List<String> messages, final List<StatusDTO> data) {
        StatusResponse response = new StatusResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }

}
