import java.util.Scanner;
public class ArrayRataNilai12_2 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;
        int count = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc12.nextInt();
        }
            for (int i = 0; i < nilaiMhs.length; i++) {
                total += nilaiMhs[i];
                if (nilaiMhs[i] > 70){
                    count++;
                }
            }
            
            System.out.println("Banyaknya mahasiswa yang lulus : " +count);
            rata2 = total/nilaiMhs.length;
            System.out.println("Rata-rata nilai = "+rata2);
    }
}