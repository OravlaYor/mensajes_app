# Mensajes App

Una aplicación de mensajería para gestionar mensajes, desarrollada con Java y MySQL.

---

## Descripción

**Mensajes App** es una aplicación backend que permite a los usuarios:

- Crear, leer, actualizar y eliminar mensajes.
- Gestionar el contenido de mensajes mediante una base de datos relacional.

El proyecto está diseñado para demostrar las capacidades básicas de interacción con bases de datos utilizando Java.

---

## Tecnologías Utilizadas

- **Backend**: Java.
- **Base de Datos**: MySQL.
- **Gestor de Dependencias**: Maven.
- **Cliente de Base de Datos**: MySQL Workbench (opcional).

---

## Características Principales

- **CRUD de Mensajes**: Los usuarios pueden realizar las operaciones de Crear, Leer, Actualizar y Eliminar mensajes.
- **Interacción con Base de Datos**: Conexión eficiente con MySQL para gestionar los datos de los mensajes.

---

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener:

- **Java 17 o superior**.
- **Maven** instalado.
- **MySQL** configurado.

---

## Instalación y Ejecución

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/OravlaYor/mensajes_app.git
   cd mensajes_app
   ```

2. **Configurar la base de datos**:

   - Crea una base de datos en MySQL con el siguiente comando:
     ```sql
     CREATE DATABASE mensajes_app;
     ```
   - Edita los detalles de conexión en el código fuente (`Conexion.java`):
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/mensajes_app";
     private static final String USER = "tu_usuario";
     private static final String PASSWORD = "tu_contraseña";
     ```

3. **Compilar y ejecutar el proyecto**:

   - Compila el proyecto con tu IDE preferido (Eclipse, IntelliJ, etc.) o utiliza el siguiente comando:
     ```bash
     mvn compile
     ```
   - Ejecuta la aplicación:
     ```bash
     mvn exec:java -Dexec.mainClass="Main"
     ```

---

## Funcionalidades del Programa

El programa presenta un menú en consola para realizar las siguientes acciones:

1. **Crear Mensaje**: Permite agregar un nuevo mensaje a la base de datos.
2. **Listar Mensajes**: Muestra todos los mensajes almacenados en la base de datos.
3. **Editar Mensaje**: Modifica el contenido de un mensaje existente.
4. **Eliminar Mensaje**: Elimina un mensaje de la base de datos.
5. **Salir**: Termina la ejecución del programa.

---

## Mejoras Futuras

- Implementar una interfaz gráfica para la gestión de mensajes.
- Añadir soporte para múltiples usuarios y autenticación.
- Migrar la base de datos a un entorno en la nube para mayor escalabilidad.

---

## Autor

**Roy Alvarado**\
[GitHub](https://github.com/OravlaYor) | [LinkedIn](https://www.linkedin.com/in/royalvarodr/)

