package Oving5;

import java.util.ArrayList;

public class CardDeck {
	
	
	public ArrayList<Card> kortstokk = new ArrayList<Card>();
	
	
	public CardDeck(int i) {
		for(int j = 1; j <= i; j++) {
			kortstokk.add(new Card('S', j));
		}
		for(int k = 1; k <= i; k++) {
			kortstokk.add(new Card('H', k));
		}
		for(int l = 1; l <= i; l++) {
			kortstokk.add(new Card('D', l));
		}
		for(int m = 1; m <= i; m++) {
			kortstokk.add(new Card('C', m));
		}
		
		
	}
	
	
	public int getCardCount() {
		return kortstokk.size();
	}
	
	public Card getCard(int n) {
		return kortstokk.get(n);
	}
	
	public void shufflePerfectly() {
		int halfSize = kortstokk.size() / 2;
		for (int i = 0; i < halfSize; i++) {
			Card card = kortstokk.remove(halfSize + i);
			kortstokk.add(i * 2 + 1, card);
		} 
	}
	
	public void deal(CardHand bunke, int n) {
		for(int i = 0; i<=n; i++) {
			bunke.addCards(getCard(i));
			kortstokk.remove(getCard(i));
		}
	}
	
	
	
	public static void main(String[] args) {
		CardDeck deck1 = new CardDeck(4);
		System.out.println(deck1.getCard(12));
		CardHand hand = new CardHand();
		deck1.deal(hand, 1);
		
	}


}
