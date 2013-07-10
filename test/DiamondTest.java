import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DiamondTest {

	@Test
	public void should_draw_a_diamon(){
		Diamond diamond = new Diamond(5,"*");
		String dia = diamond.draw();
		String expected = "  *  \n"
						+ " *** \n"
						+ "*****\n"
						+ " *** \n"
						+ "  *  \n";
		assertEquals(expected, dia);
	}
}
