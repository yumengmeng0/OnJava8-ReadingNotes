package chapter12.collections;

import reflection.pets.Pet;

import java.util.Iterator;

/**
 * @author: YuMengMeng
 * @date: 2022/9/10
 */

public class CrossCollectionIteration {
    /**
     * @param it 集合的迭代器Iterator
     */
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
