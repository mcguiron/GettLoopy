public class NestedLoops
{
    public static void main(String[] args)
    {

        for(int row=0; row <= 4; row++)
        {
            for (int col = 4;col >= row; col--)
            {
                System.out.printf("*");
            }

            System.out.println();
        }
    }
}
