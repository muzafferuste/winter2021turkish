package day23_staticKeyword;

public class C1_MyConstructor {
	    
	    int x =3;
	    int y =5;
	    
	    C1_MyConstructor() {
	    	
	        x+=1;
	        System.out.println("-x1"+x);       
	    }
	    
	    C1_MyConstructor(int i) {
	    	
	        this();
	        
	        this.y=i;
	        x+=y;
	        System.out.println("-x2"+x);
	        }
	    
	    C1_MyConstructor(int i, int i2) {
	    	
	        this(3);
	        
	        this.x-=4;
	        System.out.println("-x3"+x);
	    }
	    
	    public static void main(String[] args) {
	    	
	        C1_MyConstructor mc1 = new C1_MyConstructor (4,3);
	        System.out.println(mc1); // variable'da uyari vermesin diye yazdim!!
	    }

	}