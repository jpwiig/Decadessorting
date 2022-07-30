package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SelectDecade  extends GUI implements ActionListener {
    private JTextField guifeild;
    private JButton guibutton;
    private JFrame guiFrame;
    private JPanel guiPanel;

    public SelectDecade(){
        guiFrame = new JFrame();
        guiPanel = new JPanel();
        guibutton = new JButton("Press here to show the decade");
        guifeild = new JTextField("Choose a decade");

        //panel visible
        guiFrame.add(guiPanel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        guiFrame.setTitle("AlbumLookUp");
        guiFrame.pack();
        guiFrame.setVisible(true);
    }

}
