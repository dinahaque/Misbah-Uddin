public class AccountApp {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setId(1);
        account1.setName("A");
        account1.setBalance(1000);
        account1.setType("Current");

        Account account2 = new Account();
        account2.setId(2);
        account2.setName("B");
        account2.setBalance(1000);
        account2.setType("Saving");

        Account account3 = new Account();
        account3.setId(3);
        account3.setName("C");
        account3.setBalance(1000);
        account3.setType("Saving");

        Account account4 = new Account();
        account4.setId(4);
        account4.setName("D");
        account4.setBalance(1000);
        account4.setType("Saving");

        System.out.println("ID: " + account1.getId()
                + ", Name: " + account1.getName()
                + ", Balance: " + account1.getBalance()
                + ", Type: " + account1.getType());

        System.out.println("ID: " + account2.getId()
                + ", Name: " + account2.getName()
                + ", Balance: " + account2.getBalance()
                + ", Type: " + account2.getType());

        System.out.println("ID: " + account3.getId()
                + ", Name: " + account3.getName()
                + ", Balance: " + account3.getBalance()
                + ", Type: " + account3.getType());

        System.out.println("ID: " + account4.getId()
                + ", Name: " + account4.getName()
                + ", Balance: " + account4.getBalance()
                + ", Type: " + account4.getType());
    }
}