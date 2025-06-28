/**
 * Class SerieDeTV
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas.size());
        for (Temporada t : temporadas) {
            t.mostrarDetalles();
        }
        System.out.println();
    }
}