package except;

/**
 * Created by LaroSelf on 10.10.2016.
 */
public class InvalidPosPriceException extends Exception{
    @Override
    public String getMessage() {
        String message = "Price can't be negative or zero";
        return message;
    }
}
