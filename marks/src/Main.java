import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = new String(new char[75]).replace('\0', '*');
        int[] mark1 = new int[4];
        int[] mark2 = new int[4];
        int[] mark3 = new int[4];
        String[] grade = new String[4];
        int total1 = 0, total2 = 0, total3 = 0,total4 = 0;
        String[] roll = { "101", "102", "103", "104" };
        String[] name = new String[4];

        // Input student data and calculate totals
        for (int i = 0; i < 4; i++) {
            System.out.print("Name: ");
            name[i] = input.next();
            System.out.print("MARK1: ");
            mark1[i] = input.nextInt();
            System.out.print("MARK2: ");
            mark2[i] = input.nextInt();
            System.out.print("MARK3: ");
            mark3[i] = input.nextInt();
        }
        total1 = mark1[0] + mark2[0] + mark3[0];
        total2 = mark1[1] + mark2[1] + mark3[1];
        total3 = mark1[2] + mark2[2] + mark3[2];
        total4 = mark1[3] + mark2[3] + mark3[3];
        int[] total = {total1 , total2, total3, total4};
        // int[] marks = {}
        int[] avg = { total1 / 3, total2 / 3, total3 / 3, total4 / 3};

        // Calculate grades based on average
        for (int n = 0; n < 4; n++) {
            if (avg[n] > 79.9) {
                grade[n] = "A";
            } else if (avg[n] > 74.9) {
                grade[n] = "B+";
            } else if (avg[n] > 64.9) {
                grade[n] = "B";
            } else if (avg[n] > 54.9) {
                grade[n] = "C+";
            } else if (avg[n] > 49.9) {
                grade[n] = "C";
            } else if (avg[n] > 39.9) {
                grade[n] = "D";
            } else{
                grade[n] = "F";
            }
        }

        // Print the header
        System.out.println(line);
        System.out.println("\t\t\t\t\t\tSTUDENT MARKLIST");
        System.out.println(line);
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");

        // Print student data in a tabular format
        for (int n = 0; n < 4; n++) {
            System.out.println(roll[n] + "\t\t" + name[n] + "\t" + mark1[n] + "\t\t" + mark2[n] + "\t\t" + mark3[n] + "\t\t"
                    + total[n] + "\t\tP\t\t" + (float)avg[n] + "\t" + grade[n]);
        }
    }
}
