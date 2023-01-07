import java.util.Scanner;

public class App {
    private List list;
    private int info = 11;
    private int initialInfo=0;
    private String menu;
    private Scanner sc;


    public static void main(String[] args) throws Exception {
        App list1 = new App();
        list1.displayMenu();
    }


    public App(){

        this.list= new List();
        this.sc = new Scanner(System.in);
        this.menu = 
        "Listas enlazadas simples \n" +
        "1. Crear lista \n " +
        "2. Imprimir lista \n " +
        "3. Agregar nodos al inicio \n " +
        "4. Agregar nodos al final \n " +
        "5. Buscar nodo \n " +
        "6. Borrar nodo inicial \n " +
        "7. Borrar nodo final \n " +
        "8. Salir\n ";
    }

    public void displayMenu() {
        int number=0;
        do {
            System.out.println(menu);
            number=sc.nextInt();

            switch (number) {
                case 1:
                this.createList();
                break;
                case 2:
                System.out.println(this.list.print());
                break;
                case 3:
                this.unshiftNode();
                break;
                case 4:
                this.pushNode();
                break;
                case 5:
                this.searchNode();
                break;
                case 6:
                this.shiftNode();
                break;
                case 7:
                this.popNode();
                break;
                case 8:
                System.out.println("Adiós");
                break;
                default:
                System.out.println("Opción Incorrecta");
                break;
            }
            
        } while (number !=8);

    }


    public void createList() {
        this.list = new List();
        for(int info=1; info<=10; info++){
            this.list.push(info);
        }
            
        System.out.println(this.list.print());
    }

    public void unshiftNode(){
        this.list.unshift(initialInfo);
        --initialInfo;
        System.out.println(this.list.print());

    }

    public void shiftNode(){
        if(this.list.shift()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.list.print());
    }

    public void popNode(){
        if(this.list.pop()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.list.print());
    }

    public void pushNode(){
        info++;
        this.list.push(info);
        System.out.println(this.list.print());

    }

    public void searchNode(){
        int n=0;
        System.out.println("Digita el número a buscar");
        n=sc.nextInt();
        if(this.list.search(n)){
            System.out.println("Valor Encontrado");
        } else {
            System.out.println("Valor no Encontrado");
        }
    }


}
