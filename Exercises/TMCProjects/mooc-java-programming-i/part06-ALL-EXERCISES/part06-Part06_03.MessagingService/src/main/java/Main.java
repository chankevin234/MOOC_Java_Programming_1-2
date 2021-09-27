public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService iMessage = new MessagingService();
        Message text1 = new Message("Kevin", "Are we cool?");
        Message text2 = new Message("Amanda", "Yes");
        iMessage.add(text1);
        iMessage.add(text2);

        System.out.println(iMessage);
    }
}
