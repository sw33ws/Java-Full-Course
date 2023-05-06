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



// import java.awt.Color;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.BorderFactory;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class MyFrame extends JFrame implements ActionListener{

//     JButton button;
//     JLabel label;

//     MyFrame() {

//         ImageIcon icon = new ImageIcon("logo.png");
//         ImageIcon icon2 = new ImageIcon("logo.png");

//         label = new JLabel();
//         label.setIcon(icon2);
//         label.setBounds(150, 250, 150, 150);
//         label.setVisible(false);

//         button = new JButton();
//         button.setBounds(75, 75, 350, 300);
//         button.addActionListener(this);
//         // button.addActionListener(e -> System.out.println("hello"));
//         button.setText("I'm a button!");
//         button.setFocusable(false);
//         button.setIcon(icon);
//         button.setHorizontalTextPosition(JButton.CENTER);
//         button.setVerticalTextPosition(JButton.BOTTOM);
//         button.setFont(new Font("Comic Sans",Font.BOLD,25));
//         button.setIconTextGap(-2);
//         button.setForeground(Color.cyan);
//         button.setBackground(Color.lightGray);
//         button.setBorder(BorderFactory.createEtchedBorder());
//         // button.setEnabled(false); // turns off button

//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         this.setSize(500, 500);
//         this.setVisible(true);
//         this.add(button);
//         this.add(label);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==button) {
//             System.out.println("hello");
//             button.setEnabled(false);
//             label.setVisible(true);
//         }
//     }
// }

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JTextField;

// import java.awt.Button;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.TextField;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MyFrame extends JFrame implements ActionListener {

//     JButton button;
//     JTextField textField;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         button = new JButton("Submit");
//         button.addActionListener(this);

//         textField = new JTextField();
//         textField.setPreferredSize(new Dimension(250,40));
//         textField.setFont(new Font("Consolas",Font.PLAIN,35));
//         textField.setForeground(new Color(0x00FF00));
//         textField.setBackground(Color.BLACK);
//         textField.setCaretColor(Color.WHITE);
//         textField.setText("username");

//         this.add(button);
//         this.add(textField);
//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==button) {
//             System.out.println("Welcome "+ textField.getText());
//             textField.setEditable(false);
//             button.setEnabled(false);
//         }
//     }
    
// }



// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JFrame;

// import java.awt.Checkbox;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class MyFrame extends JFrame implements ActionListener {

//     JButton button;
//     JCheckBox checkBox;
//     ImageIcon x;
//     ImageIcon y;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         x = new ImageIcon("logo.png");
//         y = new ImageIcon("logo.png");

//         button = new JButton();
//         button.setText("Submit");
//         button.addActionListener(this);

//         checkBox = new JCheckBox();
//         checkBox.setText("I'm not a robot");
//         checkBox.setFocusable(false);
//         checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
//         checkBox.setIcon(x);
//         checkBox.setSelectedIcon(y);

//         this.add(button);
//         this.add(checkBox);

//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==button) {
//             System.out.println(checkBox.isSelected());
//         }
//     }
// }



// import javax.swing.*;
// import java.awt.event.*;
// import java.awt.*;

// public class MyFrame extends JFrame implements ActionListener {

//     JRadioButton pizzabutton;
//     JRadioButton hamburgerbutton;
//     JRadioButton hotdogbutton;

//     ImageIcon pizzaIcon;
//     ImageIcon hamburgerIcon;
//     ImageIcon hotdogIcon;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         pizzabutton = new JRadioButton("pizza");
//         hamburgerbutton = new JRadioButton("hamburger");
//         hotdogbutton = new JRadioButton("hotdog");

//         pizzaIcon = new ImageIcon("logo.png");
//         hamburgerIcon = new ImageIcon("logo.png");
//         hotdogIcon = new ImageIcon("logo.png");

//         ButtonGroup group = new ButtonGroup();
//         group.add(pizzabutton);
//         group.add(hamburgerbutton);
//         group.add(hotdogbutton);

//         pizzabutton.addActionListener(this);
//         hamburgerbutton.addActionListener(this);
//         hotdogbutton.addActionListener(this);

//         pizzabutton.setIcon(pizzaIcon);
//         hamburgerbutton.setIcon(hamburgerIcon);
//         hotdogbutton.setIcon(hotdogIcon);

//         this.add(pizzabutton);
//         this.add(hamburgerbutton);
//         this.add(hotdogbutton);

//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==pizzabutton) {
//             System.out.println("You ordered a Pizza!");
//         }
//         else if(e.getSource()==hamburgerbutton) {
//             System.out.println("You ordered a Hamburger!");
//         }
//         else if(e.getSource()==hotdogbutton) {
//             System.out.println("You ordered a Hotdog!");
//         }
//     }
// }