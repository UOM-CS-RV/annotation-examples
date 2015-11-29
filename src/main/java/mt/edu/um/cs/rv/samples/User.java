package mt.edu.um.cs.rv.samples;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dwardu on 29/11/2015.
 */
public class User {

    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private Long id;

    private String username;

    private String name;

    private String surname;

    public User(String username, String name, String surname) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.username = username;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
