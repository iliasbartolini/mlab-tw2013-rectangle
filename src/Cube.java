
public class Cube {

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
