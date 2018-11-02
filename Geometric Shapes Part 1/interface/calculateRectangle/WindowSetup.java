/*
 This program displays a window with two boxes where the user can enter the width and
 height of a rectangle. When the calculate is pushed the perimeter and area of the 
 rectangle will be calculated and displayed to the user.
 */
package calculateRectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowSetup extends JFrame implements ActionListener
{
	JLabel widthLabel = new JLabel("Width");
    JTextField widthBox = new JTextField(5);
    
    JLabel heightLabel = new JLabel("Height");
    JTextField heightBox = new JTextField(5);
    
    JButton calculateButton = new JButton("Calculate");
    
    JTextArea textArea = new JTextArea(5, 20); 
    
    Rectangle rect1 = new Rectangle ();
    
    public WindowSetup()
    {
        super("Rectangle Calculations");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container drawingSurface = getContentPane();
        drawingSurface.setBackground(new Color(255, 255, 255));
        FlowLayout flowManager = new FlowLayout();
        drawingSurface.setLayout(flowManager);
        
        calculateButton.addActionListener(this);
        
        drawingSurface.add(widthLabel);
        drawingSurface.add(widthBox);
        drawingSurface.add(heightLabel);
        drawingSurface.add(heightBox);
        drawingSurface.add(calculateButton);
        drawingSurface.add(textArea);
        
        setContentPane(drawingSurface);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        int width = Integer.parseInt(widthBox.getText());
        int height = Integer.parseInt(heightBox.getText());
        
        rect1.setWidth(width);
        rect1.setHeight(height);
            
        String displayCalculation = "The perimeter of the rectangle is " + rect1.perimeter() + 
        "\n The area of the rectangle is " + rect1.area();
            
        textArea.setText(displayCalculation);    
    }
}
