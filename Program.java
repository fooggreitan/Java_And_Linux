import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException{

        ArrayList<BaseHero> list1 = new ArrayList<>();
        list1.add(new Prizent(1, "Мишка Фредди", 5, 50));
        list1.add(new Prizent(2, "Молния Маквин", 10, 50));
        list1.add(new Prizent(3, "Котик Том", 8, 30));
        list1.add(new Prizent(4, "Зайчик Бонни", 6, 20));

        while (true) {
            System.out.println( "Введите цифру, соответствующую необходимому параметру: \n1 - Показать список \n2 - Добавить игрушку \n3 - Изменить вес \n4 - розыгрыш игрушек");
            
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            scanner.nextLine();

            if (number == 1) {
                showList(list1);
            } else if (number == 2) {
                addNewToy(list1);
            } else if (number == 3) {
                changeWeight(list1);
            } else if (number == 4) {
                giveaway(list1);
            }
        }
    }

    public static void showList(ArrayList<BaseHero> list1) {
        
        for (BaseHero toy : list1) {
            System.out.println(toy);
        }
    }

    public static void giveaway(ArrayList<BaseHero> list1) throws FileNotFoundException {
        if (list1.isEmpty()) {
            System.out.println("Нет игрушек для розыгрыша.");
            return;
        }
        else {
            Random random = new Random();
            int index = random.nextInt(list1.size());
            BaseHero toy = list1.get(index);
            list1.remove(index);

            try (PrintWriter writer = new PrintWriter(new File("res.txt"))) {
                writer.println(toy);
            }

            System.out.println("Призовая игрушка: " + toy);
            System.out.println("Игрушка записана в файл 'res.txt'.");
        }
    }

    public static void addNewToy(ArrayList<BaseHero> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер игрушки: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите название игрушки: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество игрушек игрушки: ");
        int сount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите частоту выпадения игрушки: ");
        int frequency = scanner.nextInt();
        scanner.nextLine();
        list.add(new Prizent(number, name, сount, frequency));
        System.out.println("Игрушка успешно добавлена.");
    }

    public static void changeWeight(ArrayList<BaseHero> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер игрушки, для которой нужно изменить вес: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            BaseHero toy = list.get(i);
            if (toy.getToyId() == number) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Введите новый вес игрушки: ");
            int newWeight = scanner.nextInt();
            scanner.nextLine();

            BaseHero toy = list.get(index);
            toy.toyFrequency = newWeight;
            System.out.println("Вес игрушки успешно изменен.");
        } 
        else {
            System.out.println("Игрушка с указанным номером не найдена.");
        }
    }
}