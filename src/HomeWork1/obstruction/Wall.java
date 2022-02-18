package HomeWork1.obstruction;


import HomeWork1.participants.Participant;

public class Wall implements Obstruction {

    private final int height;

    public Wall(int name) {
        this.height = name;
    }

    @Override
    public boolean passObstructionBy(Participant participant) {
        if (participant.jumpHeight() >= this.height) {
            System.out.printf("Участник %s  перепрыгнул через стену с высотой %d%n", participant, this.height);
            return true;
        } else {
            System.out.printf("Участник %s не смог перепрыгнуть через стену высотой %d%n%n", participant, this.height);
            return false;
        }
    }
}
