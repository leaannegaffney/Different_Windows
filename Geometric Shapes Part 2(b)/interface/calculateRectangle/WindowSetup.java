/*
 This program has the same idea as Part 1 and Part 2 but instead of the user typing the
 height and width values into boxes they will use sliders to input the values which will
 then automatically display the perimeter and area calculations.
 */
package calculateRectangle;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class WindowSetup extends JFrame implements ChangeListener
{
    JSlider widthSlider = new JSlider(0,50,0);
    JLabel widthPosition = new JLabel("Width");

    JSlider heightSlider = new JSlider(0,50,0);
    JLabel heightPosition = new JLabel("Height");
    
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
        FlowLayout flowManager = new FlowLayout(FlowLayout.LEFT);
        drawingSurface.setLayout(flowManager);
        
        widthSlider.setMajorTickSpacing(10);
        widthSlider.setMinorTickSpacing(5);
        widthSlider.setPaintTicks(true);
        widthSlider.setPaintLabels(true);
        
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(5);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        
        widthSlider.addChangeListener(this);
        heightSlider.addChangeListener(this);
        
        drawingSurface.add(widthSlider);
        drawingSurface.add(widthPosition);
        drawingSurface.add(heightSlider);
        drawingSurface.add(heightPosition);
        drawingSurface.add(textArea);
        
        setContentPane(drawingSurface);
    }
    
    public void stateChanged(ChangeEvent event)
    {
        JSlider src = (JSlider) event.getSource();
        if(!src.getValueIsAdjusting())
        {
            widthPosition.setText("Width is " + widthSlider.getValue());
        }
        
        if(!src.getValueIsAdjusting())
        {
           heightPosition.setText("Height is " + heightSlider.getValue()); 
        }
       
        rect1.setWidth(widthSlider.getValue());
        rect1.setHeight(heightSlider.getValue());
        
        String showCalculations = "The perimeter of the rectangle is " + rect1.perimeter() + 
        "\nThe area of the rectangle is " + rect1.area();
        
        textArea.setText(showCalculations);
    }      
}
