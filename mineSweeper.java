import java.util.Scanner;

public class mineSweeper {
    public static void main(String[] args) {
                
        String input1 = "...";
        String input2 = ".*.";
        String input3 = ".**";
        String input4 = ".*.";
        String input5 = "***";

        String[] i1 = input1.split("");
        String[] i2 = input2.split("");
        String[] i3 = input3.split("");
        String[] i4 = input4.split("");
        String[] i5 = input5.split("");

        String[][] huruf = {i1, i2, i3, i4, i5};

        int kanan = 0, atas = 0, kiri = 0, bawah = 0, atasKiri = 0, atasKanan = 0, bawahKiri = 0, bawahKanan = 0, jumlah = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (huruf[i][j].equals(".")) {
                    if (j<2) {
                        if (huruf[i][j+1].equals("*")){
                            kanan++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i<5 && i>=0) {
                        if (huruf[i+1][j].equals("*")) {
                            bawah++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>1) {
                        if (huruf[i-1][j].equals("*")) {
                            atas++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j>=1) {
                        if (huruf[i][j-1].equals("*")) {
                            kiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>=1 && j>0) {
                        if (huruf[i-1][j-1].equals("*")) {
                            atasKiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (i>=1 && j<2) {
                        if (huruf[i-1][j+1].equals("*")) {
                            atasKanan++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j>=1 && i<=3) {
                        if (huruf[i+1][j-1].equals("*")) {
                            bawahKiri++;
                            jumlah = atas+kiri+bawah+kanan+atasKiri+atasKanan+bawahKiri+bawahKanan;
                        }
                    }
                    if (j<2 && i<4) {
                        if (huruf[i+1][j+1].equals("*")) {
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
                else if (huruf[i][j].equals("*")) {
                    System.out.print(huruf[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
