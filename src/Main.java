

import Basket.Basket;
import position.Position;
import product.Commodity;
import product.Service;
import enums.ServiceType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LaroSelf on 09.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Position x = new Position("aaa",1,"bbb");  - compilation error

            Position parfume = new Commodity("SurpriseBox",100,"Hugo Boss");
            Commodity telephone1 = new Commodity("teld", 21,"Samsung");

            Service tutor1 = new Service("repetitor", 21, ServiceType.OTHER);
            Service tutor2 = new Service("repetitor", 21, ServiceType.OTHER);

            Basket basket = new Basket();

            basket.addPosition(parfume);
            basket.addPosition(telephone1);
            basket.addPosition(tutor1);
            basket.addPosition(tutor2);

            basket.viewPositions();

            basket.deletePosition(tutor1);

            System.out.println();
            basket.viewPositions();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
