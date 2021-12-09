package KaminskiPictureFrame;

/**
The Picture program displays pre-determined png images
using JFrame and JPanel to create a GUI that also allows
users to alter the date and descriptions that are presented
with the images.

@author Alex Kaminski
@version 1.0
@since 2021-12-01
*/

//main class that runs the program
public class PictureFrameMain 
{
    public static void main(String args[])
    {
        PictureLoader.loadImagesFromPictureData(PictureDataReader.readPictureDataFromFile("descriptions.txt"));
        PictureFrame picFrame = new PictureFrame();
        picFrame.setVisible(true);
    }
}
