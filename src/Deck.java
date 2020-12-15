import java.util.ArrayList;
public class Deck{
	private int round=0;
	public static ArrayList<Card>cardsShuffled=new ArrayList<Card>();
	public ArrayList<Card>cards=new ArrayList<Card>();
	public Deck(int n){
		round=n;
		int counter=0;
		ArrayList<Card>cards=new ArrayList<Card>();
		for(Suit i:Suit.values()){
			for(Rank j:Rank.values()){
				cards.add(counter,new Card(j,i));
				counter++;
			}
		}
		ArrayList<Card>set1=new ArrayList<Card>();
		ArrayList<Card>set2=new ArrayList<Card>();
		int loc=0;
		for(int i=0;i<cards.size();i++) {
			if(i<26){
				set1.add(i,cards.get(i));
			}
			else{
				set2.add(loc,cards.get(i));
				loc++;
			}
		}
		if(round==0){
			cardsShuffled=cards;
		}
		else{
			for(int j=0;j<round;j++){
				int loc2=0,loc3=0,loc4=0;
				for(int k=0;k<cards.size();k++){
					if(k%2==0){
						cardsShuffled.add(k,set1.get(loc2));
						loc2++;
					}
					else{
						cardsShuffled.add(k,set2.get(loc3));
						loc3++;
					}
				}
				for(int l=0;l<cards.size();l++){
					if(l<26){
						set1.add(l,cardsShuffled.get(l));
					}
					else{
						set2.add(loc4,cardsShuffled.get(l));
						loc4++;
					}
				}
			}
		}
	}
	public static Card drawCard(){
		Card draw=cardsShuffled.get(0);
		cardsShuffled.remove(0);
		return draw;
	}	
}