public class secondPart {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int total = 0;
        int contribution = 15000;
        int month = 0;
        while (total < 12_000_000) {
            total = total + contribution;
            total = total + 7 * total / 100;
            month ++;
            System.out.println("Месяц " + month + "ый. Накоплено " + total + " рублей");
        }
        System.out.println("\nЧтобы накопить 12 000 000 рублей, Василию понадобится " + month + " месяцев");

        //задача 2
        System.out.println("\nзадача 2");
        int total1 = 0;
        int contribution1 = 15000;
        int m1 = 0;
        while (total1 < 12_000_000) {
            total1 = total1 + contribution1;
            total1 = total1 + 7 * total1 / 100;
            m1++;
            if ( m1 % 6 == 0) {
            System.out.println("Месяц " + m1 + "ый. Накоплено " + total1 + " рублей");}
        }

        //задача 3
        System.out.println("\nзадача 3");
        int total2 = 0;
        int contribution2 = 15000;
        int m2 = 0;
        while ( m2 < 108) {
            total2 = total2 + contribution2;
            total2 = total2 + 7 * total2 / 100;
            m2 ++;
            if (m2 % 6 == 0) {
                System.out.println("За полгода было накоплено " + total2 + " рублей");
                }
        }
    }
}
