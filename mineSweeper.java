import java.util.Scanner;

public class mineSweeper {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Kolom dan Baris | Pisahkan dengan Spasi");
        String pola = input.nextLine();
        System.out.println();
        String[] sub = pola.split(" ");
        String sub1 = sub[0];
        String sub2 = sub[1];
        int m = Integer.parseInt(sub1);
        int n = Integer.parseInt(sub2);
        
        String inputData[] = new String[m];

        System.out.println("Masukkan Pola per Baris :");
        for (int i=0; i<m; i++) {
            inputData[i] = input.nextLine();
        }

        String huruf[][] = new String[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<inputData[i].length(); j++) {
                huruf[i][j] = inputData[i].charAt(j)+" ";
            }
        }

        System.out.println();
        System.out.println("Hasil Pola mineSweeper :");
        int kanan = 0, atas = 0, kiri = 0, bawah = 0, atasKiri = 0, atasKanan = 0, bawahKiri = 0, bawahKanan = 0, jumlah = 0;

        for (int i=0; i<huruf.length; i++) {
            for (int j=0; j<huruf[i].length; j++) {
                if (huruf[i][j].equals(". ")) {
                    if (j<2) {
                        if (huruf[i][j+1].equals("* ")){
                            kanan++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i<5 && i>=0) {
                        if (huruf[i+1][j].equals("* ")) {
                            bawah++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>1) {
                        if (huruf[i-1][j].equals("* ")) {
                            atas++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j>=1) {
                        if (huruf[i][j-1].equals("* ")) {
                            kiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>=1 && j>0) {
                        if (huruf[i-1][j-1].equals("* ")) {
                            atasKiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>=1 && j<2) {
                        if (huruf[i-1][j+1].equals("* ")) {
                            atasKanan++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j>=1 && i<=3) {
                        if (huruf[i+1][j-1].equals("* ")) {
                            bawahKiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j<2 && i<4) {
                        if (huruf[i+1][j+1].equals("* ")) {
                            bawahKanan++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    System.out.print(jumlah+ " ");

                    kanan=0;
                    kiri=0;
                    bawah=0;
                    atas=0;
                    atasKiri=0;
                    atasKanan=0;
                    bawahKiri=0;
                    bawahKanan=0;
                }
                else if (huruf[i][j].equals("* ")) {
                    System.out.print(huruf[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
    
}
