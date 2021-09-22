package lesson_four.services;

import lesson_four.entities.Client;
import lesson_four.utils.Helper;

public class TransactionService {
    public static void moneyTransition(Client client, String accountId) {
        Helper helper = new Helper();
        helper.userCheckMethod(client.getAccountId(), accountId);
    }
}
