
public class Rectangle {

	protected int width;
	protected int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return (width + height) * 2;
	}

}
