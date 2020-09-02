public class NodoFam
{
    Fam Familia;
    NodoFam Hermano;
    NodoFam Hijo;

    public NodoFam(Fam familia)
    {
        Familia = familia;
        Hijo = Hermano = null;
    }

    public String Retorna_Info()
    {
        return  "Nombre: " + Familia.Nombre + "Identidad: " + Familia.Identidad;
    }

}
