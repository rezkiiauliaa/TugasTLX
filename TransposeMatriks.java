import java.util.Scanner;

public class TransposeMatriks {
    public static void main(String[] args) {
        int c,d;

        int matriks [][] = new int[3][3];
        int transpose [][] = new int[3][3];
        Scanner isi = new Scanner(System.in);

        for(c = 0; c < 3; c++){
            for(d = 0; d< 3; d++){
              matriks[c][d] = isi.nextInt();
            }
          }
          for(c = 0; c < 3; c++){
            for(d = 0; d< 3; d++){
              transpose[d][c] = matriks[c][d];
            }
          }
          for(c = 0; c < 3; c++){
            for(d = 0; d< 3; d++){
              System.out.print(transpose[c] [d] + " ");
              System.out.println(" ");
            }
            System.out.println();
        }
    }
}