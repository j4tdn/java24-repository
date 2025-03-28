package bean;

import java.util.Objects;

public class Vocabulary {
	private String word;
	private String def;
	private String type;
	private String note;
	
	public Vocabulary() {
	}

	public Vocabulary(String word, String def, String type, String note) {
		super();
		this.word = word;
		this.def = def;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Vocabulary that)) {
			return false;
		}
		return word == that.word;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(word);
	}

	@Override
	public String toString() {
		return "Vocabulary [word=" + word + ", def=" + def + ", type=" + type + ", note=" + note + "]";
	}
	
	
	
	
	
}
