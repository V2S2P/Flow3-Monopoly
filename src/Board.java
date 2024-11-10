import java.util.Arrays;

public class Board {
    private Field[] fields;
    private CardDeck carddeck;

    public Board(String[] fielddata, String[] carddata) {
        // Initialize the fields array with 40 elements
        fields = new Field[40];

        // Call createFields method to populate fields array
        createFields(fielddata);

        // Instantiate CardDeck with carddata
        carddeck = new CardDeck(carddata);
    }

    private void createFields(String[] data) {
        for (int i = 0; i < data.length && i < fields.length; i++) {
            String[] values = data[i].split(",");
            int id = Integer.parseInt(values[0].trim());
            String label = values[1].trim();
            String option = values[2].trim();
            int cost = Integer.parseInt(values[3].trim());
            int income = Integer.parseInt(values[4].trim());
            int otherValue = Integer.parseInt(values[5].trim());

            // Create a new Field object with parsed values
            fields[i] = new Field(id, label, cost, income);
        }
    }

    public Field getField(int id) {
        // Adjust index to match board expectations (e.g., getField(1) returns Start)
        if (id >= 1 && id <= fields.length) {
            return fields[id - 1];
        } else {
            return null; // Handle out-of-bound index gracefully
        }
    }

    public CardDeck getCardDeck() {
        return carddeck;
    }
}

