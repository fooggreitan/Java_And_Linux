import java.util.ArrayList;
import java.util.Random;

// Добавить файл с описанием интерфейса. В котором описать два метода, 
// void step(); и String getInfo(); Реализовать имнтерфейс в абстрактном классе. Создать два списка в классе main. В каждый из списков добавить по десять 
// экземнляров наследников абстрактноuj классf. Реализовать метод step() таким образом, чтобы они отображали типы персонажей.

public class Program {
    public static void main(String[] args) {

        int teamCount = 10;
        Random rand = new Random();

        ArrayList<BaseHero> list1 = new ArrayList<>();
        ArrayList<BaseHero> list2 = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(5);
            switch (val) {
                case 0:
                    list1.add(new Crossbowman("Амар", 50, 10, 10, 20));
                    break;
                case 1:
                    list1.add(new Magician("Мармар", 30, 14, 5, 10));
                    break;
                case 2:
                    list1.add(new Priest("Мешаул", 60, 10, 20, 30));
                    break;
                case 3:
                    list1.add(new Robber("Ко", 10, 20, 40, 60, 65));
                    break;
                default:
                    list1.add(new SniperHero("Кларк", 50, 40, 20, 40));
                    break;
            }
            System.out.println(list1.get(i).getInfo());

            switch (val) {
                case 0:
                    list2.add(new Crossbowman("Амар", 50, 10, 10, 20));
                    break;
                case 1:
                    list2.add(new Magician("Мармар", 30, 14, 5, 10));
                    break;
                case 2:
                    list2.add(new Priest("Мешаул", 60, 10, 20, 30));
                    break;
                case 3:
                    list2.add(new Robber("Ко", 10, 20, 40, 60, 65));
                    break;
                default:
                    list2.add(new SniperHero("Кларк", 50, 40, 20, 40));
                    break;
            }
            System.out.println(list2.get(i).getInfo());
            
        }

        list1.forEach(u -> u.step());
        list2.forEach(u -> u.step());
    }
}