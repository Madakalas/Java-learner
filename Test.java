public class Test {
    public static void main(String[] args)
    {
        Account t1 = new Account();
          t1.set_Minbal(500);
          t1.set_Empname("SIDDARDH");
          t1.set_Empsal(200000);

          System.out.println(t1.get_Empname());
          System.out.println(t1.get_Minbal());
          System.out.println(t1.get_Empsal());
    }
    
}
