//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId("12345"); employee1.setName("Zahra"); employee1.setSalary(5000);
        Employee employee2 = new Employee("23451", "Layla", 3000);
        Employee employee3 = new Employee("34512", "Lea", 12000);
        Employee employee4 = new Employee("45123", "Shatha", 10000);
        Employee employee5 = new Employee("51234", "Maytha", 8000);

        Account account1 = new Account("51234", "Maytha");
        Account account2 = new Account();
        account2.setId("45123"); account2.setName("Layla");
        Account account3 = new Account("34512", "Lea", 12000);
        Account account4 = new Account("23451", "Layla", 3000);
        Account account5 = new Account("12345", "Zahra");
        account5.setBalance(5000);

        System.out.println("Initial Values: ");
        System.out.println("\nEmployees:\n"+ employee5+"\n-------------\n"+employee4+"\n-------------\n"+employee3+"\n-------------\n"+employee2+"\n-------------\n"+employee1);
        System.out.println("==============================================");
        System.out.println("Accounts:\n"+ account1+"\n-------------\n"+account2+"\n-------------\n"+account3+"\n-------------\n"+account4+"\n-------------\n"+account5);

        System.out.println("==============================================");
        System.out.println("\nThe employee "+employee4.getName()+ " with the ID: "+employee4.getId()+"'s Salary is: "+employee4.getSalary());
        System.out.println("The employee "+employee3.getName()+ "'s Annual Salary is: "+employee3.getAnnualSalary());
        System.out.println("The employee "+employee1.getName()+ " will get a raise in salary by 12% which leads to the new salary: "+employee1.raisedSalary(12));

        System.out.println("\n==============================================");
        System.out.println("After Employee Operations the Values have become: ");
        System.out.println("\nEmployees:\n"+ employee5+"\n-------------\n"+employee4+"\n-------------\n"+employee3+"\n-------------\n"+employee2+"\n-------------\n"+employee1);
            // leen hna all correct
        System.out.println("==============================================");

        System.out.println("\n"+account1.getName()+ "'s account with the ID: "+account1.getId()+". Her balance is: "+account1.getBalance());
        System.out.println(account2.getName()+ "'s account with the ID: "+account2.getId()+". Her balance is: "+account2.getBalance());
        System.out.println(account4.getName()+ "'s account with the ID:  "+account4.getId()+". Her balance is: "+account4.getBalance());
        System.out.println(account5.getName()+ "'s account with the ID: "+account5.getId()+". Her balance is: "+account5.getBalance());
        System.out.println(account3.getName()+ "'s Accounts balance is: "+account3.getBalance());
        System.out.println("Adding amount "+1000+" to "+account4.getName()+ "'s account where the new balance is: "+account4.amount(1000));
        System.out.println("taking amount "+300+" from "+account2.getName()+ "'s account where the new balance is: "+account2.debit(300));
        System.out.println("Transfering amount "+500+" from "+account5.getName()+ "'s account to "+account1.getName()+ "'s account");
        account5.transferTo(account1,500);

        System.out.println("==============================================");
        System.out.println("After Accounts Operations: ");
        System.out.println("\nAccounts:\n"+ account1+"\n-------------\n"+account2+"\n-------------\n"+account3+"\n-------------\n"+account4+"\n-------------\n"+account5);




    }
}