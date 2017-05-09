package main.compar.comparator;

import java.util.Comparator;

public class UserSortbyIdComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return (user1.getId() < user2.getId()) ? -1 : (user1.getId() > user1.getId() ? 1 : 0);
    }
}
