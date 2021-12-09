package KaminskiPictureFrame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PictureDataWriter 
{
    public static boolean printToFile(String text, String fname)
    {
        File f = new File(fname);
        try{
            FileWriter writer = new FileWriter(f);
            writer.write(text);
            writer.close();
            return true;
        } catch(IOException e){
            return false;
        }
    }
}
