import java.util.Scanner;

class Gcd{
    //gcd(a,b) min=1 max=min(a,b) ie gcd(4,8)=4 and gcd(3,4)=1
    //if a%x=0 and b%x=0 => (a+b)%x=0 and (a-b)%x=0
    //let gcd(a,b)=g =>a%b=0 and b%c=0 
    //hence we can say a=g*p+0 and b=g*q+0 p,q are qutioents
    //now if we divide a by b => a=t*b+rem => a-t*b=rem; substitue above values 
    // (g*p)-t*(g*q)=rem => (g*p)-(t*g)-(t*q)=rem => 
    //now our g can divide remainder also hence we can say 
    //gcd(a,b)=gcd(b,remainder when a is divided by b) b is small among both
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("gcd of two numbers is "+findGcd(a,b));
    }

    static int findGcd(int a, int b) {
        b=Math.min(a,b);
        a=Math.max(a,b);
        // largest number that can devide the number is b
        if(a%b==0)
            return b;
        else
            return findGcd(b, a%b);
    }
}