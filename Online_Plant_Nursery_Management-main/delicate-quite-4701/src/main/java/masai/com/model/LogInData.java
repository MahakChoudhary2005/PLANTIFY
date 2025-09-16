package masai.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

//import lombok.Data;

@Entity

public class LogInData {
	
	@Id
	@NotNull
	private Integer userId;
	@NotNull(message="username shouldn't be empty")
	private String userName;
	@NotNull(message="password shouldn't be empty")
	private String password;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
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
	public LogInData(@NotNull Integer userId, @NotNull(message = "username shouldn't be empty") String userName,
			@NotNull(message = "password shouldn't be empty") String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LogInData [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	public LogInData() {}
}
