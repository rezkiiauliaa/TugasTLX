import java.util.Scanner;

public class BebekUntukTeman {
    public static void main(String[] args) {
        int x, y, dibagikan, sisa;
       
        Scanner bebek = new Scanner(System.in);
        x = bebek.nextInt();
        y = bebek.nextInt();
       
        dibagikan = x/y;
        sisa = x%y;

        System.out.println("masing-masing " +dibagikan);
        System.out.println("bersisa " +sisa);

    }
}
