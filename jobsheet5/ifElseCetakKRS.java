package jobsheet5;
import java.util.Scanner;

public class ifElseCetakKRS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad  ---");
        System.out.println("Masukkan semester kali ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
            
        }
        else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 3) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 4) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 5) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 6) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 7) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else if (semester == 8) {
            System.out.println("KRS Semester 2 ditampilkan");
        }
        else{
            System.out.println("Semester tidak valid");
        }
    }
}