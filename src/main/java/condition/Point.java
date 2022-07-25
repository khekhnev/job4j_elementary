package condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double sub1 = x2 - x1;
        double sub2 = y2 - y1;
        double first = Math.sqrt(sub1);
        double second = Math.sqrt(sub2);
        double sum1 = first + second;
        return Math.pow(sum1, 2);
    }

    public static void main(String[] args) {
        double rsl2 = distance(0, 2, 0, 0);
        System.out.println("result (0,0) to (2, 0) " + rsl2);
     }
    }
