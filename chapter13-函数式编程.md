# chapter13-函数式编程（JDK 8）

***面向对象编程抽象数据，函数式编程抽象行为。***

***纯函数式语言***所有的数据数据必须是不可变的。

## 13.1 旧方式与新方式

[Strategize.java](src/chapter13/functional/Strategize.java)

## 13.2 lambda表达式

lambda表达式是函数，而不是类。

### 递归

递归的lambda表达式必须赋值给一个静态变量或一个实例变量，否则会出现编译错误。

[RecursiveFactorial.java](src/chapter13/functional/RecursiveFactorial.java)

## 13.3 方法引用

类名/对象名::方法名

### 13.3.1 Runnable

[RunnableMethodReference.java](src/chapter13/functional/RunnableMethodReference.java)

### 13.3.2 未绑定方法引用

未绑定方法引用：尚未关联到某个对象的普通（非静态方法）。

### 13.3.3 构造器方法引用

### 13.4 函数式接口

函数式接口：只包含一个抽象方法的接口。  
单一抽象方法类型：使用@FunctionalInterface注解的接口。

### 13.4.1 带有更多参数的函数式接口

## 13.5 高阶函数

***高阶函数是一个能接受函数作为参数，或能吧把函数当作返回值的函数。***

## 13.6 闭包

lambda表达式使用了其函数作用域之外的变量。调用这个函数时它引用的外部变量会变成什么？
语言能解决这个问题就是支持闭包的。称为词法作用域。

***变量捕获***
被捕获的变量是实际上的最终变量。



实际上的最终变量：一个局部变量的初始值从不改变。

final关键字修饰对象引用，只能说明这个对象引用不能被重新赋值，并不是说不能修改对象本身。
（常量指针和指针常量）


### 内部类作为闭包

[AnonymousClosure.java](src/chapter13/functional/AnonymousClosure.java)

## 13.7 函数组合

将多个函数结合使用创建新的函数。

## 13.8 柯里化和部分求值

柯里化：将一个接收多个参数的函数转换为一系列只接受一个参数的函数。
柯里化的目的是通过提供一个参数来创建一个新函数。

[CurryingAndPartials.java](src/chapter13/functional/CurryingAndPartials.java)


## 13.9 纯函数式编程

Scala和Kotlin


