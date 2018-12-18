import java.util.Scanner;

public class Main {
    static LinkedList linkedList =new LinkedList();
    public static void main(String [] args) throws Exception{
        //call the append function with user inputs
        System.out.println("\nplease enter the number(s) you wanna store in a linked list");
        Scanner scanner=new Scanner(System.in);
        scanner.useDelimiter("\\p{javaWhitespace}"); //use s single white space, so it will take the second enter as token
        while (scanner.hasNextInt()){
            linkedList.append(scanner.nextInt());
        }

        //call the prepend function with user input
        System.out.println("please enter the number(s) you wanna add to the beginning of the list");
        Scanner scannerPrepend=new Scanner(System.in);
        scannerPrepend.useDelimiter("\\p{javaWhitespace}");
        while (scannerPrepend.hasNextInt()){
            linkedList.prepend(scannerPrepend.nextInt());
        }

        //call the deleteWithValue function with user input
        System.out.println("please enter the number you wanna delete from the list");
        Scanner scannerDelete=new Scanner(System.in);
        linkedList.deleteWithValue(scannerDelete.nextInt());

        //print the result
        System.out.println("\n\nYour linked list elements are:");
        print();
    }

    //print function
    public static void print(){
        if (linkedList.head!=null){
            Node current;
            current=linkedList.head;
            while (current.next!=null){
                System.out.println(current.data);
                current=current.next;
            }
            System.out.println(current.data);
        }
    }
}
