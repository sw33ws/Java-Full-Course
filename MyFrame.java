// import java.awt.Color;
// import javax.swing.ImageIcon;
// import javax.swing.JFrame;

// public class MyFrame extends JFrame {
    
//     MyFrame() {

//         this.setTitle("JFrame title goes here");
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             // This is needed to close the window
//         this.setResizable(false);                              // This prevents the this from being resized
//         this.setSize(420,420);
//         this.setVisible(true);

//         ImageIcon image = new ImageIcon("logo.png");             // changes the icon of the this
//         this.setIconImage(image.getImage());

//         // this.getContentPane().setBackground(Color.green);
//         this.getContentPane().setBackground(new Color(0,0,0));     // you can use rgb or hexadecimal
//     }
// }



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("logo.png");
        ImageIcon icon2 = new ImageIcon("logo.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(75, 75, 350, 300);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("hello"));
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-2);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false); // turns off button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("hello");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}