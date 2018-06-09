package geekbrains.java_intro.homework_06;

public class Cat extends Animal {
    public Cat(int thisMaxRunDistance, int thisMaxSwimDistance, double thisMaxJumpHeight) {
        this.maxRunDistance = thisMaxRunDistance;
        this.maxSwimDistance = thisMaxSwimDistance;
        this.maxJumpHeight = thisMaxJumpHeight;
    }
    public Cat(){
        this(200,0,2);
    }
}
