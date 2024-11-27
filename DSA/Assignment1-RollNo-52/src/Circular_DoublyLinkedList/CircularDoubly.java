package Circular_DoublyLinkedList;

public class CircularDoubly {
    Node last,root;

    void create_list(){
        last=root=null;
    }
    void insert_left(int data){
        Node n=new Node(data);
        if(root==null)
        {
            root=last=n;
            last.right=root;
            root.left=last;
        }
        else{
            n.right=root;
            n.left=last;
            root=n;
            System.out.println("Inserted data from left side is :"+n.data);
        }
    }
    void delete_left(){
        Node temp=root;
        if(root==null){
            System.out.println("Empty List");
        }else{
            root=root.right;
            root.left=last;
            System.out.println("deleted data from left side is:"+temp.data);
        }
    }
}
