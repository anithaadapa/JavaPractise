package TypeCastingExamples;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Down casting
int a =10;
        
        long b =a;
        
        float c=b;
        
        System.out.println(b);
        System.out.println(c);
        
        //Up casting
        
        double d = 100.30;
        
        long x=(long)d;
        
        System.out.println(x);
        
        int y = (int)x;
        
        System.out.println(y);

}
}

