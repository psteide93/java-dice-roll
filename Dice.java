public class Dice {
    public static void main(String[] args) {
        byte diceRoll = 0;
        byte twoCounter = 0;
        byte fourCounter = 0;
        byte sixCounter = 0;
        byte sevenCounter = 0;

        while (diceRoll < 100) {
            double total = diceRoll() + diceRoll();
            if (total == 2) {
                twoCounter++;
            } else if (total == 4) {
                fourCounter++;
            } else if (total == 6) {
                sixCounter++;
            } else if (total == 7) {
                sevenCounter++;
            }
            diceRoll++;
        }
        System.out.println(String.format("2 was rolled %d times", twoCounter));
        System.out.println(String.format("4 was rolled %d times", fourCounter));
        System.out.println(String.format("6 was rolled %d times", sixCounter));
        System.out.println(String.format("7 was rolled %d times", sevenCounter));
    }

    private static double diceRoll() {
        return Math.floor((Math.random() * 6 + 1));
    }
}