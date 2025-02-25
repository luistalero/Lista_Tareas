# 🚀 Ejercicio #5 - Lista de Tareas con LinkedHashSet

# 📌 Propósito
Este programa en Java permite gestionar una lista de tareas utilizando la estructura de datos `LinkedHashSet<String>`. Con esta implementación, las tareas se almacenan en el orden en que fueron ingresadas sin permitir duplicados. El programa permite:

1. Registrar tareas.
2. Mostrar la lista de tareas.
3. Eliminar tareas por su número.
4. Salir del programa.

El proyecto utiliza conceptos básicos de programación en Java, como `LinkedHashSet`, `Scanner` para la entrada de datos y estructuras de control como bucles y condicionales.


# 🛠️ Instalación y Configuración
## Requisitos Previos
- Java Development Kit (JDK) 17 o superior
- Git instalado en tu sistema

## Clonar Repositorio
```bash
https://github.com/luistalero/Lista_Tareas.git
```

# 🚀 Uso

## 1. Registro de Tareas:
- El programa solicitará al usuario que ingrese las tareas una por una.
- Se validará si desea agregar más tareas.
- Se almacenarán en un `LinkedHashSet<String>`.

## 2. Mostrar Lista de Tareas:
- Una vez seleccionada la opción Uno (1) del menú, se mostrarán todas las tareas registradas en el orden en que fueron ingresadas.

## 3. Eliminar una Tarea:
- Una vez seleccionada la opción Dos (2) del menú, se pedirá el número de la tarea que se desea eliminar.
- Si el número es válido, la tarea será eliminada y se actualizará la lista.

## 4. Salir:
- Una vez seleccionada la opción Tres (3) del menú, el programa se cerrará agradeciendo por su uso.

# 👷 Ejemplo de Ejecución
```bash
Ingrese sus tareas
Tarea: "Comprar leche"
¿Desea agregar otra tarea? (S/N): "S"
Tarea: "Hacer ejercicio"
¿Desea agregar otra tarea? (S/N): "N"
```

```bash
============================
===  ¿QUE DESEA HACER?   ===
============================
1. Lista de Tareas.
2. Eliminar Tarea.
3. Salir.

Seleccione una opción: "1"
Lista de Tareas:
1. Comprar leche
2. Hacer ejercicio
```

```bash
Seleccione una opción: "2"
Ingrese el número de la tarea que desea eliminar: "1"
Su tarea ha sido eliminada correctamente.
Lista de tareas actualizada:
1. Hacer ejercicio
```

```bash
Seleccione una opción: "3"
¡¡Gracias por usar este programa!!
```

# 📋 Características
- Registro de tareas sin permitir duplicados utilizando `LinkedHashSet<String>`.
- Mostrar todas las tareas en el orden ingresado.
- Eliminar tareas por número y actualizar la lista.
- Interacción amigable con el usuario a través del menú.

# 🚨 Estado del Ejercicio
- ✅ **Culminado**

# 👤 Autor
- **Luis Alberto Talero Martinez**