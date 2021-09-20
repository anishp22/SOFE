import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// Produces the appropriate factory to create the concrete products
public class FactoryProducer {
    public static AbstractDeviceFactory getFactoryType(String factoryType){
        if("windows".equalsIgnoreCase(factoryType)){
            return new WindowsFactory();
        }

        if("mac".equalsIgnoreCase(factoryType)){
            return new MacFactory();
        }

        return null;
    }

    // Function that can query the device name and return the appropriate price from the prices.txt file
    public static void PricesReader(String deviceName) throws FileNotFoundException{
        File file = new File("prices.txt");
        Scanner scan = new Scanner(file);


        ArrayList prices = new ArrayList();

        String pricesDatabase = "";
        while(scan.hasNextLine()){
            prices.add(scan.next());
        }

        System.out.println("Price: " + prices.get(prices.indexOf(deviceName)+1));
    }
}



