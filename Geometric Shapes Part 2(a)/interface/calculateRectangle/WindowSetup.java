/*
 This program is similar to Part 1 where the user enters the height and width into the 
 boxes with the only difference being that the perimeter and area of the rectangle will 
 be displayed separately when the perimeter or area  buttons are pressed.
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
    
    JButton areaButton = new JButton("Calculate Area");
    JButton perimeterButton = new JButton("Calculate Perimeter");
    
    JTextArea textArea = new JTextArea(5, 20); 
    
    Rectangle rect1 = new Rectangle ();
    
    public WindowSetup()
    {
        super("Rectangle Calculations");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container drawingSurface = getContentPane();
        drawingSurface.setBackground(new Color(255, 255, 255));
        FlowLayout flowManager = new FlowLayout();
        drawingSurface.setLayout(flowManager);
        
        areaButton.addActionListener(this);
        perimeterButton.addActionListener(this);
        
        drawingSurface.add(widthLabel);
        drawingSurface.add(widthBox);
        drawingSurface.add(heightLabel);
        drawingSurface.add(heightBox);
        drawingSurface.add(areaButton);
        drawingSurface.add(perimeterButton);
        drawingSurface.add(textArea);
        
        setContentPane(drawingSurface);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        int width = Integer.parseInt(widthBox.getText());
        int height = Integer.parseInt(heightBox.getText());
        
        rect1.setWidth(width);
        rect1.setHeight(height);
            
        String showPerimeter = "The perimeter of the rectangle is " + rect1.perimeter();
        String showArea = "The area of the rectangle is " + rect1.area();
        if(event.getSource() == areaButton)
        {
            textArea.setText(showArea);
        }
        else
        {
        	textArea.setText(showPerimeter);
        }     
    }
}
