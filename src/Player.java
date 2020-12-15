import java.util.ArrayList;

public class Player {

  // NO MORE INSTANCE VARIABLE CAN BE DEFINED
  private String name;  // name of the player
  private ArrayList<Card> cards; // cards the player has

  // YOU CANNOT MODIFY THIS FUNCTION
  public Player(String name) {
    this.name = name;
    cards = new ArrayList<Card>();
  }
  // YOU CANNOT MODIFY THIS FUNCTION
  public String getName() {
    return name;
  }

  // implement this method
  void addCard(Card card) {
	  cards.add(card);
  }

  // implement this method
  public Card playCard() {
	  Card Play;
	  Play = cards.get(0);
	  cards.remove(0);
	  return Play;
  }

  // YOU CANNOT MODIFY THIS FUNCTION
  public void printHand() {
    System.out.print(name);
    System.out.println(" has cards: " + cards);
  }
}
