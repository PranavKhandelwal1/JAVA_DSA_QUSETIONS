package oops.staticKeywordConstructors;

public class singletonClass {

    public static void main(String[] args) {
        database db = database.getInstance();
        database db1 = database.getInstance();

        System.out.println(db==db1);

        db1.getData();
    }
}

class database {

    private static database dbInstence = null;

    private database() {
        System.out.println("This is singleton class!");
    }

    public static database getInstance() {
        if (dbInstence == null)
            dbInstence = new database();
        return dbInstence;
    }

    public void getData() {
        System.out.println("Getting data.");
    }

}
