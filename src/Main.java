import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enums.Bank;
import enums.Mobile;
import services.impl.BankAccountImpl;
import services.impl.PersonImpl;
import services.impl.TerminalImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount(Bank.AIYL_BANK,1000000.0,"123456","aiyl");
        BankAccount bank2 = new BankAccount(Bank.BAKAY_BANK,2000000.0,"234567","bakay");
        BankAccount bank3 = new BankAccount(Bank.OPTIMA_BANK,140000.0,"345678","optima");
        BankAccount bank4 = new BankAccount(Bank.RSK_BANK,340000.0,"456789","rsk");
        BankAccount bank5 = new BankAccount(Bank.KYRGYZSTAN_BANK,1200000.0,"56791","kyrgyzstan");
        ArrayList<BankAccount>banks = new ArrayList<>(Arrays.asList(bank1,bank2,bank3,bank4,bank5));

        Person p1 = new Person("Nuriza","Muratova","@nurizm","554488060","nuriza",bank1);
        Person p2 = new Person("Aijamal","Atakanova","@aijamala","778234593","jamal",bank2);
        Person p3 = new Person("Lira","Bekova","@lirab","55373256","lira",bank3);
        Person p4 = new Person("Adil","Aitbaev","@adil","772846234","adil",bank4);
        Person p5 = new Person("Alibek","Altynov","@alibek","778234993","alibek",bank5);

        Terminal t1 = new Terminal(Mobile.O,"White");
        Terminal t2 = new Terminal(Mobile.BEELINE,"Black");
        Terminal t3 = new Terminal(Mobile.MEGACOM,"Yellow");
        try {
            BankAccountImpl bank = new BankAccountImpl();
            PersonImpl person = new PersonImpl();
            TerminalImpl terminal = new TerminalImpl();

                System.out.println("""
                        1. Create Bank account:
                        2. Get all bank account:
                        3. Get credit:
                        4. Create people:
                        5. Get all people:
                        6. Create terminal:
                        7. Get all terminal:
                        8. Transfer to card:
                        9. Transfer to Phone number:
                        """);
                while (true) {
                int input = new Scanner(System.in).nextInt();
                if (input == 1) System.out.println(bank.createBankAccount(bank1, bank2, bank3));
                else if (input == 2) System.out.println(bank.getAllBankAccount());
                else if (input == 3) {System.out.println("Plused summa is: "+bank.credit(p1, Bank.BAKAY_BANK, 10, 1000));
                    System.out.println(p1);}
                else if (input == 4) System.out.println(person.createPerson(p1, p2, p3, p4, p5));
                else if (input == 5) System.out.println(person.getAllPeople());
                else if (input == 6) System.out.println(terminal.createTerminal(t1, t2, t3));
                else if (input == 7) System.out.println(terminal.getAllTerminal());
                else if (input == 8){ System.out.println(terminal.transferToCard(p2, "234567", 5000));
                    System.out.println(p2);}
                else if (input == 9){ System.out.println(terminal.transferToPhoneNumber(p3, "55373256", 2000));
                    System.out.println(p3);}
                else throw new Exception("Wrong input!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}