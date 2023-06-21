public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(250, 80, "");
        Magic magic = new Magic(220, 70, "");
        Medic medic = new Medic(330, 0, "");
        Hero[] heroes={ warrior, magic, medic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}