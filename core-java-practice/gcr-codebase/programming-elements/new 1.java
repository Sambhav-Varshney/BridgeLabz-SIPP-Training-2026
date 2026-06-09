//Ravi just joined a coding guild store his name age rank salary and membership fee float using correct dta types compute his annual bonus 12% of salary cast it to int and print a formatted welcome card

public class wlmcard {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 25;
        String rank = "Member";
        double salary = 50000.00;
        float membershipFee = 1500.50f;

        
        int annualBonus = (int) (salary * 0.12);

        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + annualBonus);
      
    }
}