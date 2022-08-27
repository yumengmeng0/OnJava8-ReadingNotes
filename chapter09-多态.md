# chapter09-多态
面向对象特性：数据抽象、继承、多态（动态绑定）

## 9.1 再论向上转型
向上转型：获取对象引用并将其当作基类的引用。

### 忘记对象类型

## 9.2 难点
### 9.2.1 方法调用绑定
绑定：将一个方法调用和一个方法体关联起来的动作。  
前期绑定：在程序运行前执行绑定。  
后期绑定（动态绑定，运行时绑定）：绑定发生在运行时，并基于对象类型。

Java中所有的方法（非static\final方法）都是后期绑定。C是前期绑定。
### 9.2.2 产生正确的行为
### 9.2.3 可扩展性
### 9.2.4 陷阱：“重写”private方法
[PrivateOverride2.java](src/chapter09/polymorphism/PrivateOverride2.java)
### 9.2.5 陷阱：字段与静态方法
只有普通方法的调用是多态的。
字段的直接访问，会在编译时解析。

[FieldAccess.java](src/chapter09/polymorphism/FieldAccess.java)

静态方法的行为不会是多态。

## 9.3 构造器和多态
### 9.3.1 构造器的调用顺序

### 9.3.2 继承与清理
对于基类，先执行子类清理，再执行基类清理。

某个成员对象被其他对象所共享，可能需要使用*引用计数*来跟着走访问共享对象的对象数量。

### 9.3.3 构造器内部的多态方法行为
[PloyConstructors.java](src/chapter09/polymorphism/PloyConstructors.java)

## 9.4 协变返回类型
Java5添加了*协变返回类型（covariant return type）*，子类中重写方法的返回值可以是基类方法返回值的*子类型*。  
[CovariantReturn.java](src/chapter09/polymorphism/CovariantReturn.java)  

## 9.5 用继承进行设计
使用继承来表达行为上的差异，使用字段来表达状态上的变化。
[Transmogrify.java](src/chapter09/polymorphism/Transmogrify.java)  

### 9.5.1 替换与扩展
### 9.5.2 向下转型与反射
Java中每个转型都会被检查，强制转型在运行时会被检查，如果不成功，会抛出ClassCastException。
在运行时检查类型的行为是Java*反射*。  
[Reflect.java.java](src/chapter09/polymorphism/Reflect.java.java)  