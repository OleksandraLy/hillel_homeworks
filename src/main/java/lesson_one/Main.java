package lesson_one;

import lesson_one.human.Admin;
import lesson_one.human.User;
import lesson_one.service.AdminService;
import lesson_one.service.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Олександра\\IdeaProjects\\hillel_homeworks\\src\\main\\resources\\file";
        User user = new User("Lotta", "Green", 23,"greenl@mail.com", "Qwerty1");
        Admin admin = new Admin("Lesly", "Green", 52, "greenl@mail.com", "cher8pa5y");
        UserService userService = new UserService();
        AdminService adminService = new AdminService();
        userService.writeToFile(user);
        adminService.writeToFile(admin);
        adminService.writeToFile(user);
        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
    }
}
