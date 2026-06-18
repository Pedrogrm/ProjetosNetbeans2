/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApiBrasil;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Point2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author pedro
 */
public class DegraD extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
    
        super.paintComponents(g);
        
        Graphics2D g2D = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(
                0, 0, new Color(13, 71, 161),   
                getWidth(), getHeight(), new Color(66, 165, 245) 
        );
        
        g2D.setPaint(gp);
        g2D.fillRect(0, 0, getWidth(), getHeight());
    }
        
        
//    private Color startColor;
//    private Color endColor;
//    
//    public DegraD(Color startColor, Color endColor){
//        
//        this.startColor = startColor;
//        this.endColor = endColor;
//    }
//    
//    @Override
//    protected void paintComponent(Graphics g){
//       super.paintComponent(g);
//       
//       Graphics2D grad2D = (Graphics2D) g.create();
//       
//       GradientPaint gradienteDegrade = new GradientPaint(
//               new Point2D.Float(0, 0),startColor,
//               new Point2D.Float(0, getHeight()) ,endColor
//       );
//       
//       grad2D.setPaint(gradienteDegrade);
//       grad2D.fillRect(0, 0, getWidth(), getHeight());    
//       
//       grad2D.dispose();

        
    }
    //public static void main(String[] args){
            
//        JFrame frame = new JFrame("Brasil_API");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new GridLayout(2, 2));
//        
//        DegraD panel = new DegraD(Color.decode("#1B5E20"), Color.decode("#2E7D32"));
//        
//        frame.add(panel);
//        frame.setSize(800, 600);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
        
    //}


