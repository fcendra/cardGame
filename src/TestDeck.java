public class TestDeck {
  public static void main(String[] args) {
    Deck deck; 
    deck = new Deck(0);
    System.out.println("The original deck is: ");
    for (int i = 0; i < 52; i++) {
      System.out.print(deck.drawCard() + " ");
    }
    System.out.println();
    System.out.println();

    deck = new Deck(1);
    System.out.println("After shuffling once is: ");
    for (int i = 0; i < 52; i++) {
      System.out.print(deck.drawCard() + " ");
    }
    System.out.println();
    System.out.println();
    
    deck = new Deck(5 );
    System.out.println("After shuffling twice is: ");
    for (int i = 0; i < 52; i++) {
      System.out.print(deck.drawCard() + " ");
    }
    System.out.println();
    System.out.println();
  }
}

