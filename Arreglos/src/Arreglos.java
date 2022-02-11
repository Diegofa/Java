public class Arreglos {
    public static void main(String[] args) {
        int Arr []= new int[4];
        Arr [0]= 20; Arr [1] =21; Arr [2]= 22; Arr [3]= 23;

        for(int i=0; i< Arr.length; i++){
            System.out.println(Arr[i]);
        }
        System.out.println(Arr.length);

        String [] postresColombianos = {"Quesadillo","Platano asado", "Cocada"};
        System.out.println("Postre colombiano :" + postresColombianos[2]);



    }
}
