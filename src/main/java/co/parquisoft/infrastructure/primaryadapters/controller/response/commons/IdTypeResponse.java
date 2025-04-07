package co.parquisoft.infrastructure.primaryadapters.controller.response.commons;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public final class IdTypeResponse extends ResponseWithData<IdTypeDTO> {

    public static IdTypeResponse build(final List<String> messages, final List<IdTypeDTO> data) {
        IdTypeResponse response = new IdTypeResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }

}
