package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;


    public JobField(String value) {
        this.setValue(value);
        id = nextId;
        nextId++;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value.isEmpty()){
            this.value = "Data not available";
        } else {
            this.value = value;
        }

    }
    /*
    * id
    * constructor
    * toString
    * equals
    * hashCode
    * getID
    * getValue
    * setValue
    * */
}
