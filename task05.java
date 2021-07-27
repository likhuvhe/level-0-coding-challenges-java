import java.lang.Math;

class Task05 {
    public static void main(String[] args) {
        System.out.println(areaOfTriangle(4, 3, 5));
    }

    public static int areaOfTriangle(double side1, double side2, double side3) {
        double semiPerimeter = 0.5 * (side1 + side2 + side3);
        int area = (int)Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
}
