import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                throw new IllegalArgumentException("Số phần tử của mảng phải lớn hơn 0.");
            }

            int[] array = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Các phần tử trong mảng là:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}