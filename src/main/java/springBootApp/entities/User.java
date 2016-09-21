package springBootApp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name="userid")
    private Long userId;

	@Column(name = "username")
    private String userName;   

    private String password;

	private int enabled;

    private String email;
	
	public User(){
		
	}

	public User(User user) {
        this.userId = user.userId;
        this.userName = user.getUserName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.enabled = user.getEnabled();
    }

    public User(String userName, String password, int enabled, String email) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}