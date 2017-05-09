package skip;

public class Node
{
    public Integer value;    //插入的数据
    public Node left;     //分别对应的四个方向的指针
    public Node down;
    public Node right;
    public Node up;
    public Node(Integer value)   //构造函数
    {
        this.value=value;
        down=up=right=left=null;
    }
}