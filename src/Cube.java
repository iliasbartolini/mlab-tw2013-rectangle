
public class Cube {
	/*
	 * Hello Everyone, I am just checking if you are still using git
	 * Godluck Akyoo<gakyoo@citywebtechnologies.com>
	 * lots of greetings from Tanzania 
	 */
	int width;
	int length;
	int height;
	public Cube(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public int surface_area() {		
		return ((height*width)+(length*width)+(length*height))*2;
	}
}
