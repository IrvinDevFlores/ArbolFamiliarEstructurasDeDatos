package Arboles;

public class NodoGeneral {

    Object Info;
    NodoGeneral Hernamo;
    NodoGeneral Hijo;
    public NodoGeneral(Object information)
    {
        Info = information;
        Hernamo = Hijo = null;
    }

    public String ToString()
    {
        return Info.toString();
    }
}
