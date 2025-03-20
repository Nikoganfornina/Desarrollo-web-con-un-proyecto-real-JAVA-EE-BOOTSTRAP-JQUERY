# Desarrollo Web con un Proyecto Real: **Java EE + Bootstrap + jQuery**

Este repositorio contiene un **proyecto de desarrollo web** utilizando **Java EE**, **Bootstrap**, **jQuery** y **servlets**. El objetivo es desarrollar una **aplicación web dinámica** que gestione usuarios y alquiler de libros con operaciones CRUD completas, implementadas mediante **Java EE** en el backend y una base de datos **MariaDB** para almacenar la información. El sistema hace uso de tecnologías modernas como **Bootstrap** para el diseño de la interfaz de usuario y **jQuery** para la interactividad en el frontend.

## 🚀 **Tecnologías Utilizadas**

- **Java EE** (Servlets, JDBC)
- **Bootstrap** (para la interfaz de usuario)
- **jQuery** (para la interacción y manipulación dinámica de la UI)
- **MariaDB** (base de datos SQL)
- **HeidiSQL** (para la gestión de la base de datos)
- **HTML5** y **CSS3** (estructura y diseño)
- **Git** (control de versiones)

## 🛠️ **Características del Proyecto**

El proyecto se centra en la **gestión de usuarios** y el **alquiler de libros**, con un enfoque práctico para implementar una aplicación web completa. A continuación se detallan las funcionalidades más importantes:

### 1. **Gestión de Usuarios**
   - **Login:** Los usuarios pueden iniciar sesión proporcionando un nombre de usuario y una contraseña.
   - **Registro:** Los usuarios pueden registrarse introduciendo su nombre, apellidos, correo electrónico y contraseña.
   - **Modificación de Datos:** Los usuarios pueden actualizar sus datos personales (nombre, apellidos, correo electrónico, contraseña, saldo y estado premium).
   - **Eliminación de Cuenta:** Los usuarios pueden eliminar su cuenta, lo que también elimina los registros asociados en la base de datos.

### 2. **Gestión de Alquiler de Libros**
   - **Visualización de Copias:** Los usuarios pueden ver las copias de libros que tienen alquiladas y su estado.
   - **Devolución de Libros:** Los usuarios pueden devolver los libros alquilados, lo que actualiza la base de datos y devuelve las copias al stock.

### 3. **Base de Datos MariaDB**
   - **Uso de MariaDB:** La aplicación se conecta a una base de datos **MariaDB**, donde se almacenan los datos de los usuarios y el historial de alquileres.
   - **Gestión a través de HeidiSQL:** Se utiliza **HeidiSQL** para gestionar la base de datos, realizando consultas, inserciones y modificaciones directamente desde una interfaz gráfica.

## 📂 **Estructura del Proyecto**

### Backend (Java EE)
- **Controladores (Controllers):** Gestionan las operaciones de negocio y procesan las solicitudes HTTP desde los servlets. Son responsables de interactuar con la base de datos a través de JDBC.
- **Servlets:** Son los puntos de entrada para las solicitudes del usuario, como login, registro, eliminación de cuentas, etc.
- **Base de Datos (MariaDB):** Toda la información de usuarios, libros y alquileres se almacena en una base de datos MariaDB, administrada a través de HeidiSQL.

### Frontend
- **HTML y CSS (Bootstrap):** El diseño de la interfaz de usuario se realiza con **Bootstrap**, permitiendo una experiencia **responsive**.
- **jQuery:** Se utiliza para la interactividad en el frontend, facilitando tareas como la validación de formularios, actualizaciones dinámicas de contenido y la gestión de eventos.



