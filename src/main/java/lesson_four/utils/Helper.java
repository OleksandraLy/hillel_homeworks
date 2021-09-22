package lesson_four.utils;

import lesson_four.exceptions.UserExpectedException;
import lesson_four.exceptions.WrongFieldException;
import lesson_four.exceptions.WrongSumException;

public class Helper {
    public void accountIdCheckMethod(String accountId) throws WrongFieldException {
        if (accountId.length()==10){
            System.out.println("Account ID is correct");
        }
        else throw new WrongFieldException("Account ID is incorrect");
    }
    public void sumCheckMethod(float sum) throws WrongSumException {
        if (sum>1000){
            throw new WrongSumException("The sum is incorrect");
        }
    }
    public void userCheckMethod(String senderAccountId, String recipientAccountId){
        if (senderAccountId.equals(recipientAccountId)){
            throw new UserExpectedException("Wrong ID for the receiver");
        }
    }
}