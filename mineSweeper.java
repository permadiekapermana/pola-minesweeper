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

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (huruf[i][j].equals(".")){
                    if (j+1 <huruf[i].length && i+1 <huruf[j].length) {
                        if (huruf[i][j+1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i-1][j+1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i+1][j+1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i+1][j].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i+1][j-1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i][j-1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i-1][j-1].equals("*")){
                            System.out.print("1 ");
                        } else if (huruf[i-1][j].equals("*")){
                            System.out.print("1 ");
                        } else {
                            System.out.print(huruf[i][j]+ " ");
                        }
                    }
                } else if (huruf[i][j].equals("*")) {
                    System.out.print(huruf[i][j]+ " ");
                }
            }
            System.out.println();
        }

    }
}
