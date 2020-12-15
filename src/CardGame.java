public class CardGame {

	// YOU CANNOT DEFINE OTHER INSTANCE VARIABLES
	private Player[] players;	// players in this game
	private int numRounds;	// number of rounds in this game
	private Deck deck;		// deck of cards

	// constructor
	// YOU SHOULD NOT MODIFY THIS METHOD
	public CardGame(Player[] players) {
    
		this.players = players;
		deck = new Deck(5);

	}

	// implement this method
	public void play() {
		// find out the number of rounds in this game
		numRounds = (int) 52/players.length;
		//System.out.println(numRounds);
		// distribute cards among players
		for (int i=0;i<numRounds;i++) {
			for (int j=0; j< players.length;j++) {
				players[j].addCard(Deck.drawCard());
			}
		}
		
		// develop the loop for each round
		// (1) print out the cards each player has
		// (2) print out the cards each player plays
		// (3) identify the winner of this round
		for (int k=0;k<numRounds;k++) {
			int winner=1;
			Card[] deckTest=new Card[players.length];
			int[] counter = new int[players.length];
			for (int l=0;l<players.length;l++) {
				players[l].printHand();
			}
			for (int m=0;m<players.length;m++) {
				Card answer = players[m].playCard();
				System.out.println(players[m].getName()+" plays "+answer);
				deckTest[m]=answer;
			}
			for (int n=0;n<deckTest.length;n++) {
				for (int o=0;o<deckTest.length;o++) {
					if (deckTest[n].compareTo(deckTest[o])>0) {
						counter[n]+=1;
					}
				}
			}
			for (int p=0;p<counter.length;p++) {
				if(counter[p]==(players.length-1)) {
					winner=p;
				}
			}
			System.out.println("The winner of this round is "+players[winner].getName()+".");
			System.out.println();
		}
    }
}


