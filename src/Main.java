import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời nhập mã:");
//        String code = scanner.next();
//        System.out.println("Mời nhập miêu tả:");
//        String description = scanner.next();
//        System.out.println("Mời nhập giá:");
//        double price = scanner.nextDouble();
//        Product product1 = new Product(code, description, price);
////        Product product1 = new Product("java", "beginning Java", 49.5);
////        Product product2 = new Product("sql", "Structure  querylanguage",59.0);
//        System.out.println(product1);
//        System.out.println(product2);
        System.out.println("Nhập điểm toán");
        double toan = scanner.nextDouble();
        System.out.println("Nhập điểm lý");
        double ly = scanner.nextDouble();
        System.out.println("Nhập điểm hoá");
        double hoa = scanner.nextDouble();
        double diemTB = (toan + ly + hoa) / 3;
        if (diemTB >= 8.0) {
            System.out.println(diemTB + ": A");
        } else if (diemTB >= 6.5) {
            System.out.println(diemTB + ": B");
        } else if (diemTB >= 5) {
            System.out.println(diemTB + ": C");
        } else {
            System.out.println(diemTB + ": D");
        }
    }
}