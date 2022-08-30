# chapter11-内部类
定义在另一个类中的类称为*内部类*。




```java
public class TestParcel4 {
    public static void main(String[] args) {
    }

    class BClass { // 内部类

    }
}

class AClass { // 外部其他类

}
```
    被编译为3个class文件：
    AClass.class    具有包访问权限
    TestParcel4$BClass.class 内部类需要依赖外部类对象
    TestParcel4.class 

## 11.1 创建内部类
[Parcel1.java](src/chapter11/innerclass/Parcel1.java)   
外部类有一个方法，返回一个指向内部类的引用。  
[Parcel2.java](src/chapter11/innerclass/Parcel2.java) 

## 11.2 到外部类的链接
内部类拥有对外围对象所有元素的访问权。  
[Sequence.java](src/chapter11/innerclass/Sequence.java) 

## 11.3 使用.this和.new
[DotThis.java](src/chapter11/innerclass/DotThis.java)  
使用外部类的创建内部类，也解决了内部类的名字的作用域的问题。
```java
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
``` 
[DotNew.java](src/chapter11/innerclass/DotNew.java) 

必须有一个外部类对象，才能创建内部类对象，因为内部类的对象会暗中连接到用于创建它的外部类对象。  
嵌套类（static修饰的内部类）不需要指向外部类对象的引用。

## 11.4 内部类和向上转型
[TestParcel.java](src/chapter11/innerclass/TestParcel.java) 

## 11.5 在方法和作用域中内部类
局部内部类：  
[Parcel6.java](src/chapter11/innerclass/Parcel6.java) 

## 11.6 匿名内部类
[Parcel7.java](src/chapter11/innerclass/Parcel7.java) 
[Parcel7b.java](src/chapter11/innerclass/Parcel7b.java) 

在定义匿名类中的字段时执行初始化。  
从匿名内部类引用的本地变量必须是最终变量或实际上的最终变量。  
匿名类没有名字，不能有命名的构造器。  
[Parcel9.java](src/chapter11/innerclass/Parcel9.java)  
 
使用“实例初始化”来执行匿名内部类的构造  
[Parcel10.java](src/chapter11/innerclass/Parcel10.java) 

## 11.7 嵌套类
如果不需要内部类对象和外部对象之间的连接，可以将内部类设置为static的，称之为*嵌套类*。  
[Parcel11.java](src/chapter11/innerclass/Parcel11.java) 

### 11.7.1 接口中的类
将测试代码放到一个嵌套类中  
[TestBed.java](src/chapter11/innerclass/TestBed.java) 

### 11.7.2 从多层嵌套的内部类中访问外部成员
被嵌入的类可以访问各层外部类的所有成员  
[MultiNestingAccess.java](src/chapter11/innerclass/MultiNestingAccess.java) 

## 11.8 为什么需要内部类
每个内部类都可以独立地继承自一个实现。因此外部类是否已经继承了某个实现，对内部类并没有限制。

内部类完善了多重继承问题的解决方案。实际上支持了”多重实现继承“。

### 11.8.1 闭包与回调
*闭包*是一个可调用的对象，它保留了来自它被创建时所在的作用域的信息。内部类是面向对象的闭包。  
使用内部类来支持回调  
[CallBacks.java](src/chapter11/innerclass/CallBacks.java) 

### 11.8.2 内部类与控制器框架
[GreenhouseController.java](src/chapter11/innerclass/controller/GreenhouseController.java) 


## 11.9 继承内部类
[InheritInner.java](src/chapter11/innerclass/InheritInner.java) 

## 11.10 内部类可以被重写吗
当继承外围类时，内部类并没有额外的特殊之处。这两个类（Yolk）是独立的实体，分别在自己的命名空间中。  
[BigEgg.java](src/chapter11/innerclass/BigEgg.java) 

## 11.11 局部内部类
局部内部类不能使用访问修饰符，因为它不是外围类的组成部分，但它可以访问当前代码块中的常量，和外围类中的所有成员。  \
[LocalInnerClass.java](src/chapter11/innerclass/LocalInnerClass.java) 

## 11.12 内部类标识符

