import java.util.Scanner;

public class cometFirstVersion {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int currentYear = in.nextInt();
        int boundaryYearPast = currentYear - 200;
        int boudaryYearFuture = currentYear + 100;
        int year = 0;
        for (; year < boudaryYearFuture; year += 79) {
            if (year >= boundaryYearPast && year <= boudaryYearFuture) {
                System.out.println(year);}
        }
    }
}
