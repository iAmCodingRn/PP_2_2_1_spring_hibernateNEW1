package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("Pablo", "Escobar", "narcos@mail.ru", new Car("Porsche", 911)));
      userService.add(new User("Hitler", "Adolf", "einreich@mail.ru", new Car("Mercedes-Benz", 770)));
      userService.add(new User("Hillary", "Clinton", "usa@mail.ru", new Car("Oldsmobile", 1986)));
      userService.add(new User("Mike", "Tyson", "boxchamp@mail.ru", new Car("Ferrari", 50)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Model = "+user.getCar().getModel());
         System.out.println("Series = "+user.getCar().getSeries());
      }

      context.close();
   }
}
