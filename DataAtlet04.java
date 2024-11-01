import java.util.Scanner;
public class DataAtlet04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang = 4;
        int atletPerCabang = 5;

        System.out.println("Masukkan Instansi: ");
        String instansi = sc.nextLine();
        for (int i = 1; i <= jumlahCabang; i++) {
            String cabangOlahraga = "";
            switch (i) {
                case 1:
                    cabangOlahraga = "Badminton";
                    break;
                case 2:
                    cabangOlahraga = "Tenis Meja";
                    break;
                case 3:
                    cabangOlahraga = "Basket";
                    break;
                case 4:
                    cabangOlahraga = "Bola Voli";
                    break;
                default:
                    System.out.println("Cabang tidak valid.");
                    return;
            }

            System.out.println("Masukkan nama atlet untuk cabang: " + cabangOlahraga);
            int j = 1;
            while (j <= atletPerCabang) {
                System.out.print("Masukkan nama atlet ke-" + j + ": ");
                String namaAtlet = sc.nextLine();
                System.out.println("Atlet Terdaftar: " + namaAtlet + " - Cabang: " + cabangOlahraga);

                j++;
            }
        }
    }
}
    