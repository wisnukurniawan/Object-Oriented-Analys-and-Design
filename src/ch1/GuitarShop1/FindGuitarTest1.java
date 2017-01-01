package ch1.GuitarShop1;

import java.util.Iterator;
import java.util.List;

/**
 * Created by private on 30/12/2016.
 */
public class FindGuitarTest1 {
    public static void main(String[] args) {
        Inventory1 inventory = new Inventory1();
        initializeInventory(inventory);

        GuitarSpec1 whatErinLikes = new GuitarSpec1(Builder1.FENDER, "Stratocastor", Type1.ELECTRIC, Wood1.ALDER, Wood1.ALDER);

        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator<Guitar1> i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar1 guitar = i.next();
                GuitarSpec1 spec = guitar.getGuitarSpec1();
                System.out.println("  We have a " +
                        spec.getBuilder1() + " " + spec.getModel() + " " +
                        spec.getType1() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory1 inventory) {
        inventory.addGuitar("11277", 3999.95,
                new GuitarSpec1(Builder1.COLLINGS, "CJ", Type1.ACOUSTIC, Wood1.INDIAN_ROSEWOOD, Wood1.SITKA));
        inventory.addGuitar("V95693", 1499.95,
                new GuitarSpec1(Builder1.FENDER, "Stratocastor", Type1.ELECTRIC, Wood1.ALDER, Wood1.ALDER));
        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpec1(Builder1.FENDER, "Stratocastor", Type1.ELECTRIC, Wood1.ALDER, Wood1.ALDER));
        inventory.addGuitar("122784", 5495.95,
                new GuitarSpec1(Builder1.MARTIN, "D-18", Type1.ACOUSTIC, Wood1.MAHOGANY, Wood1.ADIRONDACK));
        inventory.addGuitar("76531", 6295.95,
                new GuitarSpec1(Builder1.MARTIN, "OM-28", Type1.ACOUSTIC, Wood1.BRAZILIAN_ROSEWOOD, Wood1.ADIRONDACK));
        inventory.addGuitar("70108276", 2295.95,
                new GuitarSpec1(Builder1.GIBSON, "Les Paul", Type1.ELECTRIC, Wood1.MAHOGANY, Wood1.MAHOGANY));
        inventory.addGuitar("82765501", 1890.95,
                new GuitarSpec1(Builder1.GIBSON, "SG '61 Reissue", Type1.ELECTRIC, Wood1.MAHOGANY, Wood1.MAHOGANY));
        inventory.addGuitar("77023", 6275.95,
                new GuitarSpec1(Builder1.MARTIN, "D-28", Type1.ACOUSTIC, Wood1.BRAZILIAN_ROSEWOOD, Wood1.ADIRONDACK));
        inventory.addGuitar("1092", 12995.95,
                new GuitarSpec1(Builder1.OLSON, "SJ", Type1.ACOUSTIC, Wood1.INDIAN_ROSEWOOD, Wood1.CEDAR));
        inventory.addGuitar("566-62", 8999.95,
                new GuitarSpec1(Builder1.RYAN, "Cathedral", Type1.ACOUSTIC, Wood1.COCOBOLO, Wood1.CEDAR));
        inventory.addGuitar("6 29584", 2100.95,
                new GuitarSpec1(Builder1.PRS, "Dave Navarro Signature", Type1.ELECTRIC, Wood1.MAHOGANY, Wood1.MAPLE));
    }
}