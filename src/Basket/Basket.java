package Basket;

import position.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LaroSelf on 10.10.2016.
 */
public class Basket implements Editable{
    List<Position> items = new ArrayList<>();
    @Override
    public void addPosition(Position p){
        items.add(p);
    }
    @Override
    public void viewPositions(){
        for (Position p:items  ) {
            p.getInfo();              //для каждого типа используется свой метод
        }
    }

    @Override
    public void deletePosition(Position p) {

        for (Position d:items){
            int remindex = items.indexOf(d);

            if(p.equals(d)) {              //вызывается свой equals для каждого типа
                items.remove(remindex);
                break;
            }
        }
    }
}
