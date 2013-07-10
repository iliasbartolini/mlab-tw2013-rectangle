import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CubeTest {

	@Test 
	public void should_calculate_surface_area(){
		Cube cube = new Cube(1, 1,1);
		int surface_area = cube.surface_area();
		assertEquals(6, surface_area);
	}
}
