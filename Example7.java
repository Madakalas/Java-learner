import java.util.Scanner;;
class Marsh

{
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       int a = x.nextInt();
       if(a%2==0)
       {
        System.out.println("Even");
       } 
       else{
        System.out.println("odd");
       }
    }
}