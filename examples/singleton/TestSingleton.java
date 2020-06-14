package designpattern.singleton;

import java.lang.reflect.Constructor;

public class TestSingleton {

    public static void main(String args[])
    {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = null;
        try
        {
            Constructor[] constructors =
                    Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the designpattern.singleton pattern
                constructor.setAccessible(true);
                instance2 = (Singleton) constructor.newInstance();
                break;
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
        System.out.println("instance2.hashCode():- "
                + instance2.hashCode());


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Singleton.getInstance().hashCode());
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Singleton.getInstance().hashCode());
//            }
//        });
//
//        t1.start();
//        t2.start();


    }
}
