package DTO;

import java.io.Serializable;

public class UserDTO implements Serializable {
	private Long userId;
	private String username;
	private String password;
	private String companyID;
	private String phone;
	private String roles[];
	private int votes[];
	private String userCreated;
	private String firstname;
	private String lastname;
	private String email;

	public String getFirstname() {
		return firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public UserDTO(){}
	
	public UserDTO(Long userID, String username, String password) {
		super();
		this.userId = userID;
		this.username = username;
		this.password = password;
	}
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userID) {
		this.userId = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public int[] getVotes() {
        return votes;
    }

    public void setVotes(int[] votes) {
        this.votes = votes;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    @Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
