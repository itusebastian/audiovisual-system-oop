# Proyecto de Gestión de Contenidos Audiovisuales

## Descripción del Proyecto

Esta aplicación permite gestionar diferentes tipos de contenidos audiovisuales como películas, series de TV, documentales, videos musicales y podcasts. El sistema permite almacenar información relevante de cada tipo de contenido, así como sus relaciones con actores, temporadas, investigadores, etc. El objetivo es ofrecer una estructura flexible y extensible para organizar y consultar información audiovisual, facilitando la gestión y consulta de datos para usuarios o desarrolladores.

### Características principales

- Gestión de películas, series de TV, documentales, videos musicales y podcasts.
- Asociación de actores a películas, temporadas a series, investigadores a documentales.
- Interfaz común (`Mostrable`) para mostrar detalles de cualquier entidad.
- Ejemplo de uso en la clase principal `PruebaAudioVisual`.

### Problema que resuelve

Facilita la organización, consulta y extensión de información sobre contenidos audiovisuales, permitiendo agregar fácilmente nuevos tipos de contenido y relaciones.

## Objetivos y Propósito

- Modelar de forma orientada a objetos el dominio audiovisual.
- Permitir la extensión sencilla del sistema con nuevos tipos de contenido.
- Proveer una base para futuras aplicaciones de gestión, consulta o visualización de datos audiovisuales.

## Clases y Funcionalidades Nuevas

- `VideoMusical`: Permite gestionar videos musicales, con atributos de artista, álbum y director.
- `Podcast`: Permite gestionar podcasts, con atributos de anfitrión, cantidad de episodios y temática.
- Interfaz `Mostrable`: Unifica la forma de mostrar detalles de cualquier entidad.
- Métodos de asociación y consulta en todas las clases principales.

## Instrucciones de Instalación y Uso

### 1. Clonar el repositorio

```bash
git clone https://github.com/itusebastian/audiovisual-system-oop.git
```

### 2. Importar el proyecto en Eclipse

- Abre Eclipse.
- Selecciona "Importar proyecto existente" y elige la carpeta del repositorio.

### 3. Compilar y ejecutar

- Asegúrate de tener Java instalado (JDK 8+).
- Ejecuta la clase principal:
  - Haz clic derecho sobre `PruebaAudioVisual.java` (en el paquete `aplicacion`) y selecciona `Run as > Java Application`.

### 4. Ejemplo de uso

Al ejecutar la aplicación, se mostrarán en consola los detalles de varias películas, series, documentales, videos musicales y podcasts de ejemplo.

## Mejoras Adicionales

- Código optimizado y organizado en paquetes descriptivos (`modelo`, `aplicacion`).
- Uso de interfaz para facilitar la extensibilidad.
- Ejemplo de pruebas de uso en la clase principal.
- Preparado para agregar pruebas unitarias y nuevas funcionalidades fácilmente.

---

¡Contribuciones y sugerencias son bienvenidas!
