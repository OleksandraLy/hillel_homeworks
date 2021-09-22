package lesson_one.service;

import lesson_one.human.Human;

import java.io.IOException;

public class UserService extends AbstractService implements Service {

    @Override
    public void writeToFile(Human human) throws IOException {
        System.out.println("The method is unavailable");
    }
}