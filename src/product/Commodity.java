package product;

import except.InvalidManufacturerException;
import except.InvalidPosNameException;

import except.InvalidPosPriceException;
import position.Position;

/**
 * Created by LaroSelf on 09.10.2016.
 */
public class Commodity extends Position {

    private String manufacturer;

    public Commodity(String name, double price, String manufacturer) throws Exception{
           setName(name);
           setPrice(price);
           setManufacturer(manufacturer);

    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) throws InvalidManufacturerException {
        if (manufacturer==null){
            throw new InvalidManufacturerException();
        }
        if (manufacturer.length()<3){
            throw new InvalidManufacturerException();
        }
        this.manufacturer = manufacturer;
    }
    @Override
    public void getInfo() {
        System.out.println("Commodity: "+getName()+" "+String.format("%.2f", getPrice())+" UAH.  Manufacturer: "+manufacturer);
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null){
            return false;}
        if (getClass() != obj.getClass()){
            return false;}
        Commodity other = (Commodity) obj;
        if (getName() != other.getName()){
            return false;}
        if (manufacturer != other.getManufacturer()){
            return false;}
        if (getPrice()!= other.getPrice()){
            return false;}

        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getName().length();
        int priceForHash = (int) getPrice();
        result = prime * result + priceForHash;
        return result;
    }



}
