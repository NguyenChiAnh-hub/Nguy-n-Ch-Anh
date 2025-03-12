public class Bai1a {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 200; i <= 600; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Tổng: " + sum);
        System.out.println("Trung bình cộng: " + average);
    }
}