import java.util.Scanner;

public class secondPartFridays {
    public static void main ( String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число первой пятницы: ");
        int friday = in.nextInt();
        while (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday += 7;
        }
        //homework
    }
}
