import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        GuitarSpec guitarSpec = new GuitarSpec("model2" ,Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.COCOBOLO, 12);
        Guitar guitar = new Guitar("sn1", 200, guitarSpec);

        inventory.addGuitar("sn2", 200,"model1" ,Builder.COLLINGS, Type.ACOUSTIC, Wood.BRAZILIAN_ROSWOOD, Wood.INDIAN_ROSWOOD, 12);
        inventory.addGuitar("sn3", 200,"model2" ,Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.COCOBOLO, 12);
        inventory.addGuitar("sn4", 200,"model2" ,Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.COCOBOLO, 12);

        List matchGuitar = inventory.searchGuitarUpdated(guitarSpec);

        if (!matchGuitar.isEmpty()) {
            Iterator iterator = matchGuitar.iterator();
            while (iterator.hasNext()){
                Guitar guitar1 = (Guitar) iterator.next();
                GuitarSpec spec = guitar1.getGuitarSpec();
                System.out.println("we have a " + guitar1.getSerialNUmber() + " " +spec.getBuilder() + " " + spec.getModel());
                System.out.println("----------------------------");
            }
        }else {
            System.out.println("No guitar found");
        }
    }
}