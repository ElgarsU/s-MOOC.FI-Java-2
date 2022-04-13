
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
        
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate) && registry.get(licensePlate).equals(owner) || registry.containsKey(licensePlate)) {
            return false;
        } else {
            registry.put(licensePlate, owner);
            return true;
        }
        
    }
    
    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove (LicensePlate licensePlate) {
            if (registry.containsKey(licensePlate)) {
                registry.remove(licensePlate);
                return true;
            } else {
                return false;
            }
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.registry);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.registry, other.registry)) {
            return false;
        }
        return true;
    }
    
    
}