public class employee {
    
   String ename;
   int eage;
   int esalary;
   
    
    public void read(String name, int age, int salary)
    {
        this.ename= name;
        this.eage= age;
        this.esalary= salary;
    }
    public void show()
    {
        System.out.println("Employee name"+ename);
        System.out.println("Employee age"+eage);
        System.out.println("Employee salary"+esalary);
    }
    public static void main(String args[]) {
      
      employee x= new employee();
      x.read("vaibhav ", 24, 30000);
      x.show();
    }
}
