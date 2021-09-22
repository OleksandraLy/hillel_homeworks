package lesson_six;

import lesson_six.exceptions.StringFormatException;
import lesson_six.utils.Helper;
import lesson_six.utils.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringFormatException {
        StringHelper stringHelper = new StringHelper();
        stringHelper.helpMethod("some string", new char[]{'Z', '$', '%', '6'});
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        helper.phoneCheckMethod(scanner);
        helper.emailCheckMethod(scanner);
        helper.dateCheckMethod(scanner);
        scanner.close();
    }
}
