import obstacles.*;
import participants.Participant;


public class Course {

    Obstacle[] stage1 = new Obstacle[4];

    public Course() {
        this.stage1[0] = new Cross(200);
        this.stage1[1] = new Water(20);
        this.stage1[2] = new Wall(2);
        this.stage1[3] = new Wall(50);
    }

    public void start(Team team) {
        for(Participant t: team.getParticipant()) {
            for(Obstacle c: stage1) {
                c.doIt(t);
                if(!t.isActive()) {
                    break;
                }
            }
        }
    }
}
