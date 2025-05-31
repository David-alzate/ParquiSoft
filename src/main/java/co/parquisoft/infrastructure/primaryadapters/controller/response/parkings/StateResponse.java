package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.StateDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class StateResponse extends ResponseWithData<StateDTO> {

    public static StateResponse build(final List<String> messages, final List<StateDTO> data) {
        StateResponse response = new StateResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
