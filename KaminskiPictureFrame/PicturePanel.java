package KaminskiPictureFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import java.util.ArrayList;

//PicturePanel aims to display the images given
public class PicturePanel extends JPanel
{
    private BufferedImage picture;

    //sets the current picture to be that of the parameter
    public void setPicture(BufferedImage img)
    {
        this.picture = img;
        repaint();
    }

    //constructor for PicturePanel
    public PicturePanel(ArrayList<BufferedImage> images) 
    {
        try 
        {
            setPicture(images.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Override paintComponent function
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.drawImage(picture, 0, 0, null);

    }
}
