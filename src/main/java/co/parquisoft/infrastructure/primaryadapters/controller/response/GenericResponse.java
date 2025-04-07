package co.parquisoft.infrastructure.primaryadapters.controller.response;

import java.util.List;

public final class GenericResponse extends Response {

    public static Response build(final List<String> messages) {
        var response = new GenericResponse();
        response.setMessages(messages);

        return response;
    }

}
