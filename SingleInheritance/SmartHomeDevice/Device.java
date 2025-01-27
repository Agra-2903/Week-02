package SingleInheritance.SmartHomeDevice;

//Define a superclass Device with attributes like deviceId and status
//Implement a method displayStatus() to show each device's current settings.
class Device{
    protected  String deviceId;
    protected  String status;
    Device(String deviceId, String status){
        this.deviceId= deviceId;
        this.status = status;
    }
    public void displayStatus(){
        System.out.println("DeviceId :" +this.deviceId);
        System.out.println("Status :" +this.status);
    }
}
