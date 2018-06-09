package geekbrains.java_intro.homework_06;

public class Dog extends Animal{
    public Dog(int thisMaxRunDistance, int thisMaxSwimDistance, double thisMaxJumpHeight) {
        this.maxRunDistance = thisMaxRunDistance;
        this.maxSwimDistance = thisMaxSwimDistance;
        this.maxJumpHeight = thisMaxJumpHeight;
    }
    public Dog(){
        this(500,10,0.5);
    }
}
