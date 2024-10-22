package singleton;

public class DBConnections {


    //Eager
    private static DBConnections conObject =new DBConnections();


    private  DBConnections(){

    }



    public  static DBConnections getLazy(){

        if (conObject==null){
            conObject=new DBConnections();
        }
        return conObject;
    }



}
