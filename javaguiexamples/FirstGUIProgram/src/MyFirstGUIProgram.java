import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class MyFirstGUIProgram{
    public static void main(String[] args) {
        // JFrame is a java gui window where you can add widgets
        // JLabel is a gui display area for a string of text , an image, or both
        ImageIcon user = new ImageIcon("user.png");
        Border border = BorderFactory.createLineBorder(Color.black,5);

        JLabel label = new JLabel();
        label.setText("Harsha");
        label.setIcon(user);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,0));
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setIconTextGap(-40);
        label.setBackground(Color.blue);
        label.setOpaque(false);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);

        JFrame window = new JFrame(); // creates a new java gui window
        window.setTitle("MyGUIProgram"); // sets the title of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the app
        window.setResizable(true); // resizes the frame
        window.setSize(500,500); // sets the dimensions for the window
        window.setVisible(true);
        window.setLayout(null);
        window.add(label);



        ImageIcon icon = new ImageIcon("windows11.png"); // create an imageicon
        window.setIconImage(icon.getImage()); // image icon of the window
        window.getContentPane().setBackground(new Color(0,255,0));

    }
}