package Eksamen2017;

public class Seating {

	Table bord;
	Group gruppe;
	
	public Seating(Table bord, Group gruppe) {
		if(bord.getStoler() < gruppe.getGjester()) {
			throw new IllegalArgumentException("For mange gjester!");
		}else {
			this.bord = bord;
			this.gruppe = gruppe;
		}
	}
		

	public Table getBord() {
		return bord;
	}

	public void setBord(Table bord) {
		this.bord = bord;
	}

	public Group getGruppe() {
		return gruppe;
	}

	public void setGruppe(Group gruppe) {
		this.gruppe = gruppe;
	}
	
	public static void main(String[] args) {
		Seating s1 = new Seating(new Table(7), new Group(7));
	}
	
}
