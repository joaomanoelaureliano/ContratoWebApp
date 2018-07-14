package abstratas;

abstract public class Livros {
//atributos
    private String autor;
    private int paginas;
    private String titulo;
//métodos    
    //construtores
    public Livros(){
        this.setTitulo("padrão");
        this.setPaginas(999999);
        this.setAutor("padrão");
    }
    public Livros(int paginas, String autor, String titulo){
        this.setTitulo(titulo);
        this.setPaginas(paginas);
        this.setAutor(autor);
    }    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor.trim().isEmpty()?"PADRÃO":autor.toUpperCase();
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       this.titulo = titulo.trim().isEmpty()?"PADRÃO":titulo.toUpperCase();
    }

    @Override
    public String toString() {
        return "Livros{" + "autor=" + autor + ", paginas=" + paginas + ", titulo=" + titulo + '}';
    }

}

