public class Main {

    public static void main(String[] args) {
// Part 1: Payment Card test cases
//        PaymentCard kevCard = new PaymentCard(10);
//
//        System.out.println("money " + kevCard.balance());
//        boolean wasSuccessful = kevCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + kevCard.balance());
//
//        wasSuccessful = kevCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + wasSuccessful);
//        System.out.println("money " + kevCard.balance());

// Part 2: Payment Terminal test cases
//        PaymentTerminal laurierTerminal = new PaymentTerminal();
//
//        double change = laurierTerminal.eatAffordably(10); //put in 10$ to buy stuff
//        System.out.println("remaining change " + change);
//
//        change = laurierTerminal.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = laurierTerminal.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        change = laurierTerminal.eatHeartily(2);
//        System.out.println("remaining change " + change);
//
//        System.out.println(laurierTerminal);

// Part 3: Payment Terminal test cases
//        PaymentTerminal kevTerminal = new PaymentTerminal();
//
//        double change = kevTerminal.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//
//        PaymentCard kevsCard = new PaymentCard(7);
//
//        boolean wasSuccessful = kevTerminal.eatHeartily(kevsCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = kevTerminal.eatHeartily(kevsCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//        wasSuccessful = kevTerminal.eatAffordably(kevsCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println(kevTerminal);
// Part 4: Adding Money
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}

