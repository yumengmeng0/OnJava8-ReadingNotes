# chapter08-复用
组合：在新类中创建现有类的对象。  
继承：直接复制了现有类的形式，然后向其中添加代码，而没有修改现有类。  
委托：介于组合和继承之间。将成员对象放在正在构造的类中（类似组合），但同时又在新类中公开了成员对象的所有方法（类似继承）。

## 8.1 组合语法
初始化引用的4种方式：
1. 在定义对象时
2. 在该类构造器中
3. 在对象实际使用之前（延迟初始化）
4. 使用实例初始化

## 8.2 继承语法

### 初始化基类
### 带参数的构造器

## 8.3 委托
[SpaceShipDelegation.java](src/chapter08/SpaceShipDelegation.java)
```
Idea自动生成委托对象的方法： 选中代理对象 -> alt + insert（Generate...） -> Delegation method...
```

## 8.4 组合和继承相结合

### 8.4.1 确保正确的清理
### 8.4.2 名称隐藏
@Override 防止以外重载

## 8.5 选择组合还是继承
继承用来表示“is-a”的关系，组合用来表示“has-a”的关系。

## 8.6 protected关键字
protected关键字表示：对类的用户来说，它是private的，但对继承该类的任何类或同一包中的其他类来说，它是可用的。
protected还提供包访问权限。

## 8.7 向上转型/向下转型

## 8.8 final关键字

### 8.8.1 final数据
[FinalData.java](src/chapter08/FinalData.java)

static和final同时修饰的字段只会分配一个***不能改变的存储空间***。

final 基本数据类型：值恒定不变  
final 引用数据类型：引用恒定不变，但对象本身可以修改（类比C语言中的指针常量，地址不变，内容可变）

Java没有提供对象恒定不变的方法，可以编写类，使对象具有对象恒定不变的效果。

#### 1.空白final（定义变量时未初始化）
#### 2.final参数
主要用于将数据传递给匿名内部类。
[FinalArguments.java](src/chapter08/FinalArguments.java)
### 8.8.2 final方法
使用final方法的原因：
1. 防止继承类通过重写方法来改变方法的含义。
2. 效率。早期Java实现，编译器将任何final方法的调用转换为*内联调用*。

#### final和private
类中任何private方法都是隐式的final。
### 8.8.3 final类
final类禁止继承， 它所有方法都是隐式final的。

## 8.9 初始化及类的加载
