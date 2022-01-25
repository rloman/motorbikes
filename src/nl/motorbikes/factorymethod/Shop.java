package nl.motorbikes.factorymethod;

import nl.motorbikes.model.Vehicle;
import nl.motorbikes.model.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private VehicleFactory vehicleFactory;
    private List<Vehicle> store = new ArrayList<>();

    public Shop(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void buy(int aantal) {
        for (int i = 0; i < 5; i++) {
            Vehicle v = this.vehicleFactory.getVehicle();
            System.out.println("Bought: "+v);
            store.add(v);
        }
    }

    public void sell() {
        if (store.size() > 0) {
            Vehicle sold = store.remove(0);
            System.out.println("Sold: "+sold);
        }
        else {
            System.err.println("Store is empty, please buy some");
        }
    }
}
