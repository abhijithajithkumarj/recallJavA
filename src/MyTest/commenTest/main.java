package MyTest.commenTest;

 class GenericClass<T> {


    T value;


    public  T getValue(){
        return value;
    }


    public  void  setValue(T value){
        this.value=value;
    }


}

public class  main extends GenericClass<String>{
    public static void main(String[] args) {

        GenericClass<Integer> genericClass=new GenericClass<>();
        genericClass.setValue(855);
        System.out.println(genericClass.getValue());


        GenericClass<String> genericClass1 =new GenericClass<>();
        genericClass1.setValue("Abhijith");
        System.out.println(genericClass1.getValue());




    }
}
