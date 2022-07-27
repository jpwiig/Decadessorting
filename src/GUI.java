import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame guiFrame;
    private JPanel guiPanel;
    private JButton guibutton;
    private JTextField guifeild;
    private JRadioButton guiRadio;

    public GUI() {
        guiFrame = new JFrame();
        guiPanel = new JPanel();
        guibutton = new JButton("Press here to show the decade");
        guifeild = new JTextField("Choose a decade");
        guiRadio = new JRadioButton("hei");

        guiPanel.setBorder(BorderFactory.createEmptyBorder(120, 120, 120, 120));
        guiPanel.setLayout(new GridLayout(3, 4));
        guiPanel.add(guibutton);
        guiPanel.add(guifeild);
        guiPanel.add(guiRadio);

        guiFrame.add(guiPanel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("AlbumLookUp");
        guiFrame.pack();
        guiFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("funker");
        String Decadeselected = guifeild.getText();
        /*to do with this
         *  make it possible to check wich year is selcted
         *  figure out why there is a problem
         * fill in new way of choosing the right decade
         * */
        try {
            if (Integer.parseInt(Decadeselected) > 1960 || Integer.parseInt(Decadeselected) < 2020)
                JOptionPane.showMessageDialog(null, "skriv inn et gyldig tiår");
            else {
                System.out.println("inn i her");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Skriv inn et tall");
        }
    }
}
