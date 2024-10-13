# Sistema de Gestión de Usuarios

## Descripción del Proyecto

El **Sistema de Gestión de Usuarios** es una aplicación de escritorio desarrollada en Java utilizando el patrón de diseño **Modelo-Vista-Controlador (MVC)**. El objetivo principal de este software es permitir a los usuarios administrar la información de otros usuarios, con funcionalidades básicas para agregar, ver y eliminar usuarios.

## Características

- Interfaz gráfica simple e intuitiva utilizando `JOptionPane`.
- Capacidad para:
  - Agregar nuevos usuarios con nombre, correo y rol.
  - Ver la lista de usuarios existentes.
  - Borrar usuarios de la lista.
- Implementación del patrón MVC para una mejor separación de responsabilidades y mantenibilidad del código.

## Arquitectura

La aplicación está estructurada en tres componentes principales:

- **Modelo**: Representa los datos y la lógica de negocio del sistema (clase `Usuario`).
- **Vista**: Interactúa con el usuario y muestra la interfaz gráfica.
- **Controlador**: Maneja la lógica de la aplicación, conectando el modelo con la vista.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para el desarrollo de la aplicación.
- **JOptionPane**: Biblioteca para crear ventanas emergentes y facilitar la interacción con el usuario.
- **Scanner**: Utilizado para la entrada de datos en la consola.
- **ArrayList**: Estructura de datos utilizada para almacenar la lista de usuarios.

## Instalación

1. Clona este repositorio en tu máquina local
