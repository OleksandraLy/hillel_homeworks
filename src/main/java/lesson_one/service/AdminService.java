package lesson_one.service;

import lesson_one.human.Human;

import java.io.FileWriter;
import java.io.IOException;

public class AdminService extends AbstractService implements Service {
    private String path = "C:\\Users\\Олександра\\IdeaProjects\\hillel_homeworks\\src\\main\\resources\\file";

    @Override
    public void writeToFile(Human human) throws IOException {
        FileWriter dataWriter = new FileWriter(path);
        dataWriter.write(human.getName());
        dataWriter.write(human.getSurname());
        dataWriter.write(human.getAge());
        dataWriter.write(human.getMail());
        dataWriter.write(human.getPassword());
        dataWriter.write(human.getRole());
        dataWriter.close();
    }
}
