import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int age = 21;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }


        System.out.println("Задание 2");

        int temperature = -3;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку!");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }


        System.out.println("Задание 3");
        int speed = 80;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч., то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч., то придётся заплатить штраф.");
        }


        System.out.println("Задание 4");

        int ageHuman = 30;

        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу.");
        }


        System.out.println("Задание 5");

        int ageChild = 10;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе!");
        }
        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься " +
                    "на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься " +
                    "на аттракционе без сопровождения взрослого.");
        }


        System.out.println("Задание 6");

        int standingPlaces = 42;
        int seating = 60;

        if (standingPlaces >= 1 && standingPlaces < 42) {
            System.out.println("В вагоне свободно " + (42 - standingPlaces) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет");
        }
        if (seating >= 1 && seating < 60) {
            System.out.println("В вагоне свободно " + (60 - seating) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет.");
        }

        System.out.println("Задание 7");

        int one = 10;
        int two = 2000;
        int three = 300;
        if (one > two && one > three) {
            System.out.println("one - наибольшее число");
        } else if (two > one && two > three) {
            System.out.println("two - наибольшее число");
        } else if (three > one && three > two) {
            System.out.println("three - наибольшее число");
        }
    }
}
