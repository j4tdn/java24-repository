package view;

import static model.DataModel.getCost;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class Ex06DailyCost {

	public static void main(String[] args) {
		
		Map<String, Double> dailyCosts = getCost();
		generate("Chi phi tren 500", above500(dailyCosts));
		generate("Sap xep tang dan theo cac khoan chi tieu",
				sort(dailyCosts, (o1, o2) -> o1.getKey().compareTo(o2.getKey())));
		
		generate("Sap xep giam dan theo so tien", sort(dailyCosts,
				(o1, o2) -> o2.getValue().compareTo(o1.getValue())));
	}
	
	private static Map<String, Double> above500(Map<String, Double> sources) {
		Map<String, Double> res = new HashMap<>();
		sources.forEach((k, v) -> {
			if(v > 500) {
				res.put(k, v);
			}
		});
		return res;
	}
	
	private static Map<String, Double> sort(Map<String, Double> sources,Comparator<Map.Entry<String, Double>> comparator) {
		List<Map.Entry<String, Double>> list = new ArrayList<>(sources.entrySet());
		list.sort(comparator);
		
		Map<String, Double> res = new LinkedHashMap<>();
		list.forEach(entry -> {
			res.put(entry.getKey(), entry.getValue());
		});
		return res;
	}
	
	
	
}
