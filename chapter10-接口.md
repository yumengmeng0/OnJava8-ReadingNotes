# chapter10-接口

## 10.1 抽象类和抽象方法
[Music4.java](src/chapter10/interfaces/music4/Music4.java)  

## 10.2 接口定义
接口是用来在类之间建立“协议”的。  
Java8允许接口有默认方法和静态方法。  
接口可以包含字段（隐式static final，常量）。  
### 10.2.1 默认方法
添加默认方法：它允许向现有接口中添加方法，而不会破坏已经使用该接口的所有代码。  
JDK9 中，接口的default和static方法都可以是private的。  
[Implementation2.java](src/chapter10/interfaces/Implementation2.java)  


### 10.2.2 多重继承
*多重继承*：一个类可以从多个基类继承特性和功能。  
通过默认方法，Java拥有了多重继承的一些特性。字段仍然只能来自单个基类或抽象类，不能拥有状态（字段）的多重继承。  
[MultipleInheritance.java](src/chapter10/interfaces/MultipleInheritance.java)  

实现多个接口冲突：
[MICollision.java](src/chapter10/interfaces/MICollision.java)  
解决方式：重写接口中冲突的同名方法
[Jim.java](src/chapter10/interfaces/Jim.java)  

### 10.2.3 接口中的静态方法
[MetalWork.java](src/chapter10/interfaces/MetalWork.java)  

### 10.2.4 作为接口的Instrument

[Music5.java](src/chapter10/interfaces/music5/Music5.java)  

## 10.3 抽象类与接口
|特性|接口|抽象类|
|---|---|---|
|组合|可以在新类中组合多个接口|只能继承一个抽象类|
|状态|不能包含字段（静态字段除外，但它们不支持对象状态）|可以包含字段，非抽象方法可以引用这些字段|
|默认方法与抽象方法|默认方法不需要在子类型里实现，它只能引用接口里的方法（字段不行）|抽象方法必须在子类型里实现|
|构造器|不能有构造器|可以有构造器|
|访问控制权限|隐式的public|可以为protected或包访问权限|

## 10.4 完全解耦

## 10.5 组合多个接口
## 10.6 通过继承来扩展接口
### 组合接口时名称冲突
## 10.7 适配接口
## 10.8 接口中的字段
### 初始化接口中的字段
## 10.9 嵌套接口
## 10.10 接口和工厂
## 10.11 新特性：接口的private方法
## 10.12 新特性：密封类和密封接口 