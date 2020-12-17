package day42_Inheritance.DeviceTask;

public class TV extends Device {

    public static boolean hasChannel, hasCabel;

    static{
        hasChannel = true;
        hasCabel = true;
    }

    public void channelUp(){
        System.out.println("Channel Up "+brand+" "+model);
    }

    public void channelDown(){
        System.out.println("Channel down "+brand+" "+model);

    }


}
