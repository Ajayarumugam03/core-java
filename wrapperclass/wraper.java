package wrapperclass;

public class wraper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
        boolean animal1 = true;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println("AutoBoxing : "+i + " " +j);      
        Boolean animal2 = animal1;
        System.out.println("Boolean : "+animal2);
                
        int unboxInt = i;
        boolean unboxBool = animal2;
        
        System.out.println("Unboxing Int : "+ unboxInt);
        System.out.println("Unboxing Boolean : "+unboxBool);
	}

}
