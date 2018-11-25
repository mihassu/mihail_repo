import participants.*;


public class Team  {

    private String teamName;
    private Participant[] participant = new Participant[4];

    public Team(String teamName) {
        this.teamName = teamName;
        participant[0] = new Human("Bob");
        participant[1] = new Cat("Barsik");
        participant[2] = new Dog("Bobik");
        participant[3] = new Horse("Stallion");
    }

    public Participant[] getParticipant(){
        return participant;
    }

    public String getTeamName() {
        return teamName;
    }

    public void showResult() {
        System.out.println("Участники: ");
        for(Participant p: participant){
            System.out.println(p.getName());
        }
        System.out.println();


    }

    public void showWinResult() {
        System.out.println("Справились: ");
        for(Participant p: participant){
            if(p.isActive())
                System.out.println(p.getName());
        }
    }
}
