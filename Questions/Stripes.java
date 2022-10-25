import java.util.Scanner;

public class Stripes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=Integer.parseInt(sc.nextLine());
        for(int i=0;i<testcases;i++){
            sc.nextLine();
            int cnt=0;
            for(int j=0;j<8;j++){
                String str=sc.nextLine();
                int count=0;
                for(char c:str.toCharArray()){
                    if(c=='R')
                        count++;
                }
                if(count==8)
                    cnt=count;
            }
            if(cnt==8)
                System.out.println('R');
            else
                System.out.println('B');
            
        }
        sc.close();
    }
}
