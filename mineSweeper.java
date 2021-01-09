import java.util.Scanner;

public class mineSweeper {
    public static void main(String[] args) {
                
        int i, m, n;
        System.out.println("Masukan Jumlah Baris : ");
        Scanner inputan = new Scanner(System.in);
        m = inputan.nextInt();

        System.out.println("Masukan Jumlah Kolom : ");
        Scanner inputan2 = new Scanner(System.in);
        n = inputan2.nextInt();
               

        if (m>100 || n>100) {
            System.out.println("Jumlah baris atau kolom tidak boleh lebih dari 100!");
        }
        else {
            Scanner inputan3 = new Scanner(System.in);
            String[] input = new String[n];
            System.out.println();
            System.out.println("Masukkan pola, gunakan titik (.) untuk menuliskan angka dan bintang (*) untuk menuliskan bom. Jumlah pola per baris tidak boleh lebih dari " + m + "karakter. Dan jumlah pola per kolom tidak boleh lebih dari " + n + "karakter");
            for (i=0; i<m; i++){                    
                    input[i] = inputan3.nextLine();
            }
            System.out.println();
            System.out.println("Hasil :");
            for (i=0; i<m; i++) {
                if (input[i]=="*") {
                    System.out.println("*");
                }
                else {
                    System.out.println(input[i]);
                }
            }
        }

    }
}
