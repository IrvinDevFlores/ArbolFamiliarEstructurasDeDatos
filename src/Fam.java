public class Fam
{
    public int Identidad;
    public String Nombre;

    public Fam(String nombre, int identidad)
    {
        Identidad = identidad;
        Nombre = nombre;
    }

    public String Retornar_Familia()
    {
        return Nombre;
    }
}
