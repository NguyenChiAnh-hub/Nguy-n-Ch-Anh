import javax.lang.model.element.Element;
public class ThuatToanNhiPhan {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40}; // Mảng nguyên có n phần tử
        int target = 10;
        int result = ThuatToanNhiPhan(array, target);

        if (result == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            System.out.println("Phần tử được tìm thấy tại chỉ số: " + result);
        }
    }

    private static int ThuatToanNhiPhan(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu phần tử giữa là phần tử cần tìm
            if (array[mid] == target) {
                return mid;
            }

            // Nếu phần tử cần tìm nhỏ hơn phần tử giữa
            if (array[mid] > target) {
                right = mid - 1;
            } else {
                // Nếu phần tử cần tìm lớn hơn phần tử giữa
                left = mid + 1;
            }
        }

        // Nếu không tìm thấy phần tử cần tìm
        return -1;
    }
}
//public class ThuatToanNhiPhan {
	//Element {
	   // public static void main(String[] args) {
	     //   int[] array = {2, 3, 4, 10, 40}//mang nguyen co n phan tu ;
	     //   int target = 10;
	      //  int result = ThuatToanNhiPhan (array, target);


	//}

		//private static int ThuatToanNhiPhan(int[] array, int target) {
			// TODO Auto-generated method stub
		//	return 0;
		//}

//}