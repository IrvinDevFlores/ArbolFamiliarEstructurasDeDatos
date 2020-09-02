package Arboles;

import javax.swing.*;

public class Arbol
{
    NodoGeneral Raiz, Buscar;

    public Arbol()
    {
        Raiz = null;
    }

    public static void main(String... args)
    {
        ArbolG a=new ArbolG();
        a.insertar(null,  "Jose");
        a.insertar(a.raiz,  "Dorian");
        a.insertar(a.raiz, "Lauren");
        a.insertar(a.raiz, "Josh");
        a.insertar(a.raiz, "Nathan");

        JOptionPane.showMessageDialog(null,a.hijosD(a.raiz));
        a.insertar(a.traer("Dorian"), "Maria");//Primogenito
        a.insertar(a.traer("Dorian"), "Mario");

        a.insertar( a.traer( "Lauren" ),"Victor" );//Primogenito
        a.insertar( a.traer( "Lauren" ).hi,"Luras" );

        a.insertar( a.traer( "Josh" ),"Luis" );
        a.insertar( a.traer( "Josh" ),"Marcos" );
        a.insertar( a.traer( "Marcos" ),"Pedro" );//Primogenito
        a.insertar( a.traer( "Marcos" ).hi,"Astrid" );
        a.insertar( a.traer( "Marcos" ),"Alex" );


        a.insertar( a.traer( "Nathan" ),"Juan" );
        a.insertar( a.traer( "Nathan" ).hi,"Juan" );

      /*  String persona = "Juan";
        NodoG nodo =  a.padreD( a.traer(persona) );
        JOptionPane.showMessageDialog( null,"El papa de " +  persona + " es: "
                + nodo.info.toString() );*/



        a.inorden(a.raiz);
    }

    public void Traer()
    {

    }

    public void Ingresar(NodoGeneral padre, Object information)
    {
            if(padre == null)
            {
                Raiz = new NodoGeneral(information);
            }
            else if(padre.Hijo == null)
            {
                padre.Hijo = new NodoGeneral(information);
            }
            else{
                NodoGeneral temp = padre.Hijo;
                while (temp.Hernamo != null)
                {
                    temp = temp.Hernamo;
                }
                temp.Hernamo = new NodoGeneral(information);
            }
    }

    public NodoGeneral TraerNodo(Object information)
    {
        Buscar = null;
        Recorrido(Raiz, information);
        return Buscar;
    }

    public void Recorrido(NodoGeneral padre, Object information)
    {
        if(Buscar !=null)return;

        if(padre.Info.equals(information))
        {
            Buscar = padre;
            return;
        }
        NodoGeneral temp = padre.Hijo;
        while (temp != null)
        {
            Recorrido(temp,information);
            temp = temp.Hernamo;
        }
    }


}
