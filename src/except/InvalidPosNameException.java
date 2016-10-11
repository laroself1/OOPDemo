package except;

/**
 * Created by LaroSelf on 10.10.2016.
 */
public class InvalidPosNameException extends Exception{
    @Override
    public String getMessage() {
        String message = "Incorrect name";
        return message;
    }

}
