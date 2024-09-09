package singleton;

public class DbMain
{


    public static void main(String[] args) {
        DBConnections connections=DBConnections.getInstance();
        DBConnections connections1=DBConnections.getInstance();
    }
}
