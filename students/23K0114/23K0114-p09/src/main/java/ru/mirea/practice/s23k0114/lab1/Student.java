package ru.mirea.practice.s23k0114.lab1;

class Student {
    int idNumber;
    String name;

    public Student(int idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String toString() {
        return name + " (" + idNumber + ")";
    }
}
