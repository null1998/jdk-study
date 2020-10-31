package com.hyd.studyjdk;

import java.util.ArrayList;

/**
 * @author yanduohuang
 * @version 1.0
 * @date 2020/10/30 16:51
 */
public class Main {
    static class A {
        private int id;

        public A(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        A a = new A(3);
        ArrayList<A> as = new ArrayList<>();
        as.add(a);
        Object[] array = as.toArray();
        System.out.println(((A)array[0]).getId());
    }
}
