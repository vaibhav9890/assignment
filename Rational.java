import java.util.*;
class Rational{

    private int numerator;
    private int denominator;
    
 public Rational()
 {
     numerator =denominator=0;
 }
 
 public Rational(int numerator, int denominator)
  {
      this.numerator= numerator;
      this.denominator= denominator;
  }
  public Rational(Rational rn)
  {
      numerator= rn.numerator;
      denominator= rn.denominator;
  }
  
  public void read()
  {
      Scanner x=new Scanner(System.in);
      int numerator= x.nextInt();
      int denominator= x.nextInt();
  }
  public void show()
  {
      System.out.println("Rational number =" +numerator+"/"+denominator);
      
  }
}
 public class program
 {
      public static void main(String []args){
     Rational r= new Rational();
     r.show();
     Rational r1= new Rational(10,20);
     r1.show();
     Rational r2= new Rational(r1);
     r2.show();
    }
 }

