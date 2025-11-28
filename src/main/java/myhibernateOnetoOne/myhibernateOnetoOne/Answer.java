package myhibernateOnetoOne.myhibernateOnetoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Answer {

	@Id
	private int answer_id;
	private String answer;
	
	
	@OneToOne(mappedBy = "answer")
	private Question question;

}

