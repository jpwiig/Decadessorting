import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public GUI() {
        JFrame guiFrame = new JFrame();
        JPanel guiPanel = new JPanel();
        JButton guibutton = new JButton();

        guiPanel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
        guiPanel.setLayout(new GridLayout(0, 1));
        guiPanel.add(guibutton);

        guiFrame.add(guiPanel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("AlbumLookUp");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("funker");
    }
}
