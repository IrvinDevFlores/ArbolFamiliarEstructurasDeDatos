public class ArbolFam
{
    NodoFam Patriarca, Buscar;
    public ArbolFam()
    {
        Patriarca = null;
    }


    NodoFam Buscar(int identidad)
    {
        Buscar = null;
        Recorrido(Patriarca,identidad);
        return Buscar;
    }

    public void Recorrido(NodoFam fam,Object datoBuscado)
    {
        if(Buscar != null ) return;

        if(datoBuscado.equals( fam.Familia.Identidad ))
        {
            Buscar = fam;
            return;
        }

        NodoFam tmp = fam.Hijo;
        while(tmp != null)
        {
            Recorrido(tmp,datoBuscado);
            tmp = tmp.Hermano;
        }
    }

    void Ingresar(NodoFam Padre, Object h)
    {
        if(Padre==null) Patriarca = new NodoFam((Fam) h);
        else if(Padre.Hijo ==null)
            Padre.Hijo = new NodoFam((Fam) h);
        else
        {
            NodoFam tmp = Padre.Hijo;
            while (tmp.Hermano != null)
            {
                tmp = tmp.Hermano;
            }
            tmp.Hermano = new NodoFam((Fam) h);
        }
    }


    public String HermanoDe(NodoFam padre)
    {
        return null;
    }

    public String HijosDe(NodoFam padre)
    {
        String cadena= "Hijos: \n";

        if(padre.Hijo != null)
        {
            NodoFam tmp = padre.Hijo;
            while(tmp != null)
            {
                cadena += tmp.Familia.Nombre;
                tmp = tmp.Hermano;
            }
        }
        return cadena;
    }


}

