package SingleInheritance.SmartHomeDevice;

//Create a subclass Thermostat with additional attributes like temperatureSetting
public class Thermostat extends Device{
    protected int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting= temperatureSetting;
    }
    @Override
    public void displayStatus(){
        System.out.println("Thermometre Settings are : ");
        super.displayStatus();
        System.out.println("TemperatureSetting :" +this.temperatureSetting);
    }

}
