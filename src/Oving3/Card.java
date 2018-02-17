package Oving3;

public class Card {
	
	char type;
	int cardValue;
	
	public Card(char type, int cardValue) {
		if(!(type == 'S' || type == 'H' || type == 'D' || type == 'C')) {
			throw new IllegalArgumentException("Type må være enten S, H, D eller C");
		}
		else {
			this.type = type;
		}
		
		if(cardValue > 13 || cardValue <= 0) {
			throw new IllegalArgumentException("Kortverdi må være mellom 0 og 13");
			}else {
				this.cardValue = cardValue;
		}
	}
	
	public char getSuit() {
		return this.type;
	}
	
	public int getFace() {
		return this.cardValue;
	}
	
	
	public String toString() {
		return "" + getSuit() + getFace();
	}
	
	
	

	public static void main(String[] args) {
		Card c1 = new Card('S', 0);
		
	System.out.println(c1);

	}

}
