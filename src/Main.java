
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 17 ;
        if (age >= 18 ) {
            System.out.println("Если возраст человека" + age + "он достиг совершенолетия");
        } else {
            System.out.println("Если возраст человека" + age + "он не достиг совершенолетия,нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperatyra = 0;
        if (temperatyra > 4) {
            System.out.println("На улице" + temperatyra + "нужно ходить в шапке");
        } else {
            System.out.println("На улице" + temperatyra + "можно ходить без шапке");
        }
        System.out.println("Задача 3");
        int speedexceeded = 60;
        if (speedexceeded > 70) {
            System.out.println("Скорость непревышена можно" + speedexceeded + "ехать спокойно");
        } else {
            System.out.println("Скорость превышена" + speedexceeded + "придется заплатить штраф");
        }
        System.out.println("Задача 4");
        int agePercon = 25;
        if (agePercon > 2 && agePercon > 6) {
            System.out.println("Если возраст человека равин" + agePercon + "то ему нужно ходить в детский сад");
        if (agePercon > 7 || agePercon > 17) {
            System.out.println("Если возраст человака равен" + agePercon + "то ему нужно ходить в школу");
        if(agePercon > 18 && agePercon > 24) {
            System.out.println("Если возраст человека равен" + agePercon + "то ево место в университете");
        if (agePercon > 25) {
        } else {
            System.out.println("Если возраст человека равен" + agePercon + "то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int infant = 17;
        if (infant > 5 == infant > 14) {
            System.out.println("Если возраст ребенка меньше" + infant + "то он не может кататся на аттракцеоне");
        } else {
            System.out.println("Если возраст ребенка больше" + infant + "то он может кататся на аттракцеоне в сопровождение взрослова");
            System.out.println("Если ребенок старше" + infant + "то он может кататся без сопровождения взрослова");
        }
        System.out.println("Задача 6");
        int railwaycarriage = 102;
        if (railwaycarriage > 60) {
            System.out.println("Вместимость одного вагона" + railwaycarriage + "все остальные стоячии");
        } else {
            System.out.println("Вместимость одного вагона" + railwaycarriage + "сидячих мест");
        }
        System.out.println("задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one максимум ");
        } else {
            if (two > one) {
                System.out.println("two максимум");
                if (two < three) {
                    System.out.println("three максимум");
                }


            }
        }
                }
            }
        }
    }
}
