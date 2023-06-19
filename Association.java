class Address {
    String city, vill, state;
    int pin;

    Address(String city, String vill, String state, int pin) {
        this.city = city;
        this.vill = vill;
        this.state = state;
        this.pin = pin;
    }

}

class Salary {
    int da, pf;

    Salary(int da, int pf) {

        this.da = da;
        this.pf = pf;

    }
}

class Association {

    String name;
    int age;
    Address ad; // aggregiation
    Salary sl; // aggregiation

    Association(String name, int age) {

        this.name = name;
        this.age = age;

        ad = new Address("Baruipur", "Champahati", "West Bengal", 743330); // composition
        sl = new Salary(3200, 4000); // composition

    }

    void show() {
        System.out.println("Emp name= " + name);
        System.out.println("Emp age= " + age);
        System.out.println("Emp city= " + ad.city);
        System.out.println("Emp vill= " + ad.vill);
        System.out.println("Emp state= " + ad.state);
        System.out.println("Emp pin= " + ad.pin);
        System.out.println("Emp da= " + sl.da);
        System.out.println("Emp pf= " + sl.pf);
    }

    public static void main(String[] args) {
        Association a = new Association("AKASH ROY", 25);
        a.show();
    }
}