package hashTable;

public class Entry {

    //atributos

    private int ncontrol ; //key
    private int promedio ; //value
    private String nombreE ; //value
    public Entry next;

    //Constructores

    public Entry(int ncontrol, String Nombre, int promedio){
        setNcontrol(ncontrol);
        setNombreE(Nombre);
        setPromedio(promedio);
        next = null;
    }
    public Entry(){     next = null;        }

    //setters getteres


    public int getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(int ncontrol) {
        this.ncontrol = ncontrol;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}
