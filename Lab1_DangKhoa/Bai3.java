package Lab1_DangKhoa;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập độ dài cạnh khối lập phương: ");
        double canh = scanner.nextDouble();
        
        double TheTich = canh*canh*canh;

        System.out.printf("Thể tích khối lập phương: %.2f\n", TheTich);

        scanner.close();
    }
}