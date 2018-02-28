import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ch_11_03
{
    /*Write a method called removeEvenInRange that accepts three parameters: a LinkedList, a starting index, and an
    ending index. The method’s behavior is to remove all occurrences of the even numbers that appear in the list
    between the starting index (inclusive) and the ending index (exclusive).
    Other values and occurrences of the even
    numbers that appear outside the given index range are not affected.
    For example, for the list [1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16], a call of
    removeEvenInRange(list, 5, 13) should produce the list [1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16].
    Notice that the even numbers located at indexes between 5 inclusive and 13 exclusive in the original list
    (before any modifications were made) have been removed.*/

    public static void main(String[] args)
    {
        List<Integer> remove = new LinkedList<>();
        remove.add(1);
        remove.add(1);
        remove.add(2);
        remove.add(0);
        remove.add(4);
        remove.add(5);
        remove.add(6);
        remove.add(8);
        remove.add(8);
        remove.add(3);
        remove.add(11);
        remove.add(9);
        remove.add(12);
        remove.add(0);
        remove.add(14);
        remove.add(0);
        remove.add(16);

        //metode kald
        removeEvenInRange(5,13,remove);
        System.out.println(remove);
    }

    public static void removeEvenInRange(int start, int end, List<Integer> remove)
    {   //Iterator kører listen igennem og ændre på den når fori er færdig
        Iterator<Integer> inRange = remove.iterator();
        //fori loop kører hele listen igennem
        for (int i = 0; i < end + 1; i++)
        {
            // De 2 if tjekker at det er inde for index og fjerne alle lige
            if (i >= start && i < end)
            {
                if (inRange.next() % 2 == 0)
                {
                    inRange.remove();
                }
            }
            // else gør så vi kan iterere vidrer
            else
            {
                inRange.next();
            }
        }
    }
}
