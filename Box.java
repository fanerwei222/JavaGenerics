package main.generics;

/**
 * 泛型实体
 * @author fanwei
 *
 */
public class Box<P>
{
    private P data;

    public Box()
    {

    }

    public Box(P data)
    {
        this.data = data;
    }

    public P getData()
    {
        return data;
    }

    public void setData(P data)
    {
        this.data = data;
    }

}
