package Arboles;

public class NodoG
{
    Object info;
    NodoG hi, her;
    NodoG(Object i)
    {
        info=i;
        hi=her=null;
    }
    String hijosD(NodoG n)
    {
        String cadena= "Hijos de ";

        if(n.hi!=null)
        {
            NodoG tmp = n.hi;
            while(tmp != null)
            {
                cadena += tmp.info.toString() + " ";
                tmp=tmp.her;
            }
        }
        return cadena;
    }

    public String toString()
    {
        return info.toString();
    }
}