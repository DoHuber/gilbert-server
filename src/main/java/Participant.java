import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Participant in the message exchange, has a unique ID and may send to other participants
@Entity
@Table(name = "Participants")
public class Participant {

    private Long id;
    private String nickname;

    public Participant(String nickname) {
        this.nickname = nickname;
    }

    public Participant() {

    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
