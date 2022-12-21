public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 0.763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 0.763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 0.763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sum = firstBoxer + secondBoxer;
        var dif = secondBoxer - firstBoxer;
        System.out.println("Общий вес бойцов = " + sum + "кг.");
        System.out.println("Разница веса бойцов = " + dif + "кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var div = secondBoxer % firstBoxer;
        var dif = secondBoxer - firstBoxer;
        System.out.println("Остаток от деления между весами бойцов = " + div);
        System.out.println("Разница веса бойцов = " + dif + "кг.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 640;
        var emp = 8;
        var staff = hours / emp;
        System.out.println("«Всего работников в компании — " + staff + " человек».");
        var staff1 = staff + 94;
        var hours1 = staff1 * 8;
        System.out.println("«Если в компании работает " + staff1 + " человек, то всего " + hours1 + " часов работы может быть поделено между сотрудниками».");
    }

}