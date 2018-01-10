public class Game {



    public static void main (String[] args){

        Card card = new Card();
        Card card2 = new Card(0, 6);

        card.setRank(11);

        System.out.println(card.toString());
        System.out.println(card2.toString());
    }
}
