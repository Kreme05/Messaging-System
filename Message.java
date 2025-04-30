/**
 * A class the stores a message between agents.
 * The message includes a sender, recipient, the contents of the message,
 * a pointer to the next message, and can be encoded, encrypted and decrypted.
 */
public class Message {
    private Agent from;
    private Agent to;
    private String contents;
    private Message next;
    private int[] encoded;
    private int [] encrypted;
    private int [] decrypted;

    /**
     * Stores a Message with the sender, recipient and contents.
     * @param from The sender of the message.
     * @param to The recipient of the message.
     * @param contents The messages content.
     */
    public Message(Agent from, Agent to, String contents) {
        this.from = from;
        this.to = to;
        this.contents = contents;
        this.next = null;
        this.encoded = null;
        this.encrypted = null;
        this.decrypted = null;
    }

    /**
     * Mutator method for the sender of the message.
     * @param from the new sender.
     */
    public void setFrom(Agent from) {
        this.from = from;
    }

    /**
     * Accessor method for the sender of the message.
     * @return the sender.
     */
    public Agent getFrom() {
        return from;
    }

    /**
     * Accessor method for the recipient of the message.
     * @return the recipient.
     */
    public Agent getTo() {
        return to;
    }

    /**
     * Mutator method for the recipient of the message.
     * @param to the new recipient.
     */
    public void setTo(Agent to) {
        this.to = to;
    }

    /**
     * Accessor method for the content of the message.
     * @return the messages content.
     */
    public String getContents() {
        return contents;
    }

    /**
     * Mutator method for the content of the message.
     * @param contents the new messages content.
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Accessor method for the next message
     * @return the next message
     */
    public Message getNext() {
        return next;
    }

    /**
     * Mutator method for the next message.
     * @param next the next message.
     */
    public void setNext(Message next) {
        this.next = next;
    }


    /**
     * Converting the message's contents into an array of ASCII values, whether they are empty or not.
     * Each character of the message is assigned an ASCII value.
     */
    public void encode() {
        if (contents == null || contents.isEmpty()) {
            encoded = new int[0];
            return;
        }

        encoded = new int[contents.length()];
        for (int i = 0; i < contents.length(); i++) {
            encoded[i] = contents.charAt(i);
        }
    }

    /**
     * Encrypting the message with a Caesar cipher.
     * @param key the encryption key.
     */
    public void encrypt(int key){
        if (encoded == null || encoded.length == 0) {
            encode();
        }

        encrypted = new int[encoded.length];
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < encoded.length; i++) {
            encrypted[i] = encoded[i] + key;
            text.append((char) encrypted[i]);
        }
        contents = text.toString();
    }

    /**
     * Decrypting the message with a Caesar cipher.
     * @param key the decryption key.
     */
    public void decrypt(int key){
        if (encrypted == null || encrypted.length == 0) {
            return;
        }

        decrypted = new int[encrypted.length];
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < encrypted.length; i++) {
            decrypted[i] = encrypted[i] - key;
            text.append((char) decrypted[i]);
        }
        contents = text.toString();
    }

    /**
     * Displaying the message encoded, encrypted and decrypted.
     * @return A string that includes the message encoded, encrypted and decrypted values.
     */
    public String debugString(){
        return toString() + "\n"
                + getEncoded() + "\n"
                + getEncrypted() + "\n"
                + getDecrypted();
    }

    /**
     * Returning the encoded message as a formatted string.
     * @return The encoded message or "not encoded" if not encoded.
     */
    public String getEncoded() {
        if (encoded == null || encoded.length == 0) {
            return "<not encoded>";
        }

        StringBuilder encodedMessage = new StringBuilder("encoded: ");
        for (int value : encoded) {
            encodedMessage.append("[").append(value).append("]");
        }
        return encodedMessage.toString();
    }

    /**
     * Returning the encrypted message as a formatted string.
     * @return The encrypted message or "not encrypted" if not encrypted.
     */
    public String getEncrypted() {
        if (encrypted == null || encrypted.length == 0) {
            return "encrypted: <not encrypted>";
        }

        StringBuilder encryptedMessage = new StringBuilder("encrypted: ");
        for (int value : encrypted) {
            encryptedMessage.append("[").append(value).append("]");
        }
        return encryptedMessage.toString();
    }

    /**
     * Returning the encrypted message as a formatted string.
     * @return The decrypted message or "not decrypted" if not decrypted.
     */
    public String getDecrypted() {
        if (decrypted == null || decrypted.length == 0) {
            return "decrypted: <not decrypted>";
        }

        StringBuilder decryptedMessage = new StringBuilder("decrypted: ");
        for (int value : decrypted) {
            decryptedMessage.append("[").append(value).append("]");
        }
        return decryptedMessage.toString();
    }


    /**
     * Displaying the agents message.
     * @return A string that includes the senders code name and recipients code name.
     */
    @Override
    public String toString() {
        return "Message from " + from.getCodeName() + " to " + to.getCodeName() + ":\n" + contents;
    }
}


