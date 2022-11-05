import java.util.Scanner;

public class cometSecondVersion {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int currentYear = in.nextInt();
        int boundaryYearPast = currentYear - 200;
        int boundaryYearFuture = currentYear + 100;
        for (int year = currentYear; year > boundaryYearPast ; year --) {
            if (year % 79 == 0) {
            System.out.println("комета пролетала в " + year + " году");}
        }
        for (int year = currentYear; year < boundaryYearFuture; year ++) {
            if (year % 79 ==0) {
                System.out.println("комета пролетит в " + year + " году");}
        }
    }
}