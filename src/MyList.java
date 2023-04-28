import java.util.ArrayList;
import java.util.Iterator;

public class MyList<T extends Comparable>
{
    ArrayList<T> myArr;
    int maxCapacity;
    int index;

    int getMaxCapacity()
    {
        return maxCapacity;
    }
    int getIndex(){
        return index;
    }
    void setIndex(int index)
    {
        this.index = index;
    }
    T getElement(int index)
    {
        return myArr.get(index);
    }
    MyList()
    {
        this.myArr = new ArrayList<>(5);
        this.index = 0;
        this.maxCapacity = 5;
    }

    void push(T element) throws Exception
    {
        try
        {
            if(this.getIndex() == this.getMaxCapacity())
            {
                throw new Exception("Предел вместивости");
            }
            else
            {
                this.myArr.add(element);
                this.setIndex(getIndex()+1);
            }
        }
        catch (Exception ex)
        {
            this.setIndex(getIndex()-1);
            System.out.println(ex.getMessage());
        }
    }
    void del() throws Exception
    {
        try
        {
            if (this.getIndex() < 0)
            {
                throw new Exception("Массив пуст");
            }
            else
            {
                this.myArr.remove(getIndex());
                this.setIndex(getIndex()-1);
            }
        }
        catch (Exception ex)
        {
            this.setIndex(getIndex()+1);
            System.out.println(ex.getMessage());
        }
    }
    int find(T element) throws Exception
    {
        int count = 0;
        int foundIndex = 0;
        try
        {
            for (int i = 0; i < getMaxCapacity(); i++)
            {
                if (element.compareTo(getElement(i)) == 0)
                {
                    count++;
                    if (count >= 2)
                    {
                        throw new Exception("Подходящих элементов больше одного");
                    }
                    else
                    {
                        foundIndex = i;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            foundIndex = 0;

        }
        return foundIndex;
    }
}