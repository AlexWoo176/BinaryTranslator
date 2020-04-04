import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimaltoBinary {
    public static void main(String[] args) {
        int decimalNumber;
        Stack<Integer> binaryNumber = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đổi sang hệ nhị phân: ");
        decimalNumber = scanner.nextInt();

        while (decimalNumber != 0) {
            int temp;
            temp = decimalNumber % 2;
            decimalNumber = decimalNumber/2;
            binaryNumber.push(temp);
        }
        System.out.print("Số sau đổi sang hệ nhị phân: ");
        while (!binaryNumber.isEmpty()) {
            System.out.print(binaryNumber.pop());
        }
        System.out.println();
    }
}
