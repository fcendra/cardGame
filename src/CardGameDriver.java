// YOU CANNOT MODIFY THIS FILE
public class CardGameDriver {

  public static void main(String[] args) {

    Player[] players = InitializePlayer.getPlayers();
    CardGame game = new CardGame(players);
    game.play();
  }
}