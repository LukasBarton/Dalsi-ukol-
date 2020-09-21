import java.util.Scanner;

public class prg2 {
            public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                int i =0;
                int num =0;
                String  primeNum = "";
                System.out.println("zadej cislo do ktereho chces prvocisla:");
                int n = scanner.nextInt();
                scanner.close();
                for (i = 1; i <= n; i++)
                {
                    int counter=0;
                    for(num =i; num>=1; num--)
                    {
                        if(i%num==0)
                        {
                            counter = counter + 1;
                        }
                    }
                    if (counter ==2)
                    {
                        primeNum = primeNum + i + " ";
                    }
                }
                System.out.println("prvocisla jsou:");
                System.out.println(primeNum);
            }
        }
