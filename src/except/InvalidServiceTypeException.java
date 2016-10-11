package except;

/**
 * Created by LaroSelf on 11.10.2016.
 */
public class InvalidServiceTypeException extends Exception{
    @Override
    public String getMessage() {
        String message = "Incorrect type of service";
        return message;
    }
}
