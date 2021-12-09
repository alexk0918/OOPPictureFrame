package KaminskiPictureFrame;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

//loads png files based on picture data 
public class PictureLoader 
{
    private static ArrayList<BufferedImage> images;
    public static ArrayList<BufferedImage> loadImagesFromPictureData(ArrayList<PictureData> pictures)
    {
        ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();
        for(int i = 1; i < pictures.size()+1; ++i)
        {
            BufferedImage img = null;
            try
            {
                img = ImageIO.read(new File("pic"+i+".png"));
                images.add(img);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return images;
    }

    //returns array list of images
    public static ArrayList<BufferedImage> getImages()
    {
        return images;
    }
}
