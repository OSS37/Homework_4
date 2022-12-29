public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " +age+ ", то он несовершеннолетний и нужно немного подождать");
        }

        System.out.println("Задача 2");
        int t = 26;
        if (t < 5) {
            System.out.println("На улице " +t+ " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " +t+ " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int v = 50;
        if (v <= 60) {
            System.out.println("Если скорость " +v+ ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " +v+ ", то придется заплатить штраф");
        }

        System.out.println("Задача 4");
        int age2 = 19;
        if (age2>=2 && age2<=6 ) {
            System.out.println("Если возраст человека " +age2+ ", то ему нужно ходить в детский сад.");
        }
        else if (age2>=7 && age2<=18 ) {
            System.out.println("Если возраст человека " +age2+ ", то ему нужно ходить в школу.");
        }
        else if (age2>=18 && age2<=24 ) {
            System.out.println("Если возраст человека " +age2+ ", то ему нужно ходить в университет.");
        }
        else {
            System.out.println("Если возраст человека " +age2+ ", то ему нужно ходить на работу.");
        }

        System.out.println("Задача 5");
        int age3 = 9;
        if (age3<=5 ) {
            System.out.println("Если возраст ребенка равен " +age3+ ",то он не может кататься на аттракционе.");
        }
        else if (age3>=5 && age3<=14 ) {
            System.out.println("Если возраст ребенка равен " +age3+ ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " +age3+ ", то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int factSt = 10;
        int factSid = 30;
        int Vmestimost = 102;
        int Sidet = 60;

        if (factSid<Sidet && (factSid+factSt)<Vmestimost) {
            System.out.println("Есть " +(Sidet-factSid)+ " сидячих мест и " + (Vmestimost-factSt-Sidet)+ " стоячих мест");
        }
        else if (factSid==Sidet && factSt<102) {
            System.out.println("Есть " +(Vmestimost-Sidet-factSt)+ " стоячих мест.");
        }
        else {
            System.out.println("Вагон переполнен.");
        }

        System.out.println("Задача 7");
        int one = 300;
        int two = 301;
        int three = 300;

        if (one>=two && one>=three) {
            System.out.println(one + " самое большое число");
        }
        else if (two>=one && two>=three) {
            System.out.println(two + " самое большое число");
        }
        else if (three>=one && three>=two) {
            System.out.println(three + " самое большое число");
        }


    }
}