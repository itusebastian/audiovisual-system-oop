package modelo;

public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private int cantidadEpisodios;
    private String tematica;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion, int cantidadEpisodios, String tematica) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
        this.cantidadEpisodios = cantidadEpisodios;
        this.tematica = tematica;
    }

    public String getAnfitrion() {
        return anfitrion;
    }

    public void setAnfitrion(String anfitrion) {
        this.anfitrion = anfitrion;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println("Cantidad de episodios: " + cantidadEpisodios);
        System.out.println("Temática: " + tematica);
        System.out.println();
    }
}
