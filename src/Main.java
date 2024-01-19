public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        byte age=20;
        if (age<18)
        {
            System.out.println("Вы не достигли совепшеннолетия. Нужно немного подождать.");
        }
        else
        {
            System.out.println("Вы совершеннолетний.");
        }
        //Задание 2
        byte temp=4;
        System.out.println("Сегодня "+temp+" градусов.");
        if (temp<5)
        {
            System.out.println("Холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("Тепло, можно идти без шапки");
        }
        //Задание 3
        byte speed=61;
        if (speed<=60)
        {
            System.out.println("Скорость " + speed + " км/ч. Можно ехать спокойно.");
        }
        else
        {
            System.out.println("Скорость " + speed + " км/ч. Придется заплатить штраф.");
        }

    }
}