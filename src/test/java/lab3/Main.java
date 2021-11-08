package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.*;

public class Main {

    public static int computeWeight(Fruit fruit){
        int weight = (int) fruit.weight;
        return weight;
    }


    public static void main(String[] args) {
        System.out.println("Hello world");
        InputDevice inputDevice = new InputDevice(System.in);

        try (FileOutputStream fileout =  new FileOutputStream("output.txt")) {
            OutputDevice outputDevice = new OutputDevice(fileout);
            outputDevice.writeData("test data");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //System.out.println(Arrays.toString(inputDevice.readFruit()));

        Iterator fruitIterator = inputDevice.readFruitCollection().iterator();

        inputDevice.readFruitCollection();

        System.out.println(inputDevice.readData(""));

        Fruit randomfruit = (Fruit) fruitIterator.next();
        //System.out.println(computeWeight(randomfruit));

        //outputDevice.writeData("");

        //System.out.println(fruitIterator.next());


    }
}
