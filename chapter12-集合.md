# chapter12-集合
容器类：List、Set、Queue、Map

## 12.1 泛型和类型安全的集合
创建使用Java泛型的类可能非常复杂。使用提前定义好的泛型类相当简单。
ArrayList<Apple>：Apple类型参数

### 新特性：类型推断和泛型

## 12.2 基本概念
1. Collection：一个由单独元素组成的序列，而且这些元素要符合一条或多条规则。

2. Map：一组键值对象对，使用键来找值。

[SimpleCollection.java](src/chapter12/collections/SimpleCollection.java) 

## 12.3 添加一组元素
Arrays.asList()返回的是固定长度的集合对象，不能改变大小。
```java
    List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
```

## 12.4 打印集合
Arrays.toString()

## 12.5 List
两种类似的List：ArrayList、LinkedList

## 12.6 Iterator

### ListIterator

ListIterator可以双向移动

## 12.7 LinkedList

## 12.8 Stack


