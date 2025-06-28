package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases actualizadas
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 45, "Australia"));
        pelicula.agregarActor(new Actor("Zoe Saldana", 44, "Estados Unidos"));

        Pelicula pelicula2 = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        pelicula2.agregarActor(new Actor("Leonardo DiCaprio", 50, "Estados Unidos"));
        pelicula2.agregarActor(new Actor("Elliot Page", 38, "Canadá"));

        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy");
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));

        SerieDeTV serie2 = new SerieDeTV("Breaking Bad", 47, "Drama");
        serie2.agregarTemporada(new Temporada(1, 7));
        serie2.agregarTemporada(new Temporada(2, 13));

        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astronomía"));
        documental.agregarInvestigador(new Investigador("Ann Druyan", "Guionismo"));

        Documental documental2 = new Documental("Nuestro Planeta", 50, "Naturaleza", "Ecosistemas");
        documental2.agregarInvestigador(new Investigador("David Attenborough", "Biología"));

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[] {pelicula, pelicula2, serie, serie2, documental, documental2};

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}