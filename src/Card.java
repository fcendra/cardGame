public class Card{
	public enum RankSort {
		  TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),
		  SIX("6"),SEVEN("7"),EIGHT("8"),NINE("9"),
		  TEN("10"),JACK("J"),QUEEN("Q"),KING("K"),ACE("A"); 
		  private String rankSort;
		  RankSort (String r) {rankSort = r;}
		  public String toString() {return rankSort;}
		}
	enum SuitSort {D,C,H,S};
	private Rank rank;
	private Suit suit;
	private int thisCardRankIndex = 0;
	private int cCardRankIndex = 0;
	private int thisCardSuitIndex = 0;
	private int cCardSuitIndex = 0;
	public Card(Rank rank,Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() {
		String suit = this.suit.toString();
		String rank = this.rank.toString();
		return suit + rank;
	}
	public int compareTo(Card c) { 
		for (RankSort i : RankSort.values()) {
			if (i.toString() == rank.toString()){
				thisCardRankIndex = i.ordinal();
			}
		}
		for (RankSort j : RankSort.values()) {
			if (j.toString() == c.rank.toString()){
				cCardRankIndex = j.ordinal();
			}
		}
		for (SuitSort i : SuitSort.values()) {
			if (i.toString() == suit.toString()){
				thisCardSuitIndex = i.ordinal();
			}
		}
		for (SuitSort j : SuitSort.values()) {
			if (j.toString() == c.suit.toString()){
				cCardSuitIndex = j.ordinal();
			}
		}
		if (thisCardRankIndex > cCardRankIndex) {return 1;}
		else if (thisCardRankIndex < cCardRankIndex) {return -1;}
		else {
			if (thisCardSuitIndex > cCardSuitIndex) {return 1;}
			else if (thisCardSuitIndex < cCardSuitIndex) {return -1;}
			return 0;
		}
	}
}