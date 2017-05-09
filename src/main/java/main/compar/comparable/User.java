package main.compar.comparable;

public class User implements Comparable<User>{
    private String name;
    private long id;

    public User(long id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(User user) {
        return (this.id < user.id) ? -1 : (this.id > user.id) ? 1 : 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
