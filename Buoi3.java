public class Buoi3 {
    public static void main(String[] args) {
        int n = 3; // Số lượng số nguyên tố đầu tiên cần tính tổng
        int sum = 0;
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Tổng của " + n + " số nguyên tố đầu tiên là: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
