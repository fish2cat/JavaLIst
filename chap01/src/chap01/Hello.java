package chap01;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		Father son = new Son(); //����ΪFather��,son1��̬������Father���  
        son.method();  
        son.staticMethod();  
        Father.a = 8;
        System.out.println(Son.a);
        Son son2 = new Son();  
        son2.method();  
        son2.staticMethod();  
        Son.a = 10;
        System.out.println(Father.a);
        f.test();
        new ftest().defaultTest();
        Father f1 = new Father();
        Father f2 = f1;
        System.out.println(f1.equals(f2));
	}
	
}
class Father{  
	static int a = 6;
    
    void method(){  
        System.out.println("���෽��");  
    }  
      
    static void staticMethod(){  
        System.out.println("���ྲ̬����");  
    }
    static class Fatherinner1{
    	
    }
    class Fatherinner2{
    	
    }
}  
  
class Son extends Father{  
	
      
    void method(){  
        System.out.println("���෽��");  
    }  
      
    static void staticMethod(){  
        System.out.println("���ྲ̬����");  
    } 
}  
interface f{
	static void test() {
		System.out.println("f.test");
	}
	default void defaultTest() {
		System.out.println("f.defaultTest");
	}
}
interface f1 extends f{
	default void defaultTest() {
		System.out.println("f1.defaultTest");
	}
}
class ftest implements f1{
	
}