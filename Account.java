

public class Account {

       private int minbal;
       private String empname;
       private double empsal;
       public int get_Minbal()
       {
        return this.minbal;
       }
       public String get_Empname()
       {
        return this.empname;
       }
       public double get_Empsal()
       {
        return this.empsal;
       }

       public void set_Minbal(int bal)
       {
            this.minbal = bal;
       }
       public void set_Empname(String name)
       {
         this.empname = name;
       }
       public void set_Empsal(double sal)
       {
         this.empsal= sal;
       }


}
