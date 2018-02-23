package Oving6;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Named o1, Named o2) {
		int differanse = o1.getFamilyName().compareTo(o2.getFamilyName());
		if(differanse == 0) {
			differanse = o1.getGivenName().compareTo(o2.getGivenName());
		}
		return differanse;
	}
		
	
	

}
