package com.company.File;

import java.util.ArrayList;

public class MYObject {
    private String name;
    private String employees;
    private final ArrayList<String> offices = new ArrayList<>();

    @Override
    public String toString() {
        return "MYObject{" +
                "name='" + name + '\'' +
                ", employees='" + employees + '\'' +
                ", offices=" + offices +
                '}';
    }
}
