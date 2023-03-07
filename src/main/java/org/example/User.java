package org.example;

/***************************************************************************
 *  Nafn     : Ólafur Pálsson
 *  T-póstur : olp10@hi.is
 *
 *  Lýsing   :
 *
 *
 ****************************************************************************/
public abstract class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {

    }
}
