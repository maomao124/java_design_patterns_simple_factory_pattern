package mao.after;


/**
 * Project name(项目名称)：java设计模式_简单工厂模式
 * Package(包名): mao.after
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 21:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
        coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
