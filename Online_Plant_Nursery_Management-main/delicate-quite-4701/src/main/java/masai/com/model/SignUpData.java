package masai.com.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class SignUpData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @NotNull
    @Pattern(
        regexp = "[a-z]{6,12}", 
        message = "Username must be 6–12 lowercase characters."
    )
    private String userName;

    @NotNull(message = "Password cannot be null")
    private String password;

    @NotNull
    @Pattern(
        regexp = "[0-9]{10}", 
        message = "Mobile number must have 10 digits"
    )
    private String mobileNo;

    @Embedded
    private Address address;

    @Email(message = "Invalid email format")
    @NotNull(message = "Email cannot be null")
    private String email;

    // -------------------- Constructors --------------------
    public SignUpData() {}

    public SignUpData(Integer userId, String userName, String password, String mobileNo, Address address, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
    }

    // -------------------- Getters & Setters --------------------
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

    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // -------------------- toString --------------------
    @Override
    public String toString() {
        return "SignUpData{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
