import java.util.Scanner;
public class RataNilai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j;
        float nilai, totalNilai, rataNilai;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.print("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            System.out.println();

            i++;
        }


    }
}