import java.util.*;
public class prg2 {

        public static void main(String args[])
        {
            int n, status = 1, x = 3, count, j;

            Scanner in = new Scanner(System.in);
            System.out.println("zadej kolik chces prvocisel:");
            n = in.nextInt();

            if (n >= 1)
            {
                System.out.println("prvnich "+n+" prvocisel je:");
                System.out.println(2);
            }

            for (count = 2; count <=n; )
            {
                for (j = 2; j <= Math.sqrt(x); j++)
                {
                    if (x%j == 0)
                    {
                        status = 0;
                        break;
                    }
                }
                if (status != 0)
                {
                    System.out.println(x);
                    count++;
                }
                status = 1;
                x++;
            }
        }

}
