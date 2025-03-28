package view;

import model.ModelDictionaryEnglish;
import static utils.InputUtils.*;

import java.util.Map;

import bean.Dictionary;
public class Ex04DictionaryEngLish {

	public static void main(String[] args) {
		var dictionary = ModelDictionaryEnglish.getDictionary();
		System.out.println("size: " + dictionary.size());
		
		//ADd
		String newWord = addNewWord(dictionary);
		System.out.println("Từ mới thêm là: " + dictionary.get(newWord));
//		System.out.println("Chuẩn hoá từ: " + normalizeWord("ahafhfa"));
//		System.out.println("Chuẩn hoá chuỗi: " + standardization("   ahafhf     fjafaa"));
		
		//Search
		searchDicionary(dictionary);
	}
	
	private static String addNewWord(Map<String, Dictionary> dictionary) {
		String word = inputString("Nhập từ tiếng anh: ");
		String meaning = inputString("Nhập ý nghĩa: ");
		String wordType = inputString("Nhập loại từ: ");
		String note = inputString("Nhập ghi chú: ");
		Dictionary newDictionary = new Dictionary(word, meaning, wordType, note);
		dictionary.put(newDictionary.getWord(), newDictionary);
		return newDictionary.getWord();
	}
	
	private static void searchDicionary(Map<String, Dictionary> dictionary) {
		String searchName = inputString("Nhập từ tiếng anh bạn muốn tra cứu: ");
		searchName = normalizeWord(searchName).strip(); 
		if (dictionary.containsKey(searchName)) {
			System.out.println("Từ bạn muốn tra là: " + dictionary.get(searchName));
		} else {
			System.out.println("Từ bạn muốn tra cứu không tồn tại trong từ điển!!");
		}
		
//		boolean isContains = false;
//		for (Map.Entry<String, Dictionary> entry : dictionary.entrySet()){
//			String key = entry.getKey();
//		    Dictionary value = entry.getValue();
//		    if (key.equalsIgnoreCase(searchName)) {
//		    	System.out.println(value);
//		    	isContains = true;
//		    }
//		}
//		if (isContains == false) {
//			System.out.println("Not Found!!!!");
//		}
	}
	
}
