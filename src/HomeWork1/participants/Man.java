package HomeWork1.participants;

public class Man implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Man(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Man %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public int runDistance() {
        System.out.printf("Man %s способен пробежать %d%n", this.name, this.runLength);
        return this.runLength;
    }


    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runLength=" + runLength +
                '}';
    }
}