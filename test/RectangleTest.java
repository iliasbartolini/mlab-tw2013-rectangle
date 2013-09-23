import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {

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
	
	@Test
	public void should_draw_rectangle(){
		Rectangle rectangle = new Rectangle(3, 5);
		
		String rec = rectangle.draw();
		
		String expected = "*****\n"+
						  "*   *\n"+
						  "*****\n";
		assertEquals(expected, rec);
	}
	
	@Test
	public void should_draw_1By1rectangle(){
		Rectangle rectangle = new Rectangle(1, 1);
		rectangle.setBorder(".");
		String rec = rectangle.draw();
		
		String expected = ".\n";
		assertEquals(expected, rec);
	}
	
	@Test
	public void show_draw_dotted_rectangle(){
		Rectangle rectangle = new Rectangle(3, 5);
		rectangle.setBorder(".");
		String rec = rectangle.draw();
		String expected = ".....\n"
						+ ".   .\n"
						+ ".....\n";
		assertEquals(expected, rec);
	}
}
