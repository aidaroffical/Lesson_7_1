public class Medic extends Hero{
    public int healPoints;

    public Medic(int health, int damage, String superpower){
        super(health, damage, superpower);
    }
    public Medic (int healPoints){
        super(0, 0, "");
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public String increaseExperience() {
        int experience = (int) (healPoints * 1);
        System.out.println(healPoints * 1);
        setHealPoints((int) (getHealPoints() + healPoints * 1));

        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("The Medic helped his allies");
    }
}