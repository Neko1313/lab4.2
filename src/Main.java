import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception
    {
        MyList<String> someCoolManga = new MyList<>();
        someCoolManga.push("Fullmetal Alchemist");
        someCoolManga.push("Volleyball");
        someCoolManga.push("Initial D");
        someCoolManga.push("Drifters");
        someCoolManga.push("Drifters");
        someCoolManga.push("Half-Human");
        for(int i = 0;i < 5; i++)
        {
            System.out.println(someCoolManga.getElement(i));
        }
        someCoolManga.find("Drifters");
        System.out.println("Индекс искомого "+ someCoolManga.find("Volleyball"));
        for(int i = 0; i < 6; i++)
        {
            someCoolManga.del();
        }
    }
}