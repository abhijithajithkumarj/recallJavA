package MyTest;

import javax.swing.text.html.HTMLDocument;

public class InnerClass {

    static class innerClassOne{
        public static void  testingPrint(){
            System.out.println("Testing print");
        }
    }



    int Data=55;

    public void  testingInnerClass(){
        int testingData=85;

        class LocalInnerClass extends  innerClassOne{
            final int localData=859;

            public void print(){
                System.out.println(testingData+ Data+localData);
            }

        }

        LocalInnerClass localInnerClass=new LocalInnerClass();

        localInnerClass.print();
        innerClassOne.testingPrint();
    }
}

class  invoking extends InnerClass{
    public static void main(String[] args) {

        invoking innerClass=new invoking();
        innerClass.testingInnerClass();

    }
}
