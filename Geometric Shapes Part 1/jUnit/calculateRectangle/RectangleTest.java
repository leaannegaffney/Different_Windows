package calculateRectangle;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest 
{
	Rectangle rect1, rect2, rect3;
	/*
	 Because I didn't create a rectangle constructor that would take parameters for the
	 height and width I must set the height and width using my setter methods. 
	 */
	@Before
	public void setUp() throws Exception 
	{
		rect1 = new Rectangle();
		rect2 = new Rectangle();
		rect3 = new Rectangle();
		rect1.setWidth(2);
		rect1.setHeight(3);
		rect2.setWidth(2);
		rect2.setHeight(3);
		rect3.setWidth(6);
		rect3.setHeight(10);
	}
	
	@Test
	public void testRectanglesAreEqual() 
	{
		assertTrue("Rectangles are not equal",rect1.equalTo(rect2));
	}
	
	@Test
	public void testRectanglesAreNotEqual() 
	{
		assertFalse("Rectangles are equal",rect1.equalTo(rect3));
	}
	
	@Test
	public void testArea()
	{
		assertEquals("Area is not correct",6, rect1.area());
	}
	
	@Test
	public void testPerimeter()
	{
		assertEquals("Perimeter is not correct",10, rect1.perimeter());
	}
}
