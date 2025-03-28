package model;

import java.util.HashMap;
import java.util.Map;

import bean.Dictionary;

public class ModelDictionaryEnglish {

	public ModelDictionaryEnglish() {
	}

	public static Map<String, Dictionary> getDictionary() {
		Map<String, Dictionary> dictionary = new HashMap<>();
		
		Dictionary dic1 = new Dictionary("Hello", "Xin chào", "Thán từ", "Dùng để chào hỏi");
		Dictionary dic2 = new Dictionary("Happy", "Vui vẻ", "Tính từ", "Mô tả cảm xúc tích cực");
		Dictionary dic3 = new Dictionary("Cat", "Con mèo", "Danh từ", "Loài động vật nuôi");
		Dictionary dic4 = new Dictionary("Run", "Chạy", "Động từ", "Hành động di chuyển nhanh");
		Dictionary dic5 = new Dictionary("Sad", "Buồn", "Tính từ", "Mô tả cảm giác tiêu cực");
		Dictionary dic6 = new Dictionary("Book", "Cuốn sách", "Danh từ", "Vật phẩm chứa thông tin");
		Dictionary dic7 = new Dictionary("Eat", "Ăn", "Động từ", "Hành động đưa thức ăn vào miệng");
		Dictionary dic8 = new Dictionary("Good", "Tốt", "Tính từ", "Mô tả sự tốt đẹp");
		Dictionary dic9 = new Dictionary("Wow", "Wow", "Thán từ", "Biểu thị sự ngạc nhiên");
		Dictionary dic10 = new Dictionary("Friend", "Bạn bè", "Danh từ", "Người có mối quan hệ thân thiết");
		
		dictionary.put(dic1.getWord(), dic1);
		dictionary.put(dic2.getWord(), dic2);
		dictionary.put(dic3.getWord(), dic3);
		dictionary.put(dic4.getWord(), dic4);
		dictionary.put(dic5.getWord(), dic5);
		dictionary.put(dic6.getWord(), dic6);
		dictionary.put(dic7.getWord(), dic7);
		dictionary.put(dic8.getWord(), dic8);
		dictionary.put(dic9.getWord(), dic9);
		dictionary.put(dic10.getWord(), dic10);
		
		return dictionary;
	}

}
