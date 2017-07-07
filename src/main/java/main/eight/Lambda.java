package main.eight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyans on 7/6/2017.
 */
public class Lambda {

    public static void main(String args []) {
        List<User> users = new ArrayList<>();
            users.sort((User user, User user1) -> user.getI() - (user1.getI()));
    }
}


class  User {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    int i;
}