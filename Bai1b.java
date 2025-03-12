public class Bai1b {
    public static void main(String[] args) {
        System.out.println("Các số lẻ từ 50 đến 100 chia hết cho 7 là:");
        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}