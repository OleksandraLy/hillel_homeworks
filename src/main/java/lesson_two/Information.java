package lesson_two;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {
    private List<String> nicknames;
    private Set<String> mails;
    private Map<String, String> nicknamesMails;

    public Information() {
    }

    public Information(List<String> nicknames, Set<String> mails, Map<String, String> nicknamesMails) {
        this.nicknames = nicknames;
        this.mails = mails;
        this.nicknamesMails = nicknamesMails;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public Set<String> getMails() {
        return mails;
    }

    public void setMails(Set<String> mails) {
        this.mails = mails;
    }

    public Map<String, String> getNicknamesMails() {
        return nicknamesMails;
    }

    public void setNicknamesMails(Map<String, String> nicknamesMails) {
        this.nicknamesMails = nicknamesMails;
    }

    @Override
    public String toString() {
        return "Information{" +
                "nicknames=" + nicknames +
                ", mails=" + mails +
                ", nicknamesMails=" + nicknamesMails +
                '}';
    }
}
