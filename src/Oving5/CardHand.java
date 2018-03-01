package Oving5;

import java.util.ArrayList;

public class CardHand {
	
	ArrayList<Card> kort;
	
	public CardHand(){
		kort= new ArrayList<Card>();
	}
	
	public int getCardCount() {
		return kort.size();
	}
	
	public Card getCard(int n) {
		return kort.get(n);
	}
	
	public void addCards(Card kortet) {
		if(!(kort.contains(kortet))) {
			kort.add(kortet);
		}else {
			throw new IllegalArgumentException("Kortet finner allerede!");
		}
	}
	
	public void addCards2(Card kortet) {
		for(Card kortstokk : kort) {
			if(kortstokk.getFace() == kortet.getFace() && kortstokk.getSuit() == kortet.getSuit()) {
				throw new IllegalArgumentException("Kortet er der allerede");
			}else {
				kort.add(kortet);
			}
		}
	}
	
	public Card play(int n) {
		Card spillekort = kort.get(n);
		kort.remove(spillekort);
		return spillekort;
	}
	

	public static void main(String[] args) {
		CardHand hand = new CardHand();
		Card c1 = new Card('S', 10);
		Card c2 = new Card('S', 11);
		Card c3 = new Card('H', 11);
		hand.addCards(c1);
		hand.addCards(c2);
		hand.play(1);
		hand.addCards(c3);
		hand.addCards2(c3);
		

	}

}
