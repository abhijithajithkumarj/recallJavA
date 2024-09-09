package JavaTesting;

public class ConstructorTestingCode {

    private String name;
    private int age;

    public ConstructorTestingCode (String name,int age){
        this.age=age;
        this.name=name;

    }

    public  String getName(){
        return name;
    }

    public int getAge(){
        return  age;
    }

    public static void main(String[] args) {
        ConstructorTestingCode obj=new ConstructorTestingCode("Abhijith",24);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }


}
