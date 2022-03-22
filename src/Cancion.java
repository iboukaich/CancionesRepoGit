
/**
 * clase para construir canciones y sus metodos
 * 
 * @author imanbt
 * @version 2022
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * constructor por defecto sin titulo, duracion y no esta sonando
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}

	/**
	 * constructor para crear una cancion con un titulo y una duracion
	 * 
	 * @param titulo
	 * @param duracion
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}

	/**
	 * constructor para crear una cancion con un titulo, un grupo, una duracion y
	 * para señalar si esta sonando o no
	 * 
	 * @param titulo
	 * @param grupo
	 * @param duracion
	 * @param sonando
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}

	/**
	 * metodo para reproducir una cancion
	 * 
	 * @return el valor de sonando en true
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	/**
	 * metodo para parar de reproducir una cancion
	 * 
	 * @return el valor de sonando en false
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	/**
	 * metodo para mostrar la mayor duracion de las canciones
	 * 
	 * @param canciones
	 * @return el titulo de la cancion con mayor duracion
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}

	/**
	 * metodo para mostrar cual es la siguiente cancion
	 * 
	 * @param canciones
	 * @param titulo
	 * @return titulo de la siguiente cancion
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Datos de la canción [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando="
				+ sonando + "]";
	}

}