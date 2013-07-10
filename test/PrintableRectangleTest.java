import static org.junit.Assert.*;

import org.junit.Test;


public class PrintableRectangleTest {

	@Test
	public void should_print_a_rectangle() {
		PrintableRectangle printer = new PrintableRectangle(5,3);
		
		String draw = printer.draw();
		
		String expectedDraw = "*****\n"+
							  "*   *\n"+
							  "*****\n";
		assertEquals(expectedDraw, draw);
	}

	@Test
	public void should_print_a_small_rectangle() {
		PrintableRectangle printer = new PrintableRectangle(1,1);
		
		String draw = printer.draw();
		
		String expectedDraw = "*\n";
		assertEquals(expectedDraw, draw);
	}
	
}
