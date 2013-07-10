import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {

	@Test
	public void should_calculate_area() {
		Rectangle rectangle = new Rectangle(10,15);
		
		int area = rectangle.area();
		//this is my change
		assertEquals(150, area);
	}

	@Test
	public void should_calculate_perimeter() {
		Rectangle rectangle = new Rectangle(10,15);
		
		int perimeter = rectangle.perimeter();
		
		assertEquals(50, perimeter);
	}
}
