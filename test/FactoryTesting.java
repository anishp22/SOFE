// SOFE3650 Assignment 1
// David Fung 100767734
// Anish Patel 100751489
// Nathan Yohannes 100749914
// Saaruca Kugarajh 100751441


import java.io.FileNotFoundException;


// Driver class to create test objects
public class FactoryTesting {

    public static void main(String[] args) throws FileNotFoundException {

        //Test Case 1 which produces a Windows Laptop object
        AbstractDeviceFactory testFactory1 = FactoryProducer.getFactoryType("windows");
        Laptop device1 = testFactory1.createLaptop();

        System.out.println("Test Product 1: "+ device1.toString());
        FactoryProducer.PricesReader(device1.toString());


        //Test Case 2 which produces a Mac Phone object
        AbstractDeviceFactory testFactory2 = FactoryProducer.getFactoryType("mac");
        Phone device2 = testFactory2.createPhone();

        System.out.println("\nTest Product 2: "+ device2.toString());

       FactoryProducer.PricesReader(device2.toString());

    }

}

