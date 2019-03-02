package pl.sda.t02_d1sob1_rozgrz;

public class Family {

    private Person father;
    private Person mother;
    private Person child;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getChild() {
        return child;
    }

    public void setChild(Person child) {
        this.child = child;
    }

    public Family(Person father, Person mother, Person child) {
        this.father = father;
        this.mother = mother;
        this.child = child;
    } // konstruktor

    //metoda wstawiona przez ALT+INS
    @Override
    public String toString() {
        return "pl.sda.t02_d1sob1_rozgrz.Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + child +
                '}';
    } // toString - pl.sda.t02_d1sob1_rozgrz.Family

} // pl.sda.t02_d1sob1_rozgrz.Family
