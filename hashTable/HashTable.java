package hashTable;

public class HashTable{

    //atributos
    Entry[] arrayHash;
    int size;

    //constructores

    public HashTable(int size){
        setSize(size);
        arrayHash = new Entry[size];
        for (int i = 0 ; i<size;i++){
            arrayHash[i] = new Entry();
        }
    }

    //methods

    public int Gethash(int ncontrol){
        return ncontrol%size;
    }

    public void put(int ncontrol, String Name, int promedio){
        int HashIndex = Gethash(ncontrol);
        Entry ArrayValue = arrayHash[HashIndex];
        Entry newItem = new Entry(ncontrol,Name,promedio);
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }

    public void get(int ncontrol){
        String nombre = null;
        int promedio = 0;
        int HashIndex = Gethash(ncontrol);
        Entry ArrayValue = arrayHash[HashIndex];
        while(ArrayValue != null){
            if(ArrayValue.getNcontrol()==ncontrol){
                nombre =  ArrayValue.getNombreE();
                promedio =  ArrayValue.getPromedio();
                break;
            }
            ArrayValue = ArrayValue.next;
        }
        System.out.println("Numero de control: "+ncontrol+" Nombre: "+nombre+" promedio: "+promedio+" hash: "+Gethash(ncontrol));
    }

    public void delete(int ncontrol){

        int HashIndex = Gethash(ncontrol);
        Entry ArrayValue = arrayHash[HashIndex];
        while(ArrayValue != null){
            if(ArrayValue.getNcontrol()==ncontrol){
                ArrayValue.setNombreE(null);
                ArrayValue.setPromedio( 0 );
                break;
            }
            ArrayValue = ArrayValue.next;
        }
        System.out.println("Eliminado correctamente");
    }


    //getters setters


    public Entry[] getArrayHash() {
        return arrayHash;
    }

    public void setArrayHash(Entry[] arrayHash) {
        this.arrayHash = arrayHash;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
