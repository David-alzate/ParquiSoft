package co.parquisoft.infrastructure.primaryadapters.controller.response.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchDTO;
import co.parquisoft.infrastructure.primaryadapters.controller.response.ResponseWithData;

import java.util.List;

public class BranchResponse extends ResponseWithData<BranchDTO> {

    public static BranchResponse build(final List<String> messages, final List<BranchDTO> data) {
        BranchResponse response = new BranchResponse();
        response.setMessages(messages);
        response.setData(data);
        return response;
    }
}
