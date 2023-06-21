public class Magic extends Hero {
    public Magic(int health, int damage, String superpower){
        super(health, damage, superpower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("the Medic used the superpower CRITICAL DAMAGE");
    }
}
