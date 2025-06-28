package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases actualizadas
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 45, "Australia"));
        pelicula.agregarActor(new Actor("Zoe Saldana", 44, "Estados Unidos"));

        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy");
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));

        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astronomía"));
        documental.agregarInvestigador(new Investigador("Ann Druyan", "Guionismo"));

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[] {pelicula, serie, documental};

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}