import java.util.*;

public class Increasing{
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int testcases=Integer.parseInt(sc.nextLine());
    //     for(int i=0;i<testcases;i++){
    //         int sizeofArray=Integer.parseInt(sc.nextLine());
    //         String[] arr=sc.nextLine().split(" ");
    //         HashMap <String,Integer> map= new HashMap<>();
    //         for(String s:arr)
    //             map.put(s,0);
    //         if(map.size()==sizeofArray)
    //             System.out.println("yes");
    //         else
    //             System.out.println("no");
    //     }
    //     sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=Integer.parseInt(sc.nextLine());
        for(int i=0;i<testcases;i++){
            int arrsize=Integer.parseInt(sc.nextLine());
            String[] str=sc.nextLine().split(" ");
            HashSet<String> map=new HashSet<String>(Arrays.asList(str));
            if(map.size()==arrsize)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}