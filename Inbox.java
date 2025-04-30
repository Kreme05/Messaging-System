/**
 * A class that stores the messages being received in the inbox.
 * The messages are stored from most recent to oldest and are removed once read.
 */
public class Inbox {
    private Message recent;

    /**
     * Setting the inbox to empty.
     */
    public Inbox() {
        this.recent = null;
    }

    /**
     * Storing all the messages received in the inbox.
     * @param message the message being received.
     */
    public void receive(Message message) {
        message.setNext(recent);
        recent = message;
    }

    /**
     * Reading and removing the recent messages.
     * When the inbox is empty, "No message to read." will be printed.
     * @return The recent message or null if the inbox is empty.
     */
    public Message read(){
        if (recent == null){
            System.out.println("No message to read.");
            return null;
        }

        Message messageToRead = recent;
        recent = recent.getNext();
        messageToRead.setNext(null);
        return messageToRead;
    }

    /**
     * Printing all the messages from the most recent message.
     * Once there are no more messages "no more messages" is printed.
     */
    public void printAll(){
        printAllRec(recent);
        System.out.println("<no more messages>");
    }

    /**
     * Printing the messages from the inbox recursively.
     * @param message The message being printed.
     */
    private void printAllRec(Message message){
        if (message == null){
            return;
        }
        System.out.println(message.getContents());
        printAllRec(message.getNext());
    }
}
