package hashTable;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int salir =0;
        Scanner scanner = new Scanner(System.in);




        System.out.println("Tabla hash by Emmanuel");

        while(salir!=1){
            System.out.print("1 -> Crear hashTable  |  2  ->  salir   |  :");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    char out ='a';

                    System.out.print("HashTable size: ");
                    int size = scanner.nextInt();
                    HashTable ht = new HashTable(size);
                    System.out.println("listo!");

                    while (out != 'q'){


                        System.out.println("Seleccione una opcion: ");
                        System.out.println("1 -> Agragar | 2 -> Buscar | 3 -> Borrar | 4 -> Salir | :");
                        int opcion = scanner.nextInt();

                        if (opcion == 1){
                            System.out.print("Numero de control: ");
                            int ncontrol = scanner.nextInt();

                            System.out.print("Nombre: ");
                            scanner.nextLine();
                            String name = scanner.nextLine();

                            System.out.print("Promedio: ");
                            int promedio = scanner.nextInt();

                            ht.put(ncontrol,name,promedio);
                            System.out.println("Added!");


                        }

                        if (opcion == 2){
                            System.out.print("Numero de control: ");
                            int buscar = scanner.nextInt();

                            ht.get(buscar);

                        }

                        if(opcion == 3){
                            System.out.print("Numero de control: ");
                            int borrar = scanner.nextInt();

                            ht.delete(borrar);
                            System.out.print("Eliminado ! ");

                        }
                        if (opcion == 4){
                            out = 'q';
                        }

                    }

                case 2:
                    System.out.println("bye");
                    salir=1;
                    break;
                default:
                    System.out.println("opcion no encontrada");
            }
        }

    }
}
