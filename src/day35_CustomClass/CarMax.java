package day35_CustomClass;

public class CarMax {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota", "Camry", "White", 2017, 10000);
      //  car1.getInfo();

        car2.setInfo("Honda","CR-V","Black", 2019, 15000.55 );
       // car2.getInfo();

        car3.setInfo("Nissan", "R32 GTR", "Dark Red", 1991, 55000.99);

        car4.setInfo("Range Rover"," HSE Hybrid","White",2019,98000);

        car5.setInfo("Audi","R8","White",2020,105000);


    }


}
