package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_POST")
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C01_ID")
	private Integer id;
	
	@Column(name = "C01_TITLE")
	private String title;
	
	@Column(name = "C01_CONTENT")
	private String content;
	
	@ManyToMany
	@JoinTable(
		name = "T03_POST_TAG_REL",
		joinColumns = @JoinColumn(name = "C03_POST_ID", referencedColumnName = "C01_ID"),
		inverseJoinColumns = @JoinColumn(name = "C03_TAG_ID", referencedColumnName = "C02_ID")
	)
	private List<Tag> tags = new ArrayList<>();
	
	public Post() {
	}

	public Post(Integer id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Post that)) {
			return false;
		}

		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
}
