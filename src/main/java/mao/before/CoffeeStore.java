package mao.before;

/**
 * Project name(项目名称)：java设计模式_简单工厂模式
 * Package(包名): mao.before
 * Class(类名): CoffeeStore
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 21:12
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CoffeeStore
{
    public Coffee orderCoffee(String type)
    {
        if (type == null)
        {
            throw new RuntimeException("type不能为null");
        }
        Coffee coffee = null;
        if (type.equals("latte"))
        {
            coffee = new LatteCoffee();
        }
        else if (type.equals("american"))
        {
            coffee = new AmericanCoffee();
        }
        else
        {
            throw new RuntimeException("type没有匹配到如何一种");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
