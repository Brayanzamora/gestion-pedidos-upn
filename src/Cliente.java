public class Cliente {
    private String id;
    private String nombre;
    private String documento; // DNI o RUC

    public Cliente(String id, String nombre, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }

    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nombre=" + nombre + ", Doc=" + documento + "]";
    }
}