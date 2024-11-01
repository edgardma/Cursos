package pe.com.dyd.curso.springboot.webapp.springbootweb.models;

public class User {

    private String name;
    private String lastName;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    
}
