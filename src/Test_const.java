public class Test_const {
    public static void main(String[] args) {
        final double Pi = 3.1415; // константа Pi с типом данных для чисел с плавающей точкой
        double length1 = 2*Pi*10;
        double length2 = 2*Pi*25;
        System.out.println("Периметр круга при радиусе 10 см. равен: " + length1);
        System.out.println("Периметр круга при радиусе 25 см. равен: " + length2);
    }

}
