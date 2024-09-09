package MyTest;

public class AnonymousClass {
    public static void main(String[] args) {


        car audicar=new car() {
            @Override
            public void pressBreak() {
                System.out.println("testing car ");

            }
        };
        audicar.pressBreak();

    }
}


