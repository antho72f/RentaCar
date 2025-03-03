package Principal;

import Alquiler.Queue;
import Alquiler.Solicitud;
import Clientes.Cliente;
import Clientes.ListaDC;
import Sugerencias.Sugerencias;
import Vehiculo.Car;
import Vehiculo.StackCars;

/**
 *
 * @author antho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Nodo nulo, funciona para poder acomodar los vehiculos por año mas reciente al mas viejo
        StackCars.push(new Car("######", "#", "#", 0001, "#", "# cc ", 0, 0, "#", "#", "#", 0));

        StackCars.push(new Car("CAF654", "Nissan", "Sentra", 2010, "Rojo", "1.600 cc", 6, 5000, "B", "Nuevo", "Disponible", 8));
        StackCars.push(new Car("BFF126", "Mitsubishi", "L200", 2016, "Azul", "2.400 cc", 4, 3000, "A", "Nuevo", "Disponible", 10));
        StackCars.push(new Car("BIC074", "Chevrolet", "Spark", 2014, "Azul", "1.400 cc", 5, 4000, "C", "Nuevo", "Alquilado", 7));
        StackCars.push(new Car("FO902N", "Mitsubishi", "L200", 2022, "Azul", "2.400 cc", 4, 2500, "D", "Nuevo", "Disponible", 5));
        StackCars.push(new Car("J90NWA", "Mitsubishi", "L200", 2011, "Azul", "2.400 cc", 4, 6000, "E", "Nuevo", "Disponible", 2));

        ListaDC.agregar(new Cliente("A1", "Alex", "01/01/2001", "a@gmail.com", 1, 11));
        ListaDC.agregar(new Cliente("B2", "Bart", "02/02/2002", "b@gmail.com", 3, 7));
        ListaDC.agregar(new Cliente("C3", "Carl", "03/03/2003", "c@gmail.com", 4, 2));
        ListaDC.agregar(new Cliente("D4", "Dani", "04/04/2004", "d@gmail.com", 1, 20));
        ListaDC.agregar(new Cliente("E5", "Eime", "05/05/2005", "e@gmail.com", 4, 4));
        ListaDC.agregar(new Cliente("F6", "Ferr", "06/06/2006", "f@gmail.com", 4, 3));
        ListaDC.agregar(new Cliente("G7", "Gere", "07/07/2007", "g@gmail.com", 2, 8));
        ListaDC.agregar(new Cliente("H8", "Hime", "08/08/2008", "h@gmail.com", 3, 10));
        ListaDC.agregar(new Cliente("I9", "Ines", "09/09/2009", "i@gmail.com", 1, 15));

        //Nodos nulos, se necesita un head (zafiro), un tail (bronce) y una variable en medio (oro) para que el codigo funcione correctamente
        //y no de error a la hora de insertar nodos
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", "0", 0, "####", "ZAFIRO", "##########"));
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", "0", 0, "####", "BRONCE", "##########"));
        Queue.enqueue(new Solicitud("00/00/0000", "00", 0, 0, "0", "0", "0", 0, "####", "ORO", "##########"));

        Queue.enqueue(new Solicitud("09/08/2022", "A1", 5, 2, "Nissan", "Sentra", "Sin extras", 250.50, "CAF654", "PLATA", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "B2", 7, 4, "Mitsubishi", "L200", "Aire acondicionado", 500.75, "BFF126", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "C3", 3, 3, "Chevrolet", "Spark", "GPS", 180.90, "BIC074", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "D4", 11, 4, "Mitsubishi", "L200", "Full equipo", 750.00, "FO902N", "ZAFIRO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "E5", 5, 5, "Chevrolet", "Spark", "Asientos de cuero", 350.40, "BIC074", "ZAFIRO", "Finalizada"));
        Queue.enqueue(new Solicitud("09/08/2022", "F6", 6, 6, "Mitsubishi", "L200", "Vidrios polarizados", 480.60, "J90NWA", "ORO", "Registrada"));
        Queue.enqueue(new Solicitud("09/08/2022", "G7", 7, 7, "Nissan", "Sentra", "Bluetooth", 500.75, "CAF654", "PLATA", "Finalizada"));
        Queue.enqueue(new Solicitud("09/08/2022", "H8", 8, 8, "Chevrolet", "Spark", "Asientos calefactables", 580.80, "BIC074", "BRONCE", "Rechazada"));
        Queue.enqueue(new Solicitud("09/08/2022", "I9", 9, 9, "Mitsubishi", "L200", "Sin extras", 620.90, "BFF126", "ORO", "Finalizada"));
        Queue.enqueue(new Solicitud("09/08/2022", "J10", 10, 10, "Nissan", "Sentra", "Radio táctil", 700.00, "CAF654", "PLATA", "Procesada"));
        Queue.enqueue(new Solicitud("09/08/2022", "A1", 13, 5, "Chevrolet", "Spark", "Extra", 337.87, "BIC074", "PLATA", "Finalizada"));
        Queue.enqueue(new Solicitud("10/08/2022", "B2", 12, 4, "Mitsubishi", "L200", "Techo panorámico", 780.20, "BFF126", "ZAFIRO", "Rechazada"));
        Queue.enqueue(new Solicitud("10/08/2022", "C3", 5, 3, "Chevrolet", "Spark", "Sonido premium", 400.99, "BIC074", "PLATA", "Finalizada"));
        

        Sugerencias.inserta("No tienen autos eléctricos");
        Sugerencias.inserta("Cobran muy caro");
        Sugerencias.inserta("El auto no estaba disponible");
        Sugerencias.inserta("No tenía el tanque de gasolina lleno");

        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);

    }

}