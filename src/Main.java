public class Main {
    public static void main(String[] args) {
        Magic magicBoy = new Magic();
        Medic medicGirl = new Medic();
        Warrior warriorBoy = new Warrior();

        Hero[] heroArray = {magicBoy, medicGirl, warriorBoy};

        for (int i = 0; i < heroArray.length; i++) {
            heroArray[i].applySuperAbility();
        }
    }
}