package view;
import static model.DataModel.getDictionary;
import static utils.CollectionUtils.generate;

import java.util.Map;

import bean.Dictionary;

public class Ex04Dictionary {
	
	public static void main(String[] args) {
		
		var dic = getDictionary();
		
		addNewWord(dic, "Mask", new Dictionary("mặt nạ", "danh từ", "đồ vật"));
		lookUpDictionary(dic, "Apple");
		 
	}
	
	private static  void addNewWord (Map<String, Dictionary> dic, String newWord, Dictionary meaning) {
		dic.put(newWord, meaning);
		generate("danh sach tu dien", dic);
		}
	private static void lookUpDictionary (Map<String, Dictionary> dic, String word ) {
		System.out.println("word: "+ word +" ==> " + dic.get(word));
	}
	
	}


