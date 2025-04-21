import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    public List guitars;

    public Inventory() {
        guitars = new ArrayList();
    };

    public void addGuitar(String serialNUmber, double price, String model, Builder builder, Type type, Wood topWood, Wood backWood, int numString) {
        GuitarSpec guitarSpec = new GuitarSpec(model, builder, type, topWood, backWood, numString);
        Guitar guitar = new Guitar(serialNUmber, price, guitarSpec);
        guitars.add(guitar);
    };

    public Guitar getGuitar(String serialNumber) {
        Iterator iterator = guitars.iterator();
        while (iterator.hasNext()){
            Guitar guitar = (Guitar) iterator.next();
            if (guitar.getSerialNUmber().equals(serialNumber)){
                return guitar;
            }
        };
        return null;
    };

    public List searchGuitarUpdated(GuitarSpec searchGuitarSpec) {
        List matchedGuitars = new ArrayList();

        Iterator iterator = guitars.iterator();
        while (iterator.hasNext()){
            Guitar guitar = (Guitar) iterator.next();

            if (guitar.getGuitarSpec().matches(searchGuitarSpec))
                matchedGuitars.add(guitar);
        }
        return matchedGuitars;
    };
}
