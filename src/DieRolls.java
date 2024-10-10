import java.util.Random;

public class DieRolls
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int die1 , die2, die3 = 0;
        int dieRoll = 0;
        int sum = 0;

        System.out.println("Roll %\tDie1\tDie2\tDie3\tSum");
        do {

            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll++;
            sum = die1 + die2 + die3;
            System.out.printf("%6d\t%4d\t%4d\t%4d\t%4d\n", dieRoll, die1, die2, die3, sum);
        }while(!(die1==die2 && die2 == die3));
    }
}

