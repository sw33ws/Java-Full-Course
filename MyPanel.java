// import java.awt.BasicStroke;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Font;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.Image;

// import javax.swing.ImageIcon;
// import javax.swing.JPanel;

// public class MyPanel extends JPanel{

//     Image image;
    
//     MyPanel() {

//         image = new ImageIcon("logo.png").getImage();

//         this.setPreferredSize(new Dimension(500, 500));
//     }

//     public void paint(Graphics g) {

//         Graphics2D g2D = (Graphics2D) g;

//         g2D.setStroke(new BasicStroke(5));
//         g2D.setPaint(Color.blue);

//         // g2D.drawLine(0, 0, 500, 500);
//         // g2D.drawRect(0,0,100,200);
//         // g2D.fillRect(0, 0, 100, 200);
//         // g2D.drawOval(0,0,100,100);
//         // g2D.fillOval(0,0,100,100);
//         // g2D.drawArc(0,0,100,100,0,180);

//         // g2D.setPaint(Color.red);
//         // g2D.fillArc(0,0,100,100,0,180);
//         // g2D.setPaint(Color.white);
//         // g2D.fillArc(0,0,100,100,180,180);

//         // int[] xPoints = {150,250,350};
//         // int[] yPoints = {300,150,300};
//         // // g2D.drawPolygon(xPoints, yPoints, 3);
//         // g2D.fillPolygon(xPoints, yPoints, 3);

//         // g2D.setFont(new Font("ink Free",Font.BOLD,50));
//         // g2D.drawString("You are a winner", 50, 50);

//         g2D.drawImage(image, 0, 0, null);
//     }
// }



// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

// public class MyPanel extends JPanel implements ActionListener {

//     final int PANEL_WIDTH = 500;
//     final int PANEL_HEIGHT = 500;
//     Image enemy;
//     Image backgroundImage;
//     Timer timer;
//     int xVelocity = 2;
//     int yVelocity =1;
//     int x = 0;
//     int y = 0;

//     MyPanel() {

//         this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
//         this.setBackground(Color.black); // can be replaced with a background image
//         enemy = new ImageIcon("logo.png").getImage();

//         backgroundImage = new ImageIcon("logo.png").getImage();

//         timer = new Timer(10, this);
//         timer.start();
//     }

//     public void paint(Graphics g) {

//         super.paint(g); // This is paint the background black

//         Graphics2D g2D = (Graphics2D) g;

//         g2D.drawImage(backgroundImage, 0, 0, null);

//         g2D.drawImage(enemy, x, y, null);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {

//         if(x>=PANEL_WIDTH-enemy.getWidth(null) || x<0) {
//             xVelocity = xVelocity*-1;
//         }
        
//         x = x + xVelocity;
//         if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0) {
//             yVelocity = yVelocity*-1;
//         }
        
//         y = y + yVelocity;
//         repaint();
//     }
// }