package collection.map;

import java.util.*; // Import tất cả từ java.util để gọn
import utils.CollectionUtils;

public class Ex03MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> models = new TreeMap<>((s1, s2) -> {
            if (s1 == null) return -1;
            if (s2 == null) return 1;
            return s1.compareTo(s2);
        });

        models.put("Quảng Nam", 92);
        models.put("Đà Nẵng", 43);
        models.put("Huế", 75);
        models.put("Quảng Trị", 74);
        models.put("Quảng Bình", 73);
        models.put(null, -3);

        CollectionUtils.generate("1. Sắp xếp theo Key", models);
        
        CollectionUtils.generate("2. Sắp xếp theo values", models -> {
        	
        });
    }

    private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Map.Entry<K, V>> comparator) {
        // B1: Chuyển đổi từ Map -> Set<Entry>
        Set<Map.Entry<K, V>> entries = source.entrySet();

        // B2: Chuyển từ Set sang List
        List<Map.Entry<K, V>> list = new ArrayList<>(entries);

        // B3: Sắp xếp List
        list.sort(comparator);

        // B4: Đưa vào LinkedHashMap để giữ thứ tự
        Map<K, V> target = new LinkedHashMap<>();
        list.forEach(entry -> target.put(entry.getKey(), entry.getValue()));

        return target;
    }
}
