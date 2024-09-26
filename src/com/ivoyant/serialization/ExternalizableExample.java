package com.ivoyant.serialization;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class ExternalizableEmployee implements Externalizable {
    private String name;
    private int id;

    // Default constructor (required for Externalizable)
    public ExternalizableEmployee() {
    }

    public ExternalizableEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Custom serialization logic
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(id);
    }

    // Custom deserialization logic
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        id = in.readInt();
    }

    @Override
    public String toString() {
        return "ExternalizableEmployee{name='" + name + "', id=" + id + "}";
    }
}

public class ExternalizableExample {
    public static void main(String[] args) {
        ExternalizableEmployee employee = new ExternalizableEmployee("Bob", 102);

        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("externalEmployee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(employee);
            System.out.println("Object serialized: " + employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try {
            FileInputStream fileIn = new FileInputStream("externalEmployee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            ExternalizableEmployee deserializedEmployee = (ExternalizableEmployee) in.readObject();
            System.out.println("Object deserialized: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}