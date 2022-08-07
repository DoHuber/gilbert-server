import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Messages")
public class Message {

    private Long id;
    private char[] content;
    private int timestamp;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public Long getId() {
        return id;
    }

    public char[] getContent() {
        return content;
    }

    public int getTimestamp() {
        return timestamp;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void setContent(char[] content) {
        this.content = content;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
