package co.edu.uco.parquisoft.generales.crosscutting.helpers;

public class ObjectHelper {

    private ObjectHelper() {

    }

    public static <O> boolean isNull(final O object) {
        return object == null;
    }

    public static <O> O getDefault(final O object, final O defaultObject) {
        return isNull(object) ? defaultObject : object;
    }

}