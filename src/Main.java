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
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
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
        friend = friend + 2;
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
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println(firstFighterWeight);
        System.out.println(secondFighterWeight);
        var overallWeight = firstFighterWeight + secondFighterWeight;
        System.out.println(overallWeight);
        var weightDifference = secondFighterWeight - firstFighterWeight;
        System.out.println(weightDifference);
    }

        public static void task7 () {
        System.out.println("Задача 7");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println(firstFighterWeight);
        System.out.println(secondFighterWeight);
        var weightDifferenceOne = secondFighterWeight - firstFighterWeight;
        System.out.println(weightDifferenceOne);
        var weightDifferenceTwo = secondFighterWeight % firstFighterWeight;
        System.out.println(weightDifferenceTwo);
    }

        public static void task8 () {
        System.out.println("Задача 8");
        var overallWorkingTimeOne = 640;
        var workersCapacityOne = overallWorkingTimeOne / 8;
        System.out.println("Всего работников в компании - " + workersCapacityOne + " человек");
        var workersCapacityTwo = workersCapacityOne + 94;
        var overallWorkingTimeTwo = workersCapacityTwo * 8;
        System.out.println("Если в компании работает " + workersCapacityTwo + " человек, то всего " + overallWorkingTimeTwo + " часов работы может быть поделено между сотрудниками");
        var differenceInHourCapacity = overallWorkingTimeTwo - overallWorkingTimeOne;
        System.out.println(differenceInHourCapacity + " часа нужно добавить всвязи с пополнением штата");
        //В задании 8 было сказано, что нужно использовать функцию вычитания
            // в самой задаче она вроде как не нужна, поэтому я отсебя добавил ее, что бюы была
    }
}