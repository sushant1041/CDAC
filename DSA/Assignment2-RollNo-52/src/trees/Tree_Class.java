package trees;

public class Tree_Class
{
    Tnode root;
    int count=0;
    void insert(Tnode r,Tnode n)
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
        System.out.println(n.data+" inserted in tree");
        ++count;
    }
    void inorder(Tnode r)
    {
        if(r!=null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
//            ++count;
        }

    }
    void preorder(Tnode r){
        if(r!=null){
            System.out.println(" "+r.data);
            preorder(r.left);
            preorder(r.right);
        }
    }
    void postorder(Tnode r){
        if(r!=null){
            preorder(r.left);
            preorder(r.right);
            System.out.println(" "+r.data);
        }
    }
    boolean search(int key,Tnode r)
    {
      if(r!=null)
      {
        if (key == r.data)
        {
            return true;
        }
        else
        {
            if (key < r.data)
            {
                return search(key, r.left);
            }else{
                return search(key, r.right);
            }
        }
      }
      else{
          return false;
      }
    }
    void count()
    {
        System.out.println(""+count);
    }
    int count_leaf_node(Tnode r){
        if(r==null)
        {
            return 0;
        }else{
           if(r.left==null && r.right==null)
           {
               int l_count=count_leaf_node(r.left);
               int r_count=count_leaf_node(r.right);
               return l_count+r_count;
           }
           else{
               return 0;
           }
        }
    }

}
