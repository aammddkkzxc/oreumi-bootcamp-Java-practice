package _0216;

public class Message {
    private final String command;
    private final String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return command + " " + to;
    }
}
