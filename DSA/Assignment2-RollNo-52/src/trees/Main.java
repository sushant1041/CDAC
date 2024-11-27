package trees;
import java.util.*;
public class Main {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                int choice;
                Tree_Class obj=new Tree_Class();
                do
                {
                    System.out.print("\nTree Menu");
                    System.out.print("\n-----------");
                    System.out.print("\n1.Insert");
                    System.out.print("\n2.Inorder");
                    System.out.print("\n3.preorder");
                    System.out.print("\n4.postorder");
                    System.out.println("\n5.count");
                    System.out.print("\n0.Exit");
                    System.out.print("\nchoice:");
                    choice=in.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.print("\nEnter element:");
                            int e=in.nextInt();
                            Tnode n=new Tnode(e);
                            obj.insert(obj.root,n);
                            break;
                        case 2:
                            if(obj.root!=null)
                            {
                                System.out.print("\nElements in tree:\n");
                                obj.inorder(obj.root);
                            }
                            else
                            {
                                System.out.print("\nTree not created...");
                            }
                            break;
                        case 3:
                            if(obj.root!=null)
                            {
                                System.out.print("\nElements in tree:\n");
                                obj.preorder(obj.root);
                            }
                            else
                            {
                                System.out.print("\nTree not created...");
                            }
                            break;
                        case 4:
                            if(obj.root!=null)
                            {
                                System.out.print("\nElements in tree:\n");
                                obj.postorder(obj.root);
                            }
                            else
                            {
                                System.out.print("\nTree not created...");
                            }
                            break;
                        case 5:
                           obj.count();
                            break;
                        case 6:
                            obj.search(12,obj.root);
                            break;
                        case 7:
                            System.out.println(" "+obj.count_leaf_node(obj.root));
                            break;
                        case 0:
                            System.out.print("\nExiting code...bye");
                            break;
                        default:
                            System.out.print("\nWrong option selected..");
                            break;
                    }
                }while(choice!=0);
            }
}

