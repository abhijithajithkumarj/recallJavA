package DataStructure.RecursionPattern;

public class StarPrinting {


    public static void main(String[] args) {
        print(5,0);

    }


    static void  print(int value,int line){
        if (value==0){
            return;
        }
        if (line < value){
            System.out.print("*");
            print(value,line+1);

        }else {
            System.out.println();
            print(value-1,0);
        }
    }

    static void  printReverse(int value,int line){
        if (value==0){
            return;
        }
        if (line < value){

            printReverse(value,line+1);
            System.out.print("*");

        }else {

            printReverse(value-1,0);
            System.out.println();
        }
    }


}
