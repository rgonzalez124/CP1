/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;

        Rectangle box = new Rectangle(75, 149, 249, 99);
        g2.draw(box);
        g2.fill(box);
        Rectangle box1 = new Rectangle(75, 149, 120, 99);
        g2.draw(box1);
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 230, 50, 50); //
        g2.fill(circle);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(250, 230, 50, 50); //
        g2.fill(circle1);
        int xpnts[]= {120,150,250,270};
        int ypnts[]= {150,90,90,150};
        int npts = 4;
        g.fillPolygon(xpnts, ypnts, npts);
        Rectangle box2 = new Rectangle(120, 150, 150, 2);
        g2.draw(box2);
        g2.setColor(Color.white);
        g2.fill(box2);
        Rectangle box3 = new Rectangle(200, 90, 1, 160);
        g2.draw(box3);
        g2.fill(box3);
        Rectangle box4 = new Rectangle(208, 165, 13, 5);
        g2.draw(box4);
        g2.fill(box4);
        Rectangle box5 = new Rectangle(270, 150, 1, 80);
        g2.draw(box5);
        g2.fill(box5);
        Rectangle box6 = new Rectangle(120, 150, 1, 80);
        g2.draw(box6);
        g2.fill(box6);
	/******** Put your code here  *********/





  

        

	
    
    }
}
