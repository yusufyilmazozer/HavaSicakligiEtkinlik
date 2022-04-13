import java.util.Scanner;

public class havaDurumu {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Bugün kayak yapabilirsiniz.");
        }
        if (heat > 5 && heat < 15) {
            System.out.print("Bugün sinemaya gidebilirsiniz.");
        }
        if (heat > 10 && heat < 25) {
            System.out.print("Bugün piknik yapabilirsiniz.");
        }
        if (heat > 25) {
            System.out.print("Bugün yüzebilirsiniz.");
        }

    }
}