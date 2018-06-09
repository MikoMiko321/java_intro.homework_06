package geekbrains.java_intro.homework_06;

public abstract class Animal {

    int maxRunDistance;
    double maxJumpHeight;
    int maxSwimDistance;

    boolean run(int runDistance){
        if (runDistance<=maxRunDistance){
            System.out.println("Running was successful!");
            return true;
        } else {
            System.out.println("Running failed!");
            return false;
        }
    }
    boolean swim(int swimDistance){
        if (swimDistance<=maxSwimDistance){
            System.out.println("Swimming was successful!");
            return true;
        } else {
            System.out.println("Swimming failed!");
            return false;
        }


    }
    boolean jump(int jumpHeight){
        if (jumpHeight<=maxJumpHeight){
            System.out.println("Jumping was successful!");
            return true;
        } else {
            System.out.println("Jumping failed!");
            return false;
        }

    }
}
