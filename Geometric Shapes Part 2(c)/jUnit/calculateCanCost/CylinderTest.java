package calculateCanCost;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CylinderTest 
{
	Cylinder smallCylinder, mediumCylinder, largeCylinder;

    @Before
    public void setUp() throws Exception 
    {
        smallCylinder = new Cylinder();
        mediumCylinder = new Cylinder();
        largeCylinder = new Cylinder();
        
        smallCylinder.setRadius(2);
        smallCylinder.setHeight(5);
        mediumCylinder.setRadius(2);
        mediumCylinder.setHeight(5);
        largeCylinder.setRadius(6);
        largeCylinder.setHeight(10);
    }
    
    @Test
    public void testCylindersAreEqual() 
    {
        assertTrue("The cylinders are not equal",smallCylinder.equalTo(mediumCylinder));
    }
    
    @Test
    public void testCylindersAreNotEqual() 
    {
        assertFalse("The cylinders are equal",smallCylinder.equalTo(largeCylinder));
    }
    
    /*
     I've included a tolerance of 0 on the following tests because there should be no 
     differences in the values. The radius and height are declared as doubles but as they
     are entered with a slider they are actually a whole number but are declared as double
     because they must be calculated with pie which is a double. 
     */
    @Test
    public void testCircleArea()
    {
        assertEquals("The circle area is not correct",12.5664, smallCylinder.circleArea(),0);
    }
    
    @Test
    public void testBothCirclesArea()
    {
        assertEquals("The both circles area is not correct",25.1328, smallCylinder.bothCirclesArea(),0);
    }
    
    @Test
    public void testWallsArea()
    {
        assertEquals("The walls area is not correct",62.832, smallCylinder.wallsArea(),0);
    }
    
    @Test
    public void testSurfaceArea()
    {
        assertEquals("The surface area is not correct",87.9648,smallCylinder.surfaceArea(),0);
    }
}
