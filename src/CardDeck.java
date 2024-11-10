import java.util.ArrayList;

public class CardDeck {
    private ArrayList<Card> cards;
    private int counter;

    public CardDeck(String[] carddata) {
        this.cards = new ArrayList<>(100);
        this.counter = 0;
        createCards(carddata);
    }

    public void createCards(String[] data) {
        for (int i = 0; i < data.length; i++) {
            String[] values = data[i].split(",");
            String message = values[0];
            int income = Integer.parseInt(values[1]);
            int cost = Integer.parseInt(values[2]);
            String event = values[3];

            Card c = new Card(message, income, cost, event);
            cards.add(c);
        }
    }

    public Card getNext() {
        if(counter >= cards.size()){
            counter = 0;
        }
        return cards.get(counter++);
    }
}
