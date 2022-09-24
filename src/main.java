import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double a, b, c;
        double D;

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите a:");
        a = in.nextDouble();
        System.out.println("Введите b:");
        b = in.nextDouble();
        System.out.println("Введите c:");
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
