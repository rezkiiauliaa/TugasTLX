import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        
        float A, T, Luas;

        Scanner nilai = new Scanner(System.in);
        A = nilai.nextFloat();
        T = nilai.nextFloat();

        Luas = A*T/2;

        System.out.printf("%.2f", Luas);

    }
}
