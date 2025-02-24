package com.listas_tareas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese sus tareas");

        LinkedHashSet<String> tareas = new LinkedHashSet<>();
        boolean agregarTarea;
        do {
            System.out.print("Tarea: ");
            String tarea = sc.nextLine();
            tareas.add(tarea);

            System.out.print("¿Desea agregar otra tarea? (S/N): ");
            String respuesta = sc.nextLine();
            agregarTarea = respuesta.equalsIgnoreCase("S");
        } while (agregarTarea);

        int opcion;
        do {
            String menu = """
            ============================
            ===  ¿QUE DESEA HACER?   ===
            ============================
            1. Lista de Tareas.
            2. Eliminar Tarea.
            3. Salir.
            """;
            System.out.println(menu);
            System.out.println("Seleccione una opción: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número");
                sc.next();
                System.out.println("Seleccione una opción: ");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista de Tareas: ");
                    int contador = 1;
                    for (String tarea : tareas) {
                        System.out.println(contador + ". " + tarea);
                        contador++;
                    }
                    break;

                case 2:
                    boolean eliminar;
                    do {
                        System.out.println("Ingrese el número de la tarea que desea eliminar: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Error: Debe ingresar un número");
                            sc.nextLine();
                            System.out.println("Ingrese el número de la tarea que desea eliminar: ");
                        }
                        int numeroEliminado = sc.nextInt();
                        sc.nextLine();

                        String[] tareasArray = tareas.toArray(new String[0]);

                        if (numeroEliminado > 0 && numeroEliminado <= tareasArray.length) {
                            String tareaEliminada = tareasArray[numeroEliminado - 1];
                            tareas.remove(tareaEliminada);
                            System.out.println("Su Tarea ha sido eliminada correctamente");
                        } else {
                            System.out.println("Número de tarea inválido");
                        }

                        System.out.println("Lista de tareas actualizada");
                        contador = 1;
                        for (String tarea : tareas) {
                            System.out.println(contador + ". " + tarea);
                            contador ++;
                        }

                        System.out.println("¿Desea eliminar otra tarea? (S/N): ");
                        String respuesta = sc.nextLine();
                        eliminar = respuesta.equalsIgnoreCase("S");
                    } while (eliminar);

                    break;

                case 3:
                    System.out.println("¡¡Gracias por usar este programa!!");
                    break;
            
                default:
                    System.out.println("Esta opción no es Valida....");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}