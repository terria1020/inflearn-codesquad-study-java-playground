package terria1020.calender;

import java.util.Scanner;

public class Calender {

    private static final int[] MAX_DAYS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    private static final String PROMPT = "> ";

    public int month;

    public int getLastDaysOfMonth(int month) {
        return MAX_DAYS[month - 1];
    }

    public void printCalender() {
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("---------------------");
        System.out.println(" 1 2 3 4 5 6 7");
        System.out.println(" 8 9 10 11 12 13");
        System.out.println(" 14 15 16 17 18 19");
        System.out.println(" 20 21 22 23 24 25");
        System.out.println(" 26 27 28 29 30 31");
    }

    public static int getMonth() {
        System.out.println("달을 입력하세요: ");
        System.out.print(PROMPT);

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int month;
        int maxDay;
        Scanner sc = new Scanner(System.in);
        Calender calender = new Calender();

        while (true) {
            calender.month = getMonth();
            if (calender.month == -1) {
                break;
            } else if (calender.month > 12 || calender.month < 1) continue;

            calender.printCalender();
        }
        System.out.println("Bye!");
    }
}
