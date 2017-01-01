package ch1.GuitarShop1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by private on 30/12/2016.
 */
public class Inventory1 {
    private Guitar1 guitar1;
    private GuitarSpec1 guitarSpec1;
    private List<Guitar1> guitars;

    public Inventory1(){
        guitars = new LinkedList<Guitar1>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec1 guitarSpec1){
        guitar1 = new Guitar1(serialNumber, price, guitarSpec1);
        guitars.add(guitar1);
    }

    public List<Guitar1> search(GuitarSpec1 searchSpec){
        List<Guitar1> matchingGutar = new LinkedList<Guitar1>();
        for (Iterator<Guitar1> i = guitars.iterator(); i.hasNext();){
            guitar1 = i.next();
            guitarSpec1 = guitar1.getGuitarSpec1();

            if (searchSpec.getBuilder1() != guitarSpec1.getBuilder1())
                continue;
            if (searchSpec.getType1() != guitarSpec1.getType1())
                continue;
            if (searchSpec.getTopWood() != guitarSpec1.getTopWood())
                continue;
            if (searchSpec.getBackWood() != guitarSpec1.getBackWood())
                continue;
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) &&(!model.equals("")) &&
                    (!model.equals(guitarSpec1.getModel().toLowerCase())))
                continue;
            matchingGutar.add(guitar1);
        }
        return matchingGutar;
    }
}
