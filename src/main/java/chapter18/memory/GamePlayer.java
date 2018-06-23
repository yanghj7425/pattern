package chapter18.memory;

public class GamePlayer implements GameRole {

    private int vitality;
    private int defenses;
    private int attack;

    public GamePlayer() {
        this(VITALITY, DEFENSES, ATTACK);
    }

    public GamePlayer(int vitality, int defenses, int attack) {
        this.vitality = vitality;
        this.defenses = defenses;
        this.attack = attack;
    }

    public GameStateMemory saveState() {
        return new GameStateMemory(getVitality(), getDefenses(), getAttack());
    }

    public void recoverPlayerState(GameStateMemory memento) {
        System.out.println("recovering ...");
        setVitality(memento.getVitality());
        setDefenses(memento.getDefenses());
        setAttack(memento.getAttack());
    }


    public void showGamePlayerState() {
        System.out.println(this.toString());
    }


    public void fighting() {
        System.out.println("fighting ...");
        setVitality(getVitality() - 20);
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getDefenses() {
        return defenses;
    }

    public void setDefenses(int defenses) {
        this.defenses = defenses;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    @Override
    public String toString() {
        return "GamePlayer{" +
                "vitality=" + vitality +
                ", defenses=" + defenses +
                ", attack=" + attack +
                '}';
    }
}
