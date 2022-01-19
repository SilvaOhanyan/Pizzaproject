package com.example.demo.model;

import java.util.Objects;

public class Ingredient {
    private int Id;
    private String name;
    private boolean editable;

    public Ingredient() {
    }

    public Ingredient(int id, String name, boolean editable) {
        Id = id;
        this.name = name;
        this.editable = editable;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Id == that.Id && editable == that.editable && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, editable);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", editable=" + editable +
                '}';
    }
}
