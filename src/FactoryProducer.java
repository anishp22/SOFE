import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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


    public static void PricesReader(String deviceName) throws FileNotFoundException{
        File file = new File("prices.txt");
        Scanner scan = new Scanner(file);

        //System.out.println(scan.nextLine());

        ArrayList prices = new ArrayList();

        String pricesDatabase = "";
        while(scan.hasNextLine()){
            //pricesDatabase = pricesDatabase.concat(scan.nextLine() + "\n");
            prices.add(scan.next());
        }

        //System.out.println(pricesDatabase);
        //String[] pricesTable = pricesDatabase.split(" ");
        //System.out.println(Arrays.toString(pricesTable));

        System.out.println("Price: " + prices.get(prices.indexOf(deviceName)+1));





    }

}



