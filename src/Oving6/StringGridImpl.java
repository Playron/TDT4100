package Oving6;

import java.util.ArrayList;
import java.util.List;

public class StringGridImpl implements StringGrid {

	int columnCount;
	List<String> elements;
	
	
	public StringGridImpl(int rows, int columncount) {
		elements = new ArrayList<String>(rows * columnCount);
		for(int count = 0; count < rows * columnCount; count++) {
			elements.add(null);
		}
		this.columnCount = columncount;
	}
	

	@Override
	public int getRowCount() {
		return elements.size() / columnCount;
	}


	@Override
	public int getColumnCount() {
		return this.columnCount;
	}


	@Override
	public String getElement(int row, int col) {
		return "hei";
	}


	@Override
	public String setElement(int row, int col, String element) {
		// TODO Auto-generated method stub
		return null;
	}

}
