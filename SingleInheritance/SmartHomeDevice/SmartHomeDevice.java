package SingleInheritance.SmartHomeDevice;

public class SmartHomeDevice {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Device device = new Device("34545453", "working");
        Thermostat thermostat = new Thermostat("57866" , "not working" , 89);
        //calling out their respective methods
        device.displayStatus();
        thermostat.displayStatus();
    }

}
