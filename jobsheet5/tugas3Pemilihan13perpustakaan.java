package jobsheet5;
import java.util.Scanner;
public class tugas3Pemilihan13perpustakaan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("bawa kartu mahasiswa (true/false): ");
        boolean kartu = sc.nextBoolean();

        System.out.println("sudah registrasi online (true/false): ");
        boolean regis = sc.nextBoolean();

        if (kartu == true || regis == true) {
            System.out.println("Boleh masuk");
            
        }else{
            System.out.println("Tidak boleh masuk");
        }
        
    }
}

