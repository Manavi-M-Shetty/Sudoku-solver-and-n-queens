package player;

public class Player {
    String name;
    int age;


    public Player(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public String getPlayerName()
    {
        return this.name;
    }

}
