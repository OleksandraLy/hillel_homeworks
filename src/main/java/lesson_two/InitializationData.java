package lesson_two;

import java.util.*;

public class InitializationData {
    private Information information = new Information();
    private List<String> nicknames = new ArrayList<>();
    private Set<String> mails = new HashSet<>();
    private Map<String, String> nicknamesMails = new HashMap<>();

    public Information initializeInformation() {
        returnInformation();
        trimSize();
        information.setMails(mails);
        information.setNicknames(nicknames);
        information.setNicknamesMails(nicknamesMails);
        return information;
    }

    private void returnInformation() {

        for (int i = 0; i < 30; i++) {
            nicknames.add("user" + i);
            mails.add("mail" + i + "@mail.com");
            nicknamesMails.put("mail" + i + "@mail.com", "user" + i);
        }
        for (int a = 0; a < 10; a++) {
            nicknames.add("user");
            mails.add("mail@mail.com");
            nicknamesMails.put("mail@mail.com", "user");
        }
    }

    private void trimSize() {
        if (nicknames.size() != mails.size()) {
            Set<String> temporarySet = new HashSet<>(nicknames);
            nicknames.clear();
            nicknames.addAll(temporarySet);
        }
        if (nicknamesMails.size() != mails.size()) {
            nicknamesMails.remove("mail@mail.com");
            nicknamesMails.put("mail@mail.com", "user");
        }
    }
}
