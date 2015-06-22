package hackerrank.java;


public class JavaInheritance {

    public static void main(String []argh){
	 Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
        
    }
    static class Arithmetic{
	int add(int a, int b){return a+b;}
    }
    
    
    static class Adder extends Arithmetic {
    }
}
