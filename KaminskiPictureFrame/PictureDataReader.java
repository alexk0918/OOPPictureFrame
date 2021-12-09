package KaminskiPictureFrame;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class PictureDataReader 
{
    public static ArrayList<PictureData> readPictureDataFromFile(String file)
    {
        ArrayList<PictureData> pictures = new ArrayList<PictureData>();
        try 
        {
            String line;
            String fileName, date, desc = "";
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null)  
            {
                PictureData picture = new PictureData();
                String[] word = line.split("\t");
                fileName = word[0];
                date = word[1];
                desc = word[2];
                picture.setFileName(fileName);
                picture.setDate(date);
                picture.setDesc(desc);
                pictures.add(picture);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pictures;
    }
}
