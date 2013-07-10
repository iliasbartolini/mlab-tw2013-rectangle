
public class PrintableRectangle extends Rectangle{

	private static final String border = "*"; 
	private static final String empty = " "; 
	private static final String new_line = "\n"; 
	
	public PrintableRectangle(int width, int height) {
		super(width, height);
	}

	public String draw() {
		StringBuffer result = new StringBuffer();

		headerFooterLine(result);
		
		for(int j = 0; j < height - 2; j++ ){
			bodyLine(result);
		}
		
		if(height > 1){
			headerFooterLine(result);
		}
		
		return result.toString();
	}

	private void bodyLine(StringBuffer result) {
		result.append(border);
		for(int i = 0; i < width - 2; i++ ){
			result.append(empty);
		}
		result.append(border);
		result.append(new_line);
	}

	private void headerFooterLine(StringBuffer result) {
		for(int i = 0; i < width; i++ ){
			result.append(border);
		}
		result.append(new_line);
	}

}
