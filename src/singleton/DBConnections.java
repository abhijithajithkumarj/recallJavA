package singleton;

public class DBConnections {


    private static final DBConnections conObject =new DBConnections();


    private  DBConnections(){

    }


    public  static DBConnections getInstance(){
        return conObject;
    }
}
