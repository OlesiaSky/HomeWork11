public class Main {
    public static void main(String[] args) {
        Classes myClass = new Classes();
        Classes.Inner myInner = myClass.new Inner();
        System.out.println(myInner.Min(10,20));
        System.out.println(myInner.Max(10, 20));
        System.out.println(myInner.Average(10,20));
    }
}