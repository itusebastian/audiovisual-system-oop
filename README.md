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

## Cambios Recientes y Funcionalidades Nuevas

- Implementación del patrón MVC para la presentación de contenidos audiovisuales.
- Adaptadores y servicios para la carga de datos desde archivos CSV (películas, series, documentales, etc.).
- Pruebas unitarias para las clases principales del modelo.
- Refactorización de la lógica de presentación usando clases `Presenter` especializadas.
- Agregado de diagramas UML y de clases actualizados.
- Mejoras en la organización del código y la extensibilidad del sistema.
- Nuevas clases: `VideoMusical` (gestión de videos musicales), `Podcast` (gestión de podcasts), interfaz `Mostrable` (unificación de presentación), y métodos de asociación y consulta en todas las clases principales.

## Estructura del Código

- `src/com/itulabs/modelo/`: Clases del dominio (Película, SerieDeTV, Documental, etc.).
- `src/com/itulabs/presentacion/`: Presenters para mostrar detalles en consola.
- `src/com/itulabs/controlador/`: Controladores para la lógica de negocio.
- `src/com/itulabs/vista/`: Vistas para la interacción con el usuario.
- `src/com/itulabs/util/`: Adaptadores y servicios para manejo de archivos CSV.
- `src/com/itulabs/aplicacion/PruebaAudioVisual.java`: Clase principal de ejemplo.
- `src/test/com/itulabs/`: Pruebas unitarias.

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

**Alternativa desde terminal:**

```bash
javac -d bin src/com/itulabs/aplicacion/PruebaAudioVisual.java
java -cp bin com.itulabs.aplicacion.PruebaAudioVisual
```

### 4. Ejemplo de uso

Al ejecutar la aplicación, se mostrarán en consola los detalles de varias películas, series, documentales, videos musicales y podcasts de ejemplo.

### 5. Ejecutar pruebas unitarias

Si tienes JUnit configurado en tu IDE:

- Haz clic derecho sobre la carpeta `test` y selecciona `Run as > JUnit Test`.

Desde terminal (requiere JUnit en el classpath):

```bash
javac -cp .:ruta/junit-4.13.2.jar -d bin src/test/com/itulabs/modelo/*.java
java -cp .:bin:ruta/junit-4.13.2.jar org.junit.runner.JUnitCore com.itulabs.modelo.ActorTest
```

Reemplaza `ruta/junit-4.13.2.jar` por la ruta donde tengas JUnit.

## Mejoras Adicionales

- Código optimizado y organizado en paquetes descriptivos.
- Uso de interfaces y patrón MVC para facilitar la extensibilidad.
- Ejemplo de pruebas de uso y pruebas unitarias incluidas.
- Preparado para agregar nuevas funcionalidades fácilmente.

---

¡Contribuciones y sugerencias son bienvenidas!
