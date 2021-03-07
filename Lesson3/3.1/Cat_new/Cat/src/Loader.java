import java.awt.Color;

public class Loader {
    public static void main(String[] args) {
        //создать 5-7 кошек и вызвать разные методы:
        //- посмотреть, какой у них вес
        //- попробовать их покормить и посмотреть что будет с весом
        //- попробовать перекормить кошку, чтобы она взорвалась
        //- "замяукать" кошку до смерти
        Cat cat1 = new Cat();
        System.out.println("cat1 weight " + cat1.getWeight());
        cat1.drink(100000000.2);
        cat1.meow();
        cat1.getWeight();
        cat1.feed(10000000.1);
        System.out.println("cat1 " + cat1.getStatus());


        Cat cat2 = new Cat();
        System.out.println("cat2 weight " + cat2.getWeight());
        int i = 0;
        while (i < 5000) {
            cat2.meow();
            i++;
        }
        cat2.getWeight();
        System.out.println("cat2 " + cat2.getStatus());

        Cat cat3 = new Cat();
        System.out.println("cat3 weight " + cat3.getWeight());
        cat3.setColor(Color.BLACK);
        System.out.println(cat3.getColor());
        System.out.println("cat3 " + cat3.getStatus());

        Cat cat4 = new Cat();
        System.out.println("cat4 weight " + cat4.getWeight());

        Cat cat5 = new Cat();
        System.out.println("cat5 weight " + cat5.getWeight());
        System.out.println(cat5.getStatus());
        System.out.println(cat5.getWeight());

        cat5.feed(50.4);
        cat5.getMeals();

        //Создать в классе Cat метод, который будет возвращать массу съеденной еды
        cat5.feed(300.0);
        System.out.println(cat5.getMeals());

        //Создать в классе Cat метод “сходить в туалет”,
        // который будет уменьшать вес кошки и что-нибудь печатать
        cat5.Restroom();
        System.out.println(cat5.getWeight());
        System.out.println("cat5 " + cat5.getStatus());


        cat4.feed(5000000.0);

        System.out.println("cat4 " + cat4.getStatus());

        Cat cat6 = new Cat(2730);

        System.out.println(cat6.getOwnWeight());
        System.out.println("cat6 " + cat6.getStatus());

        System.out.println(Cat.getCount());

        //копирование объектов
        Cat murka = new Cat("Мурка", 2300.0);
        Cat vasya = new Cat();

        vasya.setName(murka.getName());
        vasya.setWeight(murka.getWeight());
        System.out.println(vasya.getName());
        System.out.println(vasya.getWeight());

        System.out.println(Cat.getCount());
    }
}