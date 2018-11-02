package calculateCanCost;

public class Cylinder 
{
	private double radius, height;
    private double pie = 3.1416;
    
    public double getradius()
    {
       return radius; 
    }
    
    public double getHeight()
    {
       return height; 
    }
    
    public void setRadius(double radiusIn)
    {
       radius = radiusIn; 
    }
    
    public void setHeight(double heightIn)
    {
      height = heightIn;  
    }
    
    public double surfaceArea()
    {
      return wallsArea() + bothCirclesArea();
    }
    
    public double circleArea()
    {
        return pie * radius * radius;
    }
    
    public double bothCirclesArea()
    {
        return 2 * pie * radius * radius;
    }
    
    public double wallsArea()
    {
       return 2 * pie * radius * height; 
    }
    
    public boolean equalTo(Cylinder cylinderIn)
    {
      return radius == cylinderIn.radius && height == cylinderIn.height;
    }

}
