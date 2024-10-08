package r1;

import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        Map<String, Queue<Telefono>> agenda = new TreeMap<>();
        agenda.put("Carlos", new PriorityQueue<>());
        agenda.put("Beto", new PriorityQueue<>());
        agenda.put("Abigail", new PriorityQueue<>());
        agenda.put("Cesar", new PriorityQueue<>());
        agenda.put("Mónica", new PriorityQueue<>());
        agenda.put("Fernando", new PriorityQueue<>());

        Collections.addAll(agenda.get("Carlos"),
                new Telefono("5824-6397", 1),
                new Telefono("8271-9346", 2)
        );
        Collections.addAll(agenda.get("Beto"), new Telefono("6185-7961", 1));
        Collections.addAll(agenda.get("Abigail"),
                new Telefono("6848-6573", 1),
                new Telefono("4152-6378", 2)
        );
        Collections.addAll(agenda.get("Cesar"), new Telefono("7418-5296", 1));
        Collections.addAll(agenda.get("Mónica"),
                new Telefono("7698-1254", 1),
                new Telefono("1973-4682", 2)
        );
        Collections.addAll(agenda.get("Fernando"), new Telefono("9753-8642", 1));

        for (String nombre : agenda.keySet()) {
            Queue<Telefono> telefonos = agenda.get(nombre);
            System.out.print(nombre + ": ");
            Telefono telefono;
            while((telefono = telefonos.poll()) != null){
                System.out.print("\t" + telefono.getNumero() + "\n");
            }
        }
    }
}
