package view;

import static model.DataModel.getDictionary;
import static utils.CollectionUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Vocabulary;

public class Ex05EngDictionary {
	
	
	public static void main(String[] args) {
		Map<String, Vocabulary> dictionary = getDictionary();
		generate("Danh sach tu vung", addVocab(dictionary));
		findVocab(dictionary, "play");
	}
	
	private static Map<String, Vocabulary> addVocab(Map<String, Vocabulary> sources) {
		Map<String, Vocabulary> res = new HashMap<String, Vocabulary>(sources);
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập từ vựng: ");
		String word = ip.nextLine();
		System.out.print("Nhập định nghĩa: ");
		String def = ip.nextLine();
		System.out.print("Nhập từ loại: ");
		String type = ip.nextLine();
		System.out.print("Nhập ghi chú: ");
		String note = ip.nextLine();
		ip.close();
		int count = sources.size();
		String key = String.format("Tu vung %d", ++count);
		sources.forEach((k, v) -> {
			
			res.put(key, new Vocabulary(word, def, type, note));
		});
		return res;
	}
	
	private static void findVocab(Map<String, Vocabulary> sources, String word) {
		sources.forEach((k, v) -> {
			if(v.getWord().equals(word)) {
				System.out.println(sources.get(k));
			} else {
				System.out.println("Khong tim thay");
			}
		});
		
	}

}
