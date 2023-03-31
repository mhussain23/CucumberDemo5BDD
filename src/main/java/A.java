  class A {


    public Object m1(){

        return "A";

    }

    void m2(){
        System.out.println("m2 called");
    }

}

class B extends A{

    public String m1(){

       super.m2();

        return "B";


    }


}

class Test {

    public static void main(String[] args) {



        A aobj = new A();

        B bobj = new B();

        A abobj = new B();

        System.out.println(aobj.m1());

        System.out.println(bobj.m1());

        System.out.println(abobj.m1());

        System.out.println(Math.max(3,5));
    }
}