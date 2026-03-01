package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C03_STUDENT_ID")
	private Integer id;
	
	@Column(name = "C03_SUBJECT")
	private String subject;
	
	@Column(name = "C03_SCORE")
	private Boolean score;
	
}
