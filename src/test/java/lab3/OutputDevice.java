package lab3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputDevice {
    OutputStream out;

    public OutputDevice(FileOutputStream stream){
        this.out = stream;
    }

    public void writeData(String data) {
        try{
            out.write(data.getBytes());
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }




}
