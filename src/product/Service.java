package product;

import enums.ServiceType;
import except.InvalidServiceTypeException;
import position.Position;

/**
 * Created by LaroSelf on 09.10.2016.
 */
public class Service extends Position {

    private ServiceType serviceType;

        public Service(String name, double price, ServiceType serviceType) throws Exception {
            setName(name);
            setPrice(price);
            setServiceType(serviceType);
        }

   @Override
   public void getInfo() {
    System.out.println("Service: "+getName()+" "+String.format("%.2f", getPrice())+" UAH per hour.  Type of service: "+serviceType);

    }
    public ServiceType getServiceType() {
        return serviceType;
    }

     public void setServiceType(ServiceType serviceType) throws InvalidServiceTypeException {
        if(serviceType==null){
            throw new InvalidServiceTypeException();}
        this.serviceType = serviceType;
        }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null){
            return false;}
        if (getClass() != obj.getClass()){
            return false;}
        Service other = (Service) obj;
        if (getName() != other.getName()){
            return false;}
        if (serviceType != other.getServiceType()){
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

