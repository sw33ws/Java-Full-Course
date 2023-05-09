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



// import javax.swing.*;
// import java.awt.event.*;
// import java.awt.*;

// public class MyFrame extends JFrame implements ActionListener {

//     JComboBox combobox;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         String[] animals = {"dog","cat","bird"};

//         combobox = new JComboBox(animals);
//         combobox.addActionListener(this);

//         // combobox.setEditable(true);
//         // combobox.getItemCount();
//         // combobox.addItem("horse");
//         // combobox.insertItemAt("pig", 0);
//         // combobox.setSelectedIndex(0);
//         // combobox.removeItem("cat");
//         // combobox.removeItemAt(0);
//         // combobox.removeAllItems();
    
//         this.add(combobox);

//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==combobox) {
//             System.out.println(combobox.getSelectedItem());
//             // System.out.println(combobox.getSelectedIndex());
//         }
//     }
// }



// import java.awt.FlowLayout;
// import java.awt.event.*;

// import javax.swing.JFrame;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;

// public class MyFrame extends JFrame implements ActionListener {

//     JMenuItem loadItem;
//     JMenuItem saveItem;
//     JMenuItem exitItem;

//     MyFrame() {
        
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500, 500);
//         this.setLayout(new FlowLayout());

//         JMenuBar menubar = new JMenuBar();
//         JMenu fileMenu = new JMenu("File");
//         JMenu editMenu = new JMenu("Edit");
//         JMenu helpMenu = new JMenu("Help");

//         loadItem = new JMenuItem("Load");
//         saveItem = new JMenuItem("Save");
//         exitItem = new JMenuItem("Exit");

//         loadItem.addActionListener(this);
//         saveItem.addActionListener(this);
//         exitItem.addActionListener(this);

//         loadItem.setMnemonic(KeyEvent.VK_L); // L for load
//         saveItem.setMnemonic(KeyEvent.VK_S); // S for save
//         exitItem.setMnemonic(KeyEvent.VK_E); // E for exit

//         fileMenu.add(loadItem);
//         fileMenu.add(saveItem);
//         fileMenu.add(exitItem);

//         menubar.add(fileMenu);
//         menubar.add(editMenu);
//         menubar.add(helpMenu);

//         this.setJMenuBar(menubar);

//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
        
//         if(e.getSource()==loadItem) {
//             System.out.println("Loading");
//         }
//         if(e.getSource()==saveItem) {
//             System.out.println("Saving");
//         }
//         if(e.getSource()==exitItem) {
//             System.exit(0);
//         }
//     }
// }



// import javax.swing.*;
// import java.awt.event.*;
// import java.io.File;
// import java.awt.*;

// public class MyFrame extends JFrame implements ActionListener {

//     JButton button;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         button = new JButton("Select a File");
//         button.addActionListener(this);

//         this.add(button);

//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {

//         if(e.getSource()==button) {

//             JFileChooser fileChooser = new JFileChooser();

//             fileChooser.setCurrentDirectory(new File("."));

//             int response = fileChooser.showOpenDialog(null); // select file to open
//             // int response = fileChooser.showSaveDialog(null); // select file to save

//             if (response == JFileChooser.APPROVE_OPTION) {
//                 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//                 System.out.println(file);
//             }
//         }
//     }
// }



// import javax.swing.*;
// import java.awt.event.*;
// import java.awt.Color;
// import java.awt.FlowLayout;
// import java.awt.Font;

// public class MyFrame extends JFrame implements ActionListener {

//     JButton button;
//     JLabel label;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(new FlowLayout());

//         button = new JButton("Pick a color");
//         button.addActionListener(this);

//         label = new JLabel();
//         label.setBackground(Color.WHITE);
//         label.setText("This is some text");
//         label.setFont(new Font("MV Boli", Font.PLAIN, 100));
//         label.setOpaque(true);

//         this.add(button);
//         this.add(label);

//         this.pack();
//         this.setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
        
//         if(e.getSource()==button) {

//             JColorChooser colorChooser = new JColorChooser();

//             Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);

//             // label.setForeground(color);
//             label.setBackground(color);
//         }
//     }
// }



// import java.awt.Color;
// import java.awt.event.*;
// import javax.swing.*;

// public class MyFrame extends JFrame implements KeyListener {

//     JLabel label;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500, 500);
//         this.setLayout(null);
//         this.addKeyListener(this);

//         label = new JLabel();
//         label.setBounds(0, 0, 100, 100);
//         label.setBackground(Color.red);
//         label.setOpaque(true);

//         this.add(label);

//         this.setVisible(true);
//     }

//     @Override
//     public void keyTyped(KeyEvent e) {
//         // keytyped = Invoked when a key is typed. Uses keyChar, char output
//         switch(e.getKeyChar()) {
//             case 'a': label.setLocation(label.getX()-1, label.getY());
//             break;
//             case 'w': label.setLocation(label.getX(), label.getY()-1);
//             break;
//             case 's': label.setLocation(label.getX(), label.getY()+1);
//             break;
//             case 'd': label.setLocation(label.getX()+1, label.getY());
//             break;
//         }
//         switch(e.getKeyCode()) {
//             case 37: label.setLocation(label.getX()-1, label.getY());
//             break;
//             case 38: label.setLocation(label.getX(), label.getY()-1);
//             break;
//             case 39: label.setLocation(label.getX(), label.getY()+1);
//             break;
//             case 40: label.setLocation(label.getX()+1, label.getY());
//             break;
//         }
//     }

//     @Override
//     public void keyPressed(KeyEvent e) {
//         // keypressed = Invoked when a physical key is pressed down. Uses KeyCodem int output
//     }

//     @Override
//     public void keyReleased(KeyEvent e) {
//         // keyreleased = called whenever a button is released

//         // System.out.println("You released key char: " +e.getKeyChar());
//         // System.out.println("You released key Code: " +e.getKeyCode());
//     }
// }



// import java.awt.Color;
// import java.awt.event.*;
// import javax.swing.*;

// public class MyFrame extends JFrame implements MouseListener {

//     JLabel label;

//     MyFrame() {
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500, 500);

//         label = new JLabel();
//         label.setBounds(0, 0, 100, 100);
//         label.setBackground(Color.red);
//         label.setOpaque(true);
//         label.addMouseListener(this);

//         this.add(label);

//         this.setLayout(null);
//         this.setVisible(true);
//     }

//     @Override
//     public void mouseClicked(MouseEvent e) {
//         // when you pressed and relased 
//         // System.out.println("You clicked");
//         label.setBackground(Color.yellow);
//     }

//     @Override
//     public void mousePressed(MouseEvent e) {
//         // if you hold down it will start
//         // System.out.println("You clicked");
//         label.setBackground(Color.green);
//     }

//     @Override
//     public void mouseReleased(MouseEvent e) {
//         // when you stop holding down it will start
//         // System.out.println("You clicked");
//     }

//     @Override
//     public void mouseEntered(MouseEvent e) {
//         // mouse enters the area of a compoent
//         // System.out.println("You clicked");
//     }

//     @Override
//     public void mouseExited(MouseEvent e) {
//         // when the mouse exits an area compoent
//         // System.out.println("You clicked");
//     }
// }



// import javax.swing.JFrame;

// public class MyFrame extends JFrame {

//     DragPanel dragPanel = new DragPanel();

//     MyFrame() {

//         this.add(dragPanel);
//         this.setTitle("Drag & Drop demo");
//         this.setSize(600, 600);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);
//     }
// }