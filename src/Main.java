public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int " + applesCount);
        byte orangesCount = 4;
        System.out.println("Значение переменной orangesCount с типом byte " + orangesCount);
        short catsCount = 3;
        System.out.println("Значение переменной catsCount с типом short " + catsCount);
        long peoploCount = 7_500_800_000L;
        System.out.println("Значение переменной peoploCount с типом long " + peoploCount);
        float pi = 3.141592F;
        System.out.println("Значение переменной pi с типом float " + pi);
        double e = 2.8; // основание натуральношо логарифма
        System.out.println("Значение переменной e с типом double " + e);

        // Задача 2
        System.out.println("Задача 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPepil = papersCount / (pupilsInThirdClass + pupilsInFirstClass + pupilsInSecondClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPepil + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела  бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела  бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела  бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays; // в месяце 30 дней
        System.out.println("За " + minutesInMonth + " минут машина произвела  бутылок " + productivityPerMinute * minutesInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPeeClass = 2;
        int brownCansPeeClass = 4;
        int totalClasses = totalCans / (whiteCansPeeClass + brownCansPeeClass);
        int totalWhiteCans = totalClasses * whiteCansPeeClass;
        int totalBrownCans = totalClasses * brownCansPeeClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + "  банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        short totalBananas = 5;
        short bananasMass1 = 80;
        float totalBananasMassGr = totalBananas*bananasMass1;

        short totalMilk = 2;
        short milkMass1 = 105;
        float totalMilkMassGr = totalMilk * milkMass1;

        short totalIcecream = 2;
        short icecreamMass1 = 100;
        float totalIcecreamMassGr = totalIcecream* icecreamMass1;

        short totalEggs = 4;
        short eggMass1 = 70;
        float totalEggsMassGr = totalEggs*eggMass1;

        //Задача 7
        System.out.println("Задача 7");
        double needQuitGr = 7000;
        double quit250Gr = 250;
        double quit500Gr = 500;
        int needDays250 = (int) (needQuitGr/quit250Gr);
        System.out.println("если сбрасывать по 250гр в день то всего 7 кг можно сбросить за:"+ needDays250);
        int needDays500 = (int) (needQuitGr/quit500Gr);
        System.out.println("если сбрасывать по 500гр в день то всего 7 кг можно сбросить за:"+ needDays500);
        int sredDays = (needDays250+needDays500)/2;
        System.out.println("в среднем понадобиться "+ sredDays);


        //Задача 8
        System.out.println("Задача 8");
        float pastSolaryMashaMonth = 67760;
        float pastSolaryMashaYear = pastSolaryMashaMonth*12;
        float newSolaryMashaMonth = (float) (pastSolaryMashaMonth*1.1);
        float differenceMasha = newSolaryMashaMonth*12 - pastSolaryMashaYear;
        System.out.println("Маша теперь получает "+newSolaryMashaMonth+" рублей. Годовой доход вырос на "+differenceMasha+" рублей");

        float pastSolaryDenysMonth = 83690;
        float pastSolaryDenysYear = pastSolaryDenysMonth*12;
        float newSolaryDenysMonth = (float) (pastSolaryDenysMonth*1.1);
        float differenceDenys = newSolaryDenysMonth*12- pastSolaryDenysYear;
        System.out.println("Денис теперь получает "+newSolaryDenysMonth+" рублей. Годовой доход вырос на "+differenceDenys+" рублей");

        float pastSolaryKristinaMonth = 76230;
        float pastSolaryKristinaYear = pastSolaryKristinaMonth*12;
        float newSolaryKristinaMonth = (float) (pastSolaryKristinaMonth*1.1);
        float differenceKristina = newSolaryKristinaMonth*12- pastSolaryKristinaYear;
        System.out.println("Кристина теперь получает "+newSolaryKristinaMonth+" рублей. Годовой доход вырос на "+differenceKristina+" рублей");

        float totalBreakfastMassKg =
                (totalEggsMassGr*totalBananasMassGr*totalIcecreamMassGr*totalMilkMassGr)/1000;
        System.out.println("вес всего спортивного завтрака в киллограмах: "+ totalBreakfastMassKg);
        System.out.println();
    }
}