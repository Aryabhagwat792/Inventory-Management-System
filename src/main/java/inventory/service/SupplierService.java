package inventory.service;

import inventory.model.Supplier;
import inventory.util.FileManager;

import java.util.ArrayList;

public class SupplierService {

    private ArrayList<Supplier> suppliers;
    private final String FILE = "data/suppliers.dat";

    public SupplierService() {
        suppliers = FileManager.load(FILE);
    }

    public void add(Supplier s) {
        suppliers.add(s);
        save();
        System.out.println("Supplier added successfully!");
    }

    public void view() {
        if (suppliers.isEmpty()) {
            System.out.println("No suppliers found.");
            return;
        }

        System.out.println("\n---------------- SUPPLIERS ----------------");

        for (Supplier s : suppliers) {
            System.out.println(
                "ID: " + s.getId() +
                " | Name: " + s.getName() +
                " | Contact: " + s.getContact() +
                " | Email: " + s.getEmail()
            );
        }
    }

    public Supplier search(int id) {
        for (Supplier s : suppliers) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public void update(int id, String name, String contact, String email) {

        Supplier s = search(id);

        if (s == null) {
            System.out.println("Supplier not found.");
            return;
        }

        s.setName(name);
        s.setContact(contact);
        s.setEmail(email);

        save();
        System.out.println("Supplier updated successfully!");
    }

    public void delete(int id) {

        Supplier s = search(id);

        if (s == null) {
            System.out.println("Supplier not found.");
            return;
        }

        suppliers.remove(s);
        save();
        System.out.println("Supplier deleted successfully!");
    }

    public void save() {
        FileManager.save(FILE, suppliers);
    }
}