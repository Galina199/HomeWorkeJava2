package HomeWork1.participants;

public class Bot implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Bot(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Bot %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public int runDistance() {
        System.out.printf("Bot %s способен пробежать %d%n", this.name, this.runLength);
        return this.runLength;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runLength=" + runLength +
                '}';
    }
}