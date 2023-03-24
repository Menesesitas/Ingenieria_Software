public class Cliente
{
    private String nombre;
    private String marcaInteres;

    public Cliente(String nombre, String marcaInteres)
    {
        this.nombre = nombre;
        this.marcaInteres = marcaInteres;
    }

    public void actualizar(String nuevoProducto)
    {
        if (nuevoProducto.equals(marcaInteres)) {
            System.out.println(nombre + ": El nuevo producto de " + marcaInteres + " está disponible en la tienda.");
        }
    }
}
