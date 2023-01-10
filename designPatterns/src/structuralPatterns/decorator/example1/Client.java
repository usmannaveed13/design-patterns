package structuralPatterns.decorator.example1;

public class Client {
    public static void main(String[] args)
    {
       System.out.println("***Decorator patter Demo***");
       ConcreteComponent cc = new ConcreteComponent();

       ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();

       // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1

        cd_1.SetTheComponent(cc);
        cd_1.doJob();

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1 & ConcreteDecoratorEx_2
        cd_2.SetTheComponent(cd_1); //Adding results from cd_1 now
        cd_2.doJob();


    }
}
