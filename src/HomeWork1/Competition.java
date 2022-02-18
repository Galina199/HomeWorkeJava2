package HomeWork1;

import HomeWork1.obstruction.Obstruction;
import HomeWork1.participants.Participant;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private Obstruction[] obstructions;
    private Participant[] participants;
    private final String competitionTitle;

    private final List<Participant> lastWinners = new ArrayList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstructions(Obstruction ...obstructions) {
        this.obstructions = obstructions;
    }

    public void setParticipants(Participant ...participants) {
        this.participants = participants;
    }

    public List<Participant> getLastWinners() {
        return lastWinners;
    }

    public void startCompetition() {
        System.out.printf("Начало соревнования %s%n", this.competitionTitle);
        this.lastWinners.clear();

        for (Participant participant : this.participants) {
            boolean success = this.passAllObstructions(participant);
            if (!success) {
                System.out.printf("Участник %s покинул соревнование %%n", participant);
            } else {
                this.lastWinners.add(participant);
            }
        }
    }

    private boolean passAllObstructions(Participant participant) {
        for (Obstruction obstruction : this.obstructions) {
            if (!obstruction.passObstructionBy(participant)) {
                return false; // нет смысла дальше проходить
            }
        }
        return true;
    }

}
