package view;

import static utils.CollectionUtils.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import bean.Word;
import bean.Word.WordType;
import model.DataModel;

public class Ex04 {
	public static void main(String[] args) {
		
		var dic = DataModel.getDictionary();
		
		generate("Danh sách từ điển: ", dic);
		
		addWord("sleep", new Word("ngủ", WordType.Verb, "hành động"), dic);
		
		generate("Danh sách từ điển sau khi thêm: ", dic);
		
		System.out.println("Tra từ beautiful: " + dic.get("beautiful"));
	}
	
	private static void addWord(String word, Word meaning, Map<String, Word> dictionary) {
		dictionary.put(word, meaning);
	}
}
