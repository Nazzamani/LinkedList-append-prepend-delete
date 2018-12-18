public class LinkedList {
    Node head;

    public void append(int data){
        //if the list is empty (head== null), the first element we receive would be our head
        if(head==null){
            head=new Node(data);
            return;
        }
        Node current;
        current=head;
        //walk through the list until we get to the end of it (current.next!=null).
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(data); //adding the new element to the end of the list
    }

    //prePend function add the new element to the beginning of the list. If we don't know whether our list is or not, we should add another condition to check it. Here we assume that we don't call the prePend function when the list is empty.
    public void prepend(int data){
        Node newHead= new Node(data);
        newHead.next=head;
        head=newHead;
    }

    public void deleteWithValue(int data){
        //if the list is empty, there is nothing we can do.
        if(head==null){
            return;
        }
        //first we check to see whether the data we wanna delete is the head of the list.
        if(head.data==data){
            head=head.next;
            return;
        }
        //if the data we wanna delete is not the head, then we walk through the list to find it
        Node current=head;
        while(current.next!=null){
            if(current.next.data==data){
                current.next=current.next.next;
                return;
            }
            current=current.next;//moving forward in the list
        }
    }

}
