package biblioteca;

public class Libro {

	public Libro() {
		
	}
	
	public Libro(int id, String titulo, String autor, int num_Pag) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.num_Pag = num_Pag;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNum_Pag() {
		return num_Pag;
	}
	public void setNum_Pag(int num_Pag) {
		this.num_Pag = num_Pag;
	}
	private String titulo;
	private String autor;
	private int num_Pag;
	
}
