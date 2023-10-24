import java.util.Scanner;
public class ArrayRataNilai12_3 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        int[] nilaiMhs= new int[10];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;
        int jmlMhs = 0;
        int countLulus = 0;
        int countTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc12.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc12.nextInt();

            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                countTdkLulus++;
            }
        }
        if (countLulus > 0) {
            rataLulus = totalLulus / countLulus;
            System.out.println("rata-rata nilai yang lulus : " +rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus");
        }
        if (countTdkLulus > 0){
            rataTdkLulus = totalTdkLulus / countTdkLulus;
            System.out.println("Rata-rata nilai yang tidak lulus : " +rataTdkLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus");
        }
    }
}