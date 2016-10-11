package position;

import except.InvalidPosNameException;
import except.InvalidPosPriceException;


/**
 * Created by LaroSelf on 10.10.2016.
 */

public abstract class Position implements Tunable {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidPosPriceException {

        if (price < 0) {
            throw new InvalidPosPriceException();
        } else
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) throws InvalidPosNameException, NullPointerException {
        if(s==null) {
            throw new InvalidPosNameException();
        }
        if (s.length() < 3) {
            throw new InvalidPosNameException();}
         else
            this.name = s;
    }



}
