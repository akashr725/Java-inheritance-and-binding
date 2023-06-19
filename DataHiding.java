class Dadaji {
    int x = 100;
}

class based extends Dadaji {
    int x = 20;
}

public class DataHiding extends based {

    int x = 10;

    void show() { //
        System.out.println(((based) this).x); // we have done typecasting of this keyword which is hold the current
                                              // class object
        System.out.println(((Dadaji) this).x);
        System.out.println(x);
    }
    // void show(based b1, Dadaji d1) { // we have done upcasting here
    // System.out.println(x);
    // System.out.println(b1.x);
    // System.out.println(d1.x);
    // }

    public static void main(String[] args) {

        DataHiding d = new DataHiding();
        d.show();

    }
}
