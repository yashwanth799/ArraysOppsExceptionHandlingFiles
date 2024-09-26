package com.ivoyant.serialization;

import java.io.*;

// Class implementing Externalizable
class Manager implements Externalizable {
    private String name;
    private int salary;

    // Default constructor is mandatory for Externalizable
    public Manager() {
    }

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Manually writing object fields
        out.writeObject(name);
        out.writeInt(salary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Manually reading object fields
        name = (String) in.readObject();
        salary = in.readInt();
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', salary=" + salary + "}";
    }
}

public class ManagerExternalizable {
    public static void main(String[] args) {
        // Serialize the Manager object
        serializeManager();

        // Deserialize the Manager object
        deserializeManager();
    }

    private static void serializeManager() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("manager.ser"))) {
            Manager manager = new Manager("Alice", 90000);
            oos.writeObject(manager);  // Custom serialization
            System.out.println("Manager serialized: " + manager);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeManager() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("manager.ser"))) {
            Manager manager = (Manager) ois.readObject();  // Custom deserialization
            System.out.println("Manager deserialized: " + manager);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}