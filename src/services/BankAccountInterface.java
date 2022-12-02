package services;

import classes.BankAccount;
import classes.Person;
import enums.Bank;

import java.util.ArrayList;

public interface BankAccountInterface {
      String createBankAccount(BankAccount ... bankAccount);
      ArrayList<BankAccount> getAllBankAccount();
      double credit(Person person, Bank bank, int deposit, double summa);
}
