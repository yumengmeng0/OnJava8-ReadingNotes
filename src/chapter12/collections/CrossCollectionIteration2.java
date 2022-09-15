package chapter12.collections;

import reflection.pets.Pet;

import java.util.Iterator;

/**
 * @author: YuMengMeng
 * @date: 2022/9/10
 */

public class CrossCollectionIteration2 {
    /**
     * @param ip 实现Iterable的集合
     */
    public static void display(Iterable<Pet> ip) {
        Iterator<Pet> it = ip.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
