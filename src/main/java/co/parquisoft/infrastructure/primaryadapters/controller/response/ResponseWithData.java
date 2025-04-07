package co.parquisoft.infrastructure.primaryadapters.controller.response;

import co.parquisoft.crosscutting.helpers.ObjectHelper;

import java.util.ArrayList;
import java.util.List;

public class ResponseWithData <T> extends Response {

    private List<T> data = new ArrayList<>();

    public final List<T> getData() {
        return data;
    }

    public final void setData(List<T> data) {
        this.data = ObjectHelper.getDefault(data, this.data);
    }

}
