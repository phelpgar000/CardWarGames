public class Game {



    public static void main (String[] args){

        Card card = new Card();
        Card card2 = new Card(0, 6);
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());

    }
}
