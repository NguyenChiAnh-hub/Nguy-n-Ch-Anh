public class DaoChuoi {
    // Phương thức để đảo ngược một mảng số nguyên
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        // Đảo ngược các phần tử của mảng bằng cách hoán đổi phần tử đầu và cuối, sau đó tiến vào giữa mảng
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 4, 5};

        System.out.println("Mảng gốc:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Gọi phương thức để đảo ngược mảng
        reverseArray(array);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
