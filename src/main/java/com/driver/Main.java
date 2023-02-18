package com.driver;

    class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public class Main {
        public static void main(String[] args) {
            A obj1 = new A();
            B obj2 = new B();

            // Calling meth() from object of class A
            System.out.println(obj1.meth());

            // Calling meth() from object of class B, which will call the overridden method
            System.out.println(obj2.meth());
        }
    }
