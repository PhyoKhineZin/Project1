public class MyFirstProgram
{
    public static void main(String[] args)
    {
        System.out.println("Start My First Program");
        System.out.println("Length of Args : "+args.length);
        for (String arg : args)
        {
            System.out.println(arg);
        }

        Dog dog1= new Dog();
        dog1.name = "Lucky";
        dog1.greet();

        Dog dog2 = new Dog();
        dog2.name = "Pooh Lay";
        dog2.greet();

    }
}
class Dog
{
    String name;
    void greet()
    {
        System.out.println("Hi! I am "+name);
    }
}