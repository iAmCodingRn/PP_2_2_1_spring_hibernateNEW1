package web.model;


import javax.persistence.*;


@Entity
@Table(name= "user")
public class User {

   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "username")
   private String username;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   @Column(name = "age")
   private byte age;

   public User() {

   }

   public User(String username, String firstName, String lastName, String email, byte age) {
      this.username = username;
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.age = age;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public byte getAge() {
      return age;
   }

   public void setAge(byte age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", username='" + username + '\'' +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}