import java.util.Scanner;


public class Zadanie2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 0, array[];

        System.out.print("Введите размерность массива: ");
        if(in.hasNextInt()){
            array_size = in.nextInt();
        }else{
            System.out.println("Ошибка, введенная размерность массива должна быть целым числом. Повторите попытку!");
            System.exit(0);
        }
        if (array_size <=0){
            System.out.println("Ошибка, размерность массива должна быть больше 0. Повторите попытку!");
            System.exit(0);
        }
            array = new int[array_size];
        


        for(int i=0; i < array_size; i++){
            if(in.hasNextInt()){
                array[i] = in.nextInt();
            }else{
                System.out.println("Ошибка, массив должен состоять из целых чисел. Повторите попытку!");
                System.exit(0);
            }}
            System.out.println("Введите целое число, которое нужно удалить из массива: ");
            if(in.hasNextInt()){
                    int x = in.nextInt();
                    System.out.println("Исходный массив: ");
                    for (int elem : array){
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                    System.out.print("Масcив после обработки: ");
                    System.out.println();
                    for (int i = 0; i < array_size; i++){
                        if (array[i] == x){
                            continue;
                        }else{
                            System.out.print(array[i] + " ");
                        }
                     }}else{
                            System.out.println("Ошибка, число, которое необходимо удалить из массива должно быть целым. Повторите попытку!");
                            System.exit(0);
                        }
        in.close();
    }
}