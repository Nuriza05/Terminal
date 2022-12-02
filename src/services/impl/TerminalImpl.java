package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class TerminalImpl implements TerminalInterface {
    private ArrayList<Terminal> terminals = new ArrayList<>();

    @Override
    public String createTerminal(Terminal... terminal) {
        terminals.addAll(Arrays.asList(terminal));
        return "Created Terminals!";
    }

    @Override
    public ArrayList<Terminal> getAllTerminal() {
        return terminals;
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        try{
            if(summa < 0 ) throw new Exception("Negative numbers and Wrong Input!");
            if(person.getBankAccount().getCardNumber().equals(cardNumber)){
                 person.getBankAccount().setBalance(person.getBankAccount().getBalance()+summa);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return "The money successfully added!";
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {
        if(person.getPhoneNumber().equals(phoneNumber)){
            person.getBankAccount().setBalance(person.getBankAccount().getBalance()-summa);
        }return "The money is successfully take away! ";
    }
}
