import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages; //create a var

    public MessagingService() {
        this.messages = new ArrayList<>(); //instant the var

    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        } else {
            System.out.println("The content exceeds 280 char!");
        }
    }

    public String toString() {
        return "MessagingService{" +
                "messages=" + messages +
                '}';
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

}
