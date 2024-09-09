package JavaTesting;

public class InheritanceCode {



    public void testingCode (String a){
        System.out.println(a);
    }


}

class class2 extends InheritanceCode{


    public static void main(String[] args) {
        class2 obj=new class2();
        obj.testingCode("abhijth");
    }

}
