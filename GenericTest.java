package main.generics;

/**
 * 测试类
 * @author fanwei
 *
 */
public class GenericTest
{
    public static void main(String[] args)
    {

        Box<String> name = new Box<String>("corn");
        Box<Number> fiveSix = new Box<Number>(56);
        Box<Integer> four = new Box<Integer>(4);
        //是否同类
        //System.out.println(fiveSix.getClass() == four.getClass());

        //case 1 Box<Integer>无法被Box<Number>识别
        //getDataWarn(fiveSix);
        //getDataWarn(four);

        //case 2 需要给Box<Number>、Box<Integer>等所有Box<具体类型实参>指定一个父类Box<?>
        getDataParent(fiveSix);
        getDataParent(four);
        getDataUpperNumberData(four);

        //case 3 Box<? extends Number>限定Number和其子类才能识别

        //case 4 Box<? super Integer>限定只有Integer和其父类才能识别
        //getDataDownIntegerData(name);

    }

    /**
     * 没有类型通配符
     * @param data
     */
    public static void getDataWarn(Box<Number> data)
    {
        System.out.println("data :" + data.getData());
    }

    /**
     * 类型通配符?
     * @param data
     */
    public static void getDataParent(Box<?> data)
    {
        System.out.println("data :" + data.getData());
    }

    /**
     * 类型通配符上限为Number，说明这里传递的参数只能是Number类及其子类
     * @param data
     */
    public static void getDataUpperNumberData(Box<? extends Number> data)
    {
        System.out.println("data :" + data.getData());
    }

    /**
     * 类型通配符下限为Number，存放的只能值自身或者其super类以上
     * @param data
     */
    public static void getDataDownIntegerData(Box<? super Integer> data)
    {
        System.out.println("data :" + data.getData());
    }
}
