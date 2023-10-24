import java.util.Scanner;
public class ArrHitungNilai12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int[] elemen = new int[10];
        int jmlElemen = 0;
        int max_num, min_num;
        double total = 0;
        double rata2;

        System.out.print("Masukkan jumlah elemen: ");
        jmlElemen = sc12.nextInt();

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-"+i+": ");
            elemen[i] = sc12.nextInt();
        }
        max_num = elemen[0];
        for (int i = 0; i < jmlElemen; i++) {
            if (elemen[i] > max_num) {
                 max_num = elemen[i];
            }
        }
        min_num = elemen[0];
        for (int i = 0; i < jmlElemen; i++) {
            if (elemen[i] < min_num) {
                min_num = elemen[i];
            }
        }
        rata2 = elemen[0];
        for (int i = 0; i < jmlElemen; i++) {
            total += elemen[i];
        }
        rata2 = total/jmlElemen;
        System.out.println("Nilai tertinggi adalah: " +max_num);
        System.out.println("Nilai terendah adalah: " +min_num);
        System.out.println("Rata-rata nilai adalah: "+rata2);
    }
}