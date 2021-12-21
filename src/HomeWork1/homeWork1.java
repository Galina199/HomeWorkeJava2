package HomeWork1;

import HomeWork1.obstruction.Obstruction;
import HomeWork1.obstruction.Track;
import HomeWork1.obstruction.Wall;
import HomeWork1.participants.Bot;
import HomeWork1.participants.Cat;
import HomeWork1.participants.Man;
import HomeWork1.participants.Participant;

import java.util.List;
import java.util.Random;

public class homeWork1 {
    public static void main(String[] args) {
        System.out.println("Подготовительный этап");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем соревнования");
        competition.startCompetition();

        List<Participant> lastWinners = competition.getLastWinners();
        if (!lastWinners.isEmpty()) {
            System.out.println("Победители: ");
            for (Participant lastWinner : lastWinners) {
                System.out.println(lastWinner);
            }
        } else {
            System.out.println("Никто не смог преодолеть дистанцию");
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Man("Михаил", 3, 500);
        Participant cat = new Cat("Мурзик", 4, 90);
        Participant robot = new Bot("Робик", 12, 1000);

        Random random = new Random();

        Obstruction wall = new Wall(random.nextInt(5));
        Obstruction track = new Track(random.nextInt(10));

        Competition competition = new Competition("Дружеское соревнование");
        competition.setObstructions(wall, track);
        competition.setParticipants(person, cat, robot);
        return competition;
    }
}
