package chapter18.memory;

public class GameStateMemory {
    private int vitality;
    private int defenses;
    private int attack;

    public GameStateMemory(int vitality, int defenses, int attack) {
        this.vitality = vitality;
        this.defenses = defenses;
        this.attack = attack;
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
}
