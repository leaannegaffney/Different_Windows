package calculateRectangle;

public class Rectangle 
{
	private int width, height;
    
    public int getWidth()
    {
       return width; 
    }
    
    public int getHeight()
    {
       return height; 
    }
    
    public void setWidth(int widthIn)
    {
       width = widthIn; 
    }
    
    public void setHeight(int heightIn)
    {
      height = heightIn;  
    }
    
    public boolean equalTo(Rectangle rectIn)
    {
        return width == rectIn.width && height == rectIn.height;
    }
    
    public int area()
    {
        return width * height;
    }
    
    public int perimeter()
    {
        return width * 2 + height * 2;
    }
}
