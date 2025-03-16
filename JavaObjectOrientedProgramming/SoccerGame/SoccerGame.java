package JavaObjectOrientedProgramming.SoccerGame;

class Player {

    private String name;
    private int age;
    private String position;

    public Player() {
    }

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {

        switch (position) {
            case "Forward":
                this.position = "Forward";
                System.out.println("Position is :" + position);
                break;
            case "Midfielder":
                this.position = "Midfielder";
                System.out.println("Position is :" + position);
                break;
            case "Defender":
                this.position = "Defender";
                System.out.println("Position is :" + position);
                break;
            case "Goalkeeper":
                this.position = "Goalkeeper";
                System.out.println("Position is :" + position);
                break;
            default:
                System.out.println("Invalid position for: " + position);
                this.position = "Unknown";
                return;
        }
    }

    public void displayPlayer() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
    }

}

class SoccerPlayer extends Player {
    private int goalsScored;
    private int assists;

    public SoccerPlayer() {

    }

    public SoccerPlayer(String name, int age, String position, int goalsScored, int assists) {
        super(name, age, position);
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void updateStats(int goalsScored, int assists) {
        this.goalsScored = goalsScored;
        this.assists = assists;
    }

    @Override
    public void displayPlayer() {
        super.displayPlayer();

        System.out.println("Player Statistics:");
        System.out.println("GoalsScored: " + getGoalsScored());
        System.out.println("Assists: " + getAssists());
    }
}

public class SoccerGame {

    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer("karim", 28, "Forward x", 5, 5);
        soccerPlayer.displayPlayer();

        soccerPlayer.setPosition("Forward");
        soccerPlayer.displayPlayer();
    }

}
