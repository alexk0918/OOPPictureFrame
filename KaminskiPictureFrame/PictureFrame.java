package KaminskiPictureFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.util.ArrayList;

class PictureFrame extends JFrame
{
    //constructs a JFrame with necessities to navigate through images 
    //and save text edits with the ability to also create a 
    //JMenu to exit or save the program or read about the author
    public PictureFrame()
    {
        ArrayList<PictureData> images = PictureDataReader.readPictureDataFromFile("descriptions.txt");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Picture Frame"); 
        setBounds(290, 400, 290, 400); 
        Container c = getContentPane(); 
        c.setLayout(new BorderLayout()); 
        JPanel panCenter = new JPanel(); 
        panCenter.setBackground(Color.WHITE); 
        JPanel panSouth = new JPanel(); 
        panSouth.setBackground(Color.WHITE); 
        JTextArea mousePos = new JTextArea();
        mousePos.setText("(0, 0)");
        panSouth.add(mousePos, BorderLayout.BEFORE_FIRST_LINE); 
        JButton btnPrev = new JButton("Prev"); 
        panSouth.add(btnPrev); 
        JButton btnSave = new JButton("Save"); 
        panSouth.add(btnSave); 
        JButton btnNext = new JButton("Next"); 
        panSouth.add(btnNext); 
        JTextField date = new JTextField(25);
        date.setText(images.get(3).getDate());
        panCenter.add(date); 
        JTextArea descArea = new JTextArea(1, 1);
        descArea.setText(images.get(3).getDesc());
        descArea.setLineWrap(true);
        descArea.setPreferredSize(new Dimension(275, 275));
        panCenter.add(descArea); 
        PicturePanel picPan = new PicturePanel(PictureLoader.loadImagesFromPictureData(PictureDataReader.readPictureDataFromFile("descriptions.txt")));
        picPan.setPreferredSize(new Dimension(200, 200));
        c.add(picPan, BorderLayout.NORTH);
        c.add(panCenter, BorderLayout.CENTER); 
        c.add(panSouth, BorderLayout.SOUTH);
        setupMenu();
    }
    
    //sets up the menu bar with File including Save and Exit, as well as Help including About
    public void setupMenu()
    {
        JMenuBar mbar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miExit = new JMenuItem("Exit");

        miExit.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent e ) 
            { 
                System. exit (0); 
            } 
        });

        mnuFile.add(miSave);
        mnuFile.add(miExit);
        mbar.add(mnuFile);
        JMenu mnuHelp = new JMenu("Help");
        JMenuItem miAbout = new JMenuItem("About");

        miAbout.addActionListener(new ActionListener() 
        { 
            public void actionPerformed(ActionEvent e ) 
            { 
                JOptionPane.showMessageDialog(null, "Created by Alex Kaminski in December 2021");
            } 
        });

        mnuHelp.add(miAbout);
        mbar.add(mnuHelp);
        setJMenuBar(mbar);
    }
}
