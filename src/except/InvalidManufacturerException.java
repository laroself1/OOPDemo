package except;

/**
 * Created by LaroSelf on 10.10.2016.
 */
public class InvalidManufacturerException extends Exception {
    @Override
    public String getMessage() {
        String message = "Incorrect manufacturer";
        return message;
    }
}
