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
    void delete_left() {
        if (root == null) {
            System.out.println("Empty list");
        } else {
            Node temp = root;
            if (root == last)
            {
                root = last = null;
            } else {
                root = root.right;
                root.left = last;
                last.right = root;
            }
            System.out.println("Data deleted: " + temp.data);
        }
    }
    void print_list() {
        Node t = root;
        if (root == null)
        {
            System.out.println("Empty List");
        } else
        {
            do {
                System.out.print("| " + t.data + " | ");
                t = t.right;
            } while (t != root);
            System.out.println();
        }
    }
    void insert_right(int data){
         Node n=new Node(data);
        if(root==null)
        {
            root=last=n;
            last.right=root;
            root.left=last;
        }else{
            last.right=n;
            n.left=last;
            n.right=root;
            last=n;
            System.out.println("Inserted at right side :"+n.data);
        }
    }
   void delete_right(){
        Node temp=last;
        if(root==null){
            System.out.println("Empty List");
        }else{
            Node t=last.left;
            t.right=root;
            root.left=t;
            last=t;
            System.out.println(" deleted from right side :"+temp.data);
        }
   }
}
