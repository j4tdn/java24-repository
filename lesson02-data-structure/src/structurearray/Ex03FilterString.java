package structurearray;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {

		String[] students = { "Patter", "Passion", "Huy", "Pattac", "HUynđai" };
		// In ra mảng
		// Dùng hàm Arrays.toString là class đặc trưng của KDL đối tượng
		// Có thể gọi Hàm luôn bên trong toSring
		System.out.println("Array: " + Arrays.toString(getStudents(students)));
	}

	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				result[count] = element;
				count++;

			}
		}
		// Thay vì phải tạo thêm 1 mảng mới và dùng for để gán từng phần tử thoải đk cho
		// mảng mới
		// lệnh dưới đây hoạt động = cách copy các phần tử từ mảng đã thỏa điều kiện với
		// phạm vi từ [0, count) ( số lần thỏa )
		// vd: count = 3, thì copy 3 phần tử [0] [1] [2] rồi gán vào mảng
		// Tóm gọn: Dùng để copy phẩn tử [0] đến [n<count] vào mảng mới rồi trả về kết
		// quả luôn
		return Arrays.copyOfRange(result, 0, count);
	}

}
