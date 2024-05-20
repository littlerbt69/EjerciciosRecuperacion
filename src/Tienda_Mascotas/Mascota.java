package Tienda_Mascotas;

public class Mascota {

    private String nombre;
    private Especie especie;
    private int edad;
    private double precio;
    private boolean disponible;

    public Mascota(String nombre, Especie especie, int edad, double precio,boolean disponible) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
