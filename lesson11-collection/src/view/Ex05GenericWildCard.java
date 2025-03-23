package view;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Ex05GenericWildCard {

	public static void main(String[] args) {
		
		
		// giới hạn trên là dùng extends -> Vì thằng cha nó thừa kế có cấp cao nhất, ko thể truy cập được lên nữa
		// chỉ truy cập được từ cha và các con của nó trở xuống thôi 
		
		// giới hạn dưới thì dùng super --> vd như super Integer thì từ Interger truy cập lên cha nó 
		// vì bản chất super là truy cập phương thức và tt của cha, nên super th nào thì chỉ truy cấp th đó và cha của nó trở lên

		List<Integer> lints = List.of(1,2,3,4,5);
		List<Double> ldoubs = List.of(1d,2d,3d,4d,5d);
		List<String> lstrs = List.of("a","b","c","d","e");
		List<Object> lobjects = List.of("a",1 ,2d, 3f, new Date());
		
		generate("3. In ds với ints", lints);
		//generate("3. In ds với doubs", ldoubs);
		//generate("3. In ds với strs", lstrs);
		generate("3. In ds với objs", lobjects);
	}
	private static <T extends Comparable<? super T>> void sort(List<T> list) {
		Collections.sort(list);
		
	}
	private static void generate(String prefix , List<? super Integer> input) {
		System.out.println(prefix+ " {");
		for (Object element:input) {
			System.out.println("-  "+ element);
		}
		System.out.println("}\n");
	}
}
