import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heightHouse = Double.parseDouble(scanner.nextLine());
        double lengthWall = Double.parseDouble(scanner.nextLine());
        double heightRoof = Double.parseDouble(scanner.nextLine());

        double wallArea = heightHouse * lengthWall;
        double windowArea = 1.5 * 1.5;
        double wallArea2 = 2 * wallArea - 2 * windowArea;
        double backWall = heightHouse * heightHouse;
        double entrance = 1.2 * 2;
        double backEntranceSum = 2 * backWall - entrance;
        double finalArea = wallArea2 + backEntranceSum;
        double greenPaint = finalArea / 3.4;

        double roof1 = 2 * (heightHouse * lengthWall);
        double roof2 = 2 * (heightHouse * heightRoof / 2);
        double finalArea1 = roof1 + roof2;
        double redPaint = finalArea1 / 4.3;

        System.out.printf("%.2f ", greenPaint);
        System.out.println();
        System.out.printf("%.2f ", redPaint);

    }
}
