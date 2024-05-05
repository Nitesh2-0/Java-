class Test {
    public static void main(String args[])   {

        try            {

            System.out.print("Hello" + " " + 1 / 0);

        }

        catch(ArithmeticException e)    {

            System.out.print("World");

        }

    }

}