package lab3;
import java.util.*;
import java.io.InputStream;
import java.io.IOException;

public class InputDevice {
    InputStream in;

    public InputDevice(InputStream stream){
        this.in = stream;
    }

    public String readData(String data){
        try(Scanner scan = new Scanner(in)){
            if(scan.hasNext()) {
                //System.out.println("has next!");
                return (scan.next());
            } else {
                //System.out.println("has no next!");
            }
        }
        return ("data missing");
    }

    public Fruit[] readFruit() {
        Fruit[] fruits = {new Banana(100, 5, 20), new Apple(50, 6, 18, Color.RED)};
        return fruits;
    }


    public ArrayList<Fruit> readFruitCollection() {
        ArrayList<Fruit> fruitlist;
        fruitlist = new ArrayList<Fruit>();

        fruitlist.add(new Apple(50, 6, 18, Color.RED));

        return fruitlist;
    }


}