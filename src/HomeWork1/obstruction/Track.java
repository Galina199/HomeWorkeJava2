package HomeWork1.obstruction;


import HomeWork1.participants.Participant;

public class Track implements Obstruction {

    private final int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean passObstructionBy(Participant participant) {
        if (participant.runDistance() > this.distance) {
            System.out.printf("Участник %s пробежал дистанцию %d%n", participant, this.distance);
            return true;
        } else {
            System.out.printf("Участник %s не смог пробежать дистанцию %d%n", participant, this.distance);
            return false;
        }
    }
}
