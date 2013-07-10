import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {
//I have added this comment as David
	@Test
	public void should_calculate_area() {
		Rectangle rectangle = new Rectangle(10,15);
		
		int area = rectangle.area();
		
		assertEquals(150, area);
	}

	@Test
	public void should_calculate_perimeter() {
		Rectangle rectangle = new Rectangle(10,15);
		
		int perimeter = rectangle.perimeter();
		
		assertEquals(50, perimeter);
	}
}
