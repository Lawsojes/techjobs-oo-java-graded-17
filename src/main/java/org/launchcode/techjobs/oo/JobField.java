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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
