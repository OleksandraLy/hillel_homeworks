package lesson_one.service;

import lesson_one.human.Human;

import java.io.IOException;

public interface Service {


    boolean checkUser(Human human) throws IOException;

    void writeToFile(Human human) throws IOException;
        /*FileWriter dataWriter = new FileWriter(path2);
        dataWriter.write("Lina\n Ghostly\n 49 \n greenl@mail.com\n Qwerty \n ADMIN");
        dataWriter.close();*/
}
