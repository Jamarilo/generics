public class Main {


    public static void main(String[] args) {

        final var firstClassName = "FirstClass";
        final var secondClassName = "SecondClass";
        final var thirdClassName = "ThirdClass";

        final ClassFactory classFactory = new ClassFactory();
        try {
            FirstClass firstClass = classFactory.initClass(getFirstClazz(firstClassName));
            firstClass.doFirst();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static Class<FirstClass> getFirstClazz(String firstClassName) {
        try {
            return (Class<FirstClass>) Class.forName(firstClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}