package Arboles;
import javax.swing.*;
public class ArbolG
{
    NodoG raiz, buscar;

    ArbolG()
    {
        raiz = null;
    }

    void insertar(NodoG p,Object h)
    {
        if(p==null) raiz = new NodoG(h);
        else if(p.hi==null) p.hi = new NodoG(h);
        else
        {
            NodoG tmp = p.hi;
            while (tmp.her != null)
            {
                tmp = tmp.her;
            }
            tmp.her = new NodoG(h);
        }
    }

    NodoG traer(Object n)
    {
        buscar = null;
        recorrido(raiz,n);
        return buscar;
    }

    public void recorrido(NodoG p,Object datoBuscado)
    {
        if(buscar != null ) return;

        if(p.info.equals(datoBuscado))
        {
            buscar = p; return;
        }

        NodoG tmp = p.hi;
        while(tmp!=null)
        {
            recorrido(tmp,datoBuscado);
            tmp = tmp.her;
        }
    }


    NodoG padreD(NodoG n)
    {
        String cadena= "Padre\n";
        NodoG papa = null;

        NodoG hijoDeRaiz = raiz.hi;
        if(raiz != null)
        {
            while(hijoDeRaiz!=null)
            {
                NodoG hijoTemp = hijoDeRaiz.hi;
                if(buscar != null ) return null;

                if(n.info.equals(hijoTemp.info))
                {
                    buscar = n;
                    return  null;
                }

                 papa  = padreD( hijoTemp );
               /* while ( hijoTemp != null)
                {
                    if(hijoTemp.info.equals( n.info ))
                    {
                        papa = hijoDeRaiz;
                    }
                    hijoTemp = hijoTemp.her;
                }*/
                hijoDeRaiz = hijoDeRaiz.her;
            }
        }
        return papa;
    }

    String hijosD(NodoG n)
    {
        String cadena= "Hijos: \n";

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
    String hermanosD(NodoG n)
    {
        String cadena= "Hermanos\n";

        if(raiz.hi != null)
        {
            NodoG temp = raiz.hi;
            while (temp != null)
            {
                boolean miMismo = n.info.equals( temp.info );
                boolean distintoDeMiMismo = miMismo != false;
                if(distintoDeMiMismo )
                {
                    cadena += temp.info.toString()+" ";
                }
                temp = temp.her;
            }
        }

        return cadena;
    }


    NodoG primoD(NodoG nodo)
    {
        String cadena = "";
        if(raiz != null)
        {
            NodoG temp = raiz;
            while (temp != null)
            {

            }
        }
        return null;
    }


    //Impresion de Arbol

    void inorden(NodoG n)
    {
        for(NodoG p = n.hi; p != null; p = p.her)
            inorden(p);
        System.out.println(n.info.toString());
    }

    //void posOrden(NodoG n){}

    void preorden(NodoG n)
    {
        System.out.println(n.info.toString());
        for(NodoG p=n.hi;p!=null;p=p.her)preorden(p);
    }
}
