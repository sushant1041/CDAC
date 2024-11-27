package Doubly_Linked_List;


public class Doubly_Linked_List {
    Node root;
    public void create_List()
    {
        root=null;
    }
    public void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)
            root=n;//first
        else
        {
            n.right=root;//1
            root.left=n;
            root=n; //2
        }
        System.out.println(data+" inserted");

    }
    public int delete_left()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            root=root.right;//2
            root.left=null;
            System.out.println(t.data+" deleted");//3
        }

        return 0;
    }
    public void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)
            root=n;//first
        else
        {
            Node t=root;//1
            while(t.right!=null)//2
                t=t.right;
            t.right=n;//3
            n.left=t;//4
        }
        System.out.println(data+" inserted");
    }
    public void delete_right()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1

            while(t.right!=null)//2
            {
                t=t.right;
            }
            if(root==t)
                root=null;//3 single node
            else{
                Node t2=t.left;
                t2.right=null;//3
                 }
            System.out.println(t.data+" deleted");//3
        }
    }
    public void print_list()
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            while(t.right!=null)//2
            {

                t=t.right;
            }
            while(t!=null)
            {
                System.out.println(" "+t.data);
                t=t.left;
            }
        }
    }


}
