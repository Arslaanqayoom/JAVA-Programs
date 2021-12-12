import java.lang.Math;
public class numbers {
   public static void main(String[] args) 
   {
      //integer values
      int a = 12;
      int b = 10;
      //float values
      float c = 110.00f;
      float d = 109.99f;
      // double values
      double e = 40.01d;
      double f = 32.73d;
      // long values
      long g = 323456l;
      long h = 55678l;
      System.out.println("Max of " + a +" and " + b +" is " + Math.max(a,b));
      System.out.println("Max of " + c +" and " + d +" is " + Math.max(c,d));
      System.out.println("Max of " + e +" and " + f +" is " + Math.max(e,f));
      System.out.println("Max of " + g +" and " + h +" is " + Math.max(g,h));
   }
}
