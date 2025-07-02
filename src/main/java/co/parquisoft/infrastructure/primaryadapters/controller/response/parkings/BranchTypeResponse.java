package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchTypeDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class BranchTypeResponse extends ResponseWithData<BranchTypeDTO> {

    public static BranchTypeResponse build(final List<String> messages, final List<BranchTypeDTO> data) {
        BranchTypeResponse response = new BranchTypeResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
