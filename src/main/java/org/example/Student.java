package org.example;

/***************************************************************************
 *  Nafn     : Ólafur Pálsson
 *  T-póstur : olp10@hi.is
 *
 *  Lýsing   :
 *
 *
 ****************************************************************************/
public class Student extends User {
    private boolean feePaid;

    public boolean isFeePaid() {
        return feePaid;
    }

    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }

    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;
    }
}
