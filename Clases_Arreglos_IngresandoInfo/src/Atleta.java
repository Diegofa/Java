public class Atleta {

    String nombre;
    String nacionalidad;
    int time;

    public Atleta(String nombre, String nacionalidad, int time) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.time = time;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
