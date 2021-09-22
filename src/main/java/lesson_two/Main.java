package lesson_two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        Information information = initializationData.initializeInformation();
        List<Byte> someList = new ArrayList<>();
        for (byte c = 1; c < 5; c++) {
            someList.add(c);
        }
        innerMethod(someList, information);
        System.out.println(someList.size());
        System.out.println(information.getNicknames().toString());
        System.out.println(information.getMails());
        System.out.println(information.getNicknamesMails().toString());
    }

    public static void innerMethod(List<? extends Number> list, Information information) {
        List<Byte> byteList = new ArrayList<>();
        for (byte i = 10; i < 20; i++) {
            byteList.add(i);
        }
        for (byte b = 1; b < byteList.size(); b++) {
            String element = String.valueOf(byteList.get(b));
            if (!information.getNicknames().contains(element))
                information.getNicknames().add(element);
            if (!information.getMails().contains(element + "@mail.com"))
                information. getMails().add(element + "@mail.com");
        }
    }
}

