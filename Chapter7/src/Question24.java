
public class Question24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] pick = new int[4];
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        shuffle(deck);
        int numOfPicks = 0;
        do {
            pick(deck, pick);
            numOfPicks++;
        } while (!isEachOfDifferent(pick));
        print(pick);
        System.out.println(numOfPicks + " times pick is needed.");
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static void pick(int[] deck, int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            picks[i] = deck[(int) (Math.random() * deck.length)];
        }
    }

    public static boolean isEachOfDifferent(int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (i != j && (picks[i] / 13 == picks[j] / 13))
                    return false;
            }
        }
        return true;
    }

    public static void print(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < picks.length; i++) {
            System.out.println(ranks[picks[i] % 13] + " of " + suits[picks[i] / 13]);
        }
    }
}