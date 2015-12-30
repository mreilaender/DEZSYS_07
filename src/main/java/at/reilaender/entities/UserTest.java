package at.reilaender.entities;

import javax.persistence.*;

/**
 * @author manue
 * @version 29.12.2015
 */
@Entity
@Table(name = "user", schema = "dezsys7_test", catalog = "")
public class UserTest {
    private int userId;
    private String userName;
    private String userPassword;

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
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTest userTest = (UserTest) o;

        if (userId != userTest.userId) return false;
        if (userName != null ? !userName.equals(userTest.userName) : userTest.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(userTest.userPassword) : userTest.userPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        return result;
    }
}
