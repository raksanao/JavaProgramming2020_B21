package day42_Inheritance.DeviceTask;

public class Device {

    public String brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery;
    public static boolean hasPowerButton;

    static{
       madeIn = "China" ;
       hasBattery = true;
       hasPowerButton = true;
    }

    public void setInfo(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


}

/*
	Device:
		instance variables: brand, model, price
		static: madeIn, hasBattery, hasPowerButton

		methods: setInfo, toString
 */
