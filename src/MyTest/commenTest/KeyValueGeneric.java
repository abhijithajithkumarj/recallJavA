package MyTest;

public class KeyValueGeneric {


    public  <T> void  setValue(T testing){

    }


    public static void main(String[] args) {

    }



}


class  testing <k,v> {

    private k key;
    private  v value;

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }
}
