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
        //Задание 4
        //Переменная возраста уже была. Не будем вводить новую.
        age=18;
        String nadp1="Если возраст человека "+age+", то ему нужно ходить ";
        String nadp2="";
        if (age>=2&&age<=6){
            nadp2="в детский сад";
        }
        if (age>6&&age<=17){
            nadp2="в школу";
        }
        if (age>17&&age<=24){
            nadp2="в университет";
        }
        if (age>24){
            nadp2="на работу";
        }
        System.out.println(nadp1+nadp2);
        //Задание 5
        age=15;
        String nadp="";
        if (age<5){
            nadp="не может кататься на атракционе.";
        }
        if(age>=5&&age<=14){
            nadp="может кататься в сопровождении взрослого.";
        }
        if(age>14){
            nadp="может кататься без сопровождения взрослого.";
        }
        System.out.println("Если возраст ребенка "+age+" и он "+nadp);

        //Задание 6
        byte vmest=102;
        byte sid=60;
        byte pas=101;
        nadp="";

        if(pas<sid){
            nadp="В вагоне "+(sid-pas)+" сидячих мест и "+(vmest-sid)+" стоячих мест.";
        }else{
            if(pas>=sid&&pas<vmest){
                nadp="В вагоне нет сидячих мест. Остались стоячие места в количестве: "+(vmest-pas);
            }else{
                nadp="Вагон полностью заполнен.";
            }

        }
        System.out.println(nadp);
        //Задание 7
        int one=1;
        int two=6;
        int three=4;
        if(one>two&&one>three){
            System.out.println("Первое число наибольшее");
        }
        else
        {
            if(two>three)
            {
                System.out.println("Второе число наибольшее");
            }
            else
            {
                System.out.println("Третье число наибольшее");
            }
        }





    }
}