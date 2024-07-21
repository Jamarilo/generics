import java.lang.reflect.Constructor;

public class ClassFactory {


    public <T> T initClass(Class<T> requiredClass) throws Exception {
        Constructor<T> constructor = requiredClass.getConstructor();

        T requiredInstanz = constructor.newInstance();
        return requiredInstanz;
    }
}
