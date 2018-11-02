/*
This program requests the user to enter in the price per unit area of a can and then to 
use the sliders to set the radius and height of the can. The cost of producing the can is
displayed once the user clicks the calculate button. 
 */
package calculateCanCost;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;

public class WindowSetup extends JFrame implements ChangeListener, ActionListener
{
    JLabel costLabel = new JLabel("Cost per unit area");
    JTextField costBox = new JTextField(5);
    
    JSlider radiusSlider = new JSlider(0,50,0);
    JLabel radiusPosition = new JLabel("Radius");

    JSlider heightSlider = new JSlider(0,50,0);
    JLabel heightPosition = new JLabel("Height");
    
    JButton costButton = new JButton("Calculate Price of Can");
    
    JTextArea textArea = new JTextArea(1, 23); 
    
    Cylinder can = new Cylinder ();
    
    public WindowSetup()
    {
        super("Costing for a can");
        setSize(300, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container drawingSurface = getContentPane();
        drawingSurface.setBackground(new Color(204, 229, 255));
        FlowLayout flowManager = new FlowLayout(FlowLayout.LEFT);
        drawingSurface.setLayout(flowManager);
        
        radiusSlider.setMajorTickSpacing(10);
        radiusSlider.setMinorTickSpacing(5);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(5);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        
        costButton.addActionListener(this);
        radiusSlider.addChangeListener(this);
        heightSlider.addChangeListener(this);
        
        drawingSurface.add(costLabel);
        drawingSurface.add(costBox);
        drawingSurface.add(radiusSlider);
        drawingSurface.add(radiusPosition);
        drawingSurface.add(heightSlider);
        drawingSurface.add(heightPosition);
        drawingSurface.add(costButton);
        drawingSurface.add(textArea);
        
        setContentPane(drawingSurface);
    }
    
    public void stateChanged(ChangeEvent event)
    {
        JSlider src = (JSlider) event.getSource();
        if(!src.getValueIsAdjusting())
        {
            radiusPosition.setText("Radius is " + radiusSlider.getValue());
        }
        
        if(!src.getValueIsAdjusting())
        {
           heightPosition.setText("Height is " + heightSlider.getValue()); 
        }
        
        can.setRadius(radiusSlider.getValue());
        can.setHeight(heightSlider.getValue());
    }
    
    public void actionPerformed(ActionEvent event)
    {
    	DecimalFormat df = new DecimalFormat("###.###");
        double pricePerUnitArea = Double.parseDouble(costBox.getText());
        
        String cost = df.format(pricePerUnitArea * can.surfaceArea());
        
        String showCalculations = "The cost of producing the can is €" + cost;
        
        textArea.setText(showCalculations);
    }
}