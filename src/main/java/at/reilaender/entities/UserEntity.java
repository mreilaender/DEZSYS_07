package at.reilaender.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author manue
 * @version 15.12.2015
 */
@Entity
@Table(name = "user", schema = "dezsys7_test", catalog = "")
public class UserEntity {
    private int userId;
    private String userName;
    private String userRealName;
    private Serializable userPassword;
    private Serializable userNewpassword;
    private byte[] userNewpassTime;
    private Serializable userEmail;
    private byte[] userTouched;
    private byte[] userToken;
    private byte[] userEmailAuthenticated;
    private byte[] userEmailToken;
    private byte[] userEmailTokenExpires;
    private byte[] userRegistration;
    private Integer userEditcount;
    private byte[] userPasswordExpires;
    private int id;
    private String name;
    private String password;

    public UserEntity() {}

    public UserEntity(String userName, String userRealName, byte[] userTouched, byte[] userToken) {
        this.userName = userName;
        this.userRealName = userRealName;
        this.userTouched = userTouched;
        this.userToken = userToken;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_real_name")
    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    @Basic
    @Column(name = "user_password")
    public Serializable getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Serializable userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_newpassword")
    public Serializable getUserNewpassword() {
        return userNewpassword;
    }

    public void setUserNewpassword(Serializable userNewpassword) {
        this.userNewpassword = userNewpassword;
    }

    @Basic
    @Column(name = "user_newpass_time")
    public byte[] getUserNewpassTime() {
        return userNewpassTime;
    }

    public void setUserNewpassTime(byte[] userNewpassTime) {
        this.userNewpassTime = userNewpassTime;
    }

    @Basic
    @Column(name = "user_email")
    @Lob
    public Serializable getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Serializable userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_touched")
    public byte[] getUserTouched() {
        return userTouched;
    }

    public void setUserTouched(byte[] userTouched) {
        this.userTouched = userTouched;
    }

    @Basic
    @Column(name = "user_token")
    public byte[] getUserToken() {
        return userToken;
    }

    public void setUserToken(byte[] userToken) {
        this.userToken = userToken;
    }

    @Basic
    @Column(name = "user_email_authenticated")
    public byte[] getUserEmailAuthenticated() {
        return userEmailAuthenticated;
    }

    public void setUserEmailAuthenticated(byte[] userEmailAuthenticated) {
        this.userEmailAuthenticated = userEmailAuthenticated;
    }

    @Basic
    @Column(name = "user_email_token")
    public byte[] getUserEmailToken() {
        return userEmailToken;
    }

    public void setUserEmailToken(byte[] userEmailToken) {
        this.userEmailToken = userEmailToken;
    }

    @Basic
    @Column(name = "user_email_token_expires")
    public byte[] getUserEmailTokenExpires() {
        return userEmailTokenExpires;
    }

    public void setUserEmailTokenExpires(byte[] userEmailTokenExpires) {
        this.userEmailTokenExpires = userEmailTokenExpires;
    }

    @Basic
    @Column(name = "user_registration")
    public byte[] getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(byte[] userRegistration) {
        this.userRegistration = userRegistration;
    }

    @Basic
    @Column(name = "user_editcount")
    public Integer getUserEditcount() {
        return userEditcount;
    }

    public void setUserEditcount(Integer userEditcount) {
        this.userEditcount = userEditcount;
    }

    @Basic
    @Column(name = "user_password_expires")
    public byte[] getUserPasswordExpires() {
        return userPasswordExpires;
    }

    public void setUserPasswordExpires(byte[] userPasswordExpires) {
        this.userPasswordExpires = userPasswordExpires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userRealName != null ? !userRealName.equals(that.userRealName) : that.userRealName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userNewpassword != null ? !userNewpassword.equals(that.userNewpassword) : that.userNewpassword != null)
            return false;
        if (!Arrays.equals(userNewpassTime, that.userNewpassTime)) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (!Arrays.equals(userTouched, that.userTouched)) return false;
        if (!Arrays.equals(userToken, that.userToken)) return false;
        if (!Arrays.equals(userEmailAuthenticated, that.userEmailAuthenticated)) return false;
        if (!Arrays.equals(userEmailToken, that.userEmailToken)) return false;
        if (!Arrays.equals(userEmailTokenExpires, that.userEmailTokenExpires)) return false;
        if (!Arrays.equals(userRegistration, that.userRegistration)) return false;
        if (userEditcount != null ? !userEditcount.equals(that.userEditcount) : that.userEditcount != null)
            return false;
        if (!Arrays.equals(userPasswordExpires, that.userPasswordExpires)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userRealName != null ? userRealName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userNewpassword != null ? userNewpassword.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userNewpassTime);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userTouched);
        result = 31 * result + Arrays.hashCode(userToken);
        result = 31 * result + Arrays.hashCode(userEmailAuthenticated);
        result = 31 * result + Arrays.hashCode(userEmailToken);
        result = 31 * result + Arrays.hashCode(userEmailTokenExpires);
        result = 31 * result + Arrays.hashCode(userRegistration);
        result = 31 * result + (userEditcount != null ? userEditcount.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userPasswordExpires);
        return result;
    }
}
