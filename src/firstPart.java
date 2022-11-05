public class firstPart {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1");
        int total = 0;
        int contribution = 15000;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + contribution;
            month ++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

// Задача 2
        System.out.println("\nЗадача 2");
        int i = 0;
        while ( i < 10) {
            i ++;
            System.out.print(i + " ");
            }
        System.out.println("");
        for (i = 10; i > 0; i -- ) {
            System.out.print(i + " ");
            }
        System.out.println(" ");

        // Задача 3
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int birthrate = (population / 1000) * 17;
        int mortality = (population / 1000) * 8;
        int y = 0;
        while (y < 10) {
            population = population + birthrate - mortality;
            y ++;
            System.out.println("Год " + y + "ый, численность населения составляет " + population + " человек");
        }
    }
}