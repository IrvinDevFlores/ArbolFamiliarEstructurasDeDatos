import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        ArbolFam arbolFamiliar = new ArbolFam();
        arbolFamiliar.Ingresar(null,  "Jose");
        arbolFamiliar.Ingresar(arbolFamiliar.Patriarca,  "Dorian");
        arbolFamiliar.Ingresar(arbolFamiliar.Patriarca, "Lauren");
        arbolFamiliar.Ingresar(arbolFamiliar.Patriarca, "Josh");
        arbolFamiliar.Ingresar(arbolFamiliar.Patriarca, "Nathan");

        JOptionPane.showMessageDialog(null,arbolFamiliar.HijosDe(arbolFamiliar.Patriarca));
        arbolFamiliar.Ingresar(arbolFamiliar.("Dorian"), "Maria");//Primogenito
        arbolFamiliar.Ingresar(arbolFamiliar.traer("Dorian"), "Mario");

        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Lauren" ),"Victor" );//Primogenito
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Lauren" ).hi,"Luras" );

        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Josh" ),"Luis" );
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Josh" ),"Marcos" );
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Marcos" ),"Pedro" );//Primogenito
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Marcos" ).hi,"Astrid" );
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Marcos" ),"Alex" );


        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Nathan" ),"Juan" );
        arbolFamiliar.Ingresar( arbolFamiliar.traer( "Nathan" ).hi,"Juan" );

        String mensaje = "1. Retornar Patriarca \n 2. Retornar hijos \n 3. Retornar hermanos \n 4. Retornar primos \n 5 Salir";
        JOptionPane.showInputDialog( null, mensaje );
        int opcion = Integer.parseInt( mensaje );

        switch (opcion)
        {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

        }
    }
}
