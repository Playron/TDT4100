package Eksamen2017;

public class Table {

	int stoler;
	int bordnummer = 1;
	int num;
	
	public Table(int stoler) {
		this.stoler = stoler;
		this.num = bordnummer++;
	}

	public int getStoler() {
		return stoler;
	}

	public void setStoler(int stoler) {
		this.stoler = stoler;
	}

	public int getNum() {
		return num;
	}	
}
