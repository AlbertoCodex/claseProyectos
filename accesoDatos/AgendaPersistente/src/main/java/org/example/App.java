package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

/**
 * Alberto Naranjo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        menu();
    }
    public static Session conectDB() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        if (session != null) {
            System.out.println("Se ha iniciado sesion");
        } else {
            System.out.println("No se pudo iniciar sesion");
        }
        return session;
    }

    public static ContactoClass findPersona(Session session, String dni) {
        System.out.println(session);
        ContactoClass persona = session.get(ContactoClass.class, dni);
        if (persona == null) {
            System.out.println("No existe esta persona");
        } else {
            System.out.println("Esta persona es: ");
            System.out.println(persona.getNombre());
        }
        session.close();
        return persona;
    }

    public static void addPersona(Session session) {
        Scanner sc = new Scanner(System.in);
        ContactoClass persona = new ContactoClass();
        System.out.println("Introduce el DNI");
        persona.setDni(sc.nextLine());
        System.out.println("Introduce el nombre");
        persona.setNombre(sc.nextLine());
        session.beginTransaction();
        session.persist(persona);
        session.getTransaction().commit();
        session.close();
    }

    public static void menu() {
        Session conex = conectDB();
        findPersona(conex,"1234X");
    }
}
