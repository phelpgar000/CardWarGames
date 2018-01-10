public class Deck {

    Card[] deck = new Card[52];
    Card card;

    //Build the Deck
    public Deck(){
        int cardCount = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 14; j ++){

                deck[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    //Shuffle the Deck
    public void shuffle(){


    }

    //Deal the Deck - returning 1 card from the deck ... multiple cards will be assigned
    //in the main Game class.
    public Card deal(){

        return card;
    }
}
