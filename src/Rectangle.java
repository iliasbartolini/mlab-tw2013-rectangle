public class Rectangle {

	int width;
	int height;
	String border = "*";

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setBorder(String border){
		this.border = border;
	}

	public int area() {
		return width * height;
	}

	public int perimeter() {
		return (width + height) * 2;
	}

	public String draw() {
		String rectangle = "";

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {

				if (i == 0 || i == (width - 1)) {
					rectangle +=border;
				}

				if (i > 0 && i < (width - 1)) {
					String midRow = "";
					if (j == 0) {
						midRow += border;
					}
					if (j > 0 && j < height - 1) {
						midRow += " ";
					}
					if (j == (height - 1)) {
						midRow += border;
					}
					rectangle += midRow;
				}

				if (j == (height - 1)) {
					rectangle += "\n";
				}
			}
		}
		return rectangle;
	}

}
