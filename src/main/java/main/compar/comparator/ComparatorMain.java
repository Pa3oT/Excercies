package main.compar.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        User indiaUser = new User(1, "India");
        User chinaUser = new User(4, "China");
        User nepalUser = new User(3, "Nepal");
        User bhutanUser = new User(2, "Bhutan");

        List<User> listOfCountries = new ArrayList<User>();
        listOfCountries.add(indiaUser);
        listOfCountries.add(chinaUser);
        listOfCountries.add(nepalUser);
        listOfCountries.add(bhutanUser);

        System.out.println("Before Sort by id : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            User User = (User) listOfCountries.get(i);
            System.out.println("User Id: " + User.getId() + "||" + "User name: " + User.getName());
        }
        Collections.sort(listOfCountries, new UserSortbyIdComparator());

        System.out.println("After Sort by id: ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            User User = (User) listOfCountries.get(i);
            System.out.println("User Id: " + User.getId() + "|| " + "User name: " + User.getName());
        }

        //Sort by UserName
        Collections.sort(listOfCountries, new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("After Sort by name: ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            User User = (User) listOfCountries.get(i);
            System.out.println("User Id: " + User.getId() + "|| " + "User name: " + User.getName());
        }
    }
}
