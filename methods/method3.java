package methods;

public class method3 {
	int num1;
    int num2;
    
    void insertNum(int num1, int num2)
    {
  	  this.num1 = num1;
  	  this.num2 = num2;
    }
    
    int sum() {
  	 return num1-num2;
    }    
    void multiply() {
  	  System.out.println("Multiply of two numbers: " + (num1*num2));
    }
    void division() {
  	  System.out.println("Division of two number: " + (num1/num2));
    }    
public static void main(String args[]) {		
		method3 t = new method3();
		t.insertNum(7, 5);
		System.out.println("subtraction of two numbers:" + t.sum());
      t.multiply();
      t.division();
	}
}
