package main.compar.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
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

        System.out.println("Before Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            User User = (User) listOfCountries.get(i);
            System.out.println("User Id: " + User.getId() + "||" + "User name: " + User.getName());
        }
        Collections.sort(listOfCountries);

        System.out.println("After Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            User User = (User) listOfCountries.get(i);
            System.out.println("User Id: " + User.getId() + "|| " + "User name: " + User.getName());
        }
    }
}
