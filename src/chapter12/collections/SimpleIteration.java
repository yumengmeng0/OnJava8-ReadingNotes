package chapter12.collections;

import reflection.pets.Pet;
import reflection.pets.PetCreator;

import java.util.Iterator;
import java.util.List;

/**
 * @author: YuMengMeng
 * @date: 2022/9/9
 */

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(12);
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.printf(p.id() + ":" + p + " ");
        }
        System.out.println();
        // 更简单的方式
        for (Pet p : pets) {
            System.out.printf(p.id() + ":" + p + " ");
        }
        System.out.println();
        // 迭代器也可以用来删除元素
        iterator = pets.iterator();
        for (int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }
}
