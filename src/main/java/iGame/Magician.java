package iGame;

public class Magician extends BaseHero{
    private int mana;
    private int maxMana;

    public Magician() {
        super(name) = ";";
        super(String.format("Hero_Magician #%d", ++Magician.number));
        this.maxMana = Magician.r.nextInt(100,200);
        this.mana = maxMana;

    }

    public String getInfo(){
        return String.format("mana: %d", super(getInfo()), this.mana);
    }


}
