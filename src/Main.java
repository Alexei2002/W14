// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //задача№1
        System.out.println("example 1");
        double dog1 = 8.0;
        var cat1 = 3.6;
        int paper1 = 763789;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);
        //задача №2
        System.out.println("example 2");
        var dog2 = dog1 -4;
        var cat2 = cat1 -4;
        var paper2 = paper1 -4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);
        //Задача№3
        System.out.println("example 3");
        var dog3 = dog2 -3.5;
        var cat3 = cat2 -1.6;
        var paper3 = paper2 -7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);
        //задача № 4
        System.out.println("example 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задача №5)
        System.out.println("example 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        // задача №6
        System.out.println("example 6");
        var boxer2 = 78.2;
        var boxer1 = 82.7;
        System.out.println("Sum of weighrs: " + (boxer1 + boxer2));
        // задача №7
        System.out.println("example 7");
        var diff1 = boxer1 - boxer2;
        var diff2 = boxer1 % boxer2;
        System.out.println("Diff1: " + diff1);
        System.out.println("Diff2: " + diff2);
        // задача № 8
        System.out.println("example 8");
        var hours = 640;
        var hoursPerEmployee = 8;
        var noueberOfEmployees = hours / hoursPerEmployee;
        System.out.println(" Всего работников в компании - " + noueberOfEmployees + "человек");
        noueberOfEmployees = noueberOfEmployees + 94;
        hours = noueberOfEmployees + hoursPerEmployee;
        System.out.println("Если в компании работает " + noueberOfEmployees + "человек, то всего " + hours + " часов работы может быть поделено между сотрудниками».");
    }
}