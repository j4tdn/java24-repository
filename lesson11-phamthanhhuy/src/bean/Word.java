package bean;

import java.util.Objects;

public class Word {

	public enum WordType {
		Noun, Verb, Adjective, Adverb, Preposition, Conjunction, Interjection, Pronoun, Determiner
	}

	private String meaning;
	private WordType type;
	private String note;

	public Word() {
	}

	public Word(String meaning, WordType type, String note) {
		this.meaning = meaning;
		this.type = type;
		this.note = note;
	}

	public String getMeaning() {
		return meaning;
	}

	public WordType getType() {
		return type;
	}

	public String getNote() {
		return note;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public void setType(WordType type) {
		this.type = type;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMeaning());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Word that))
			return false;

		return Objects.equals(meaning, that.meaning);
	}

	@Override
	public String toString() {
		return " [meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}

}
