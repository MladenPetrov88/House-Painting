import java.util.Scanner;

public class Task7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double wall = x * y;
        double window = 1.5 * 1.5;
        double totalSides = 2 * wall - 2 * window;
        double backSIde = x * x;
        double entrance = 1.2 * 2;
        double totalSide = 2 * backSIde - entrance;
        double allSides = totalSides + totalSide;
        double greenPaint = allSides / 3.4;
        double triangleRoof = 2 *(x * y);
        double triangle = 2 * (x *h/2);
        double totalTriangle = triangleRoof + triangle;
        double totalRedPaint = totalTriangle / 4.3;
        System.out.printf("%.2f%n%.2f", greenPaint, totalRedPaint);

    }
}
