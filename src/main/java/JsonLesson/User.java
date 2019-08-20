package JsonLesson;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private long id;
    private List<String> geoHistory = new ArrayList<>();
    private UserAddress userAddress;

    public User(String userName, int id, List<String> geoHistory, UserAddress userAddress) {
        this.userName = userName;
        this.id = id;
        this.geoHistory = geoHistory;
        this.userAddress = userAddress;
    }

    public String getUname(){
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", geoHistory=" + geoHistory +
                ", userAddress=" + userAddress+
                '}';
    }
}
