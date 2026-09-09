import java.util.Scanner;
class BankDemo{
    String acctype;
    int ac_no;
    double balance;

    public void Setter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your acctype");
        this.acctype=sc.nextLine();
        System.out.println("Enter Your ac_no");
        this.ac_no=sc.nextInt();
        System.out.println("Enter Your balance");
        this.balance=sc.nextDouble();
    }
    public void Getter()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" acctype:"+acctype);
        System.out.println(" ac_no:"+ac_no);
        System.out.println(" balance:"+balance);
    }
}

public class Lab6_3 {
    public static void main(String[] args) {
        
        BankDemo st=new BankDemo();
         BankDemo st1=new BankDemo();
          BankDemo st2=new BankDemo();
        st.Setter();
        st.Getter();

        st1.Setter();
        st1.Getter();

        st2.Setter();
        st2.Getter();
    }
}



