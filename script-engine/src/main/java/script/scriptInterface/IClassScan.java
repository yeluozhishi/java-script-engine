package script.scriptInterface;

import script.ScannerClassException;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public interface IClassScan {

    String CLASS_SUFFIX = ".class";

    List<Class<?>> search(String packageName, ClassLoader classLoader, Predicate<Class<?>> predicate) throws ScannerClassException, IOException, ClassNotFoundException;

}
