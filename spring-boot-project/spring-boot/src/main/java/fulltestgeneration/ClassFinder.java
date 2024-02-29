package fulltestgeneration;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
public class ClassFinder {
    public List<Class<?>> findClassesInPackage(String packagePath) {
        ImmutableSet<ClassInfo> allClasses;
        ClassLoader classLoader = ClassFinder.class.getClassLoader();
        try {
            allClasses = ClassPath.from(classLoader).getAllClasses();
        } catch (IOException e) {
            //log.error("Failed to load all classes due to IO exception: {}", e.getMessage());
            return List.of();
        }

        return  allClasses.stream().filter(classInfo -> classInfo.getName().startsWith(packagePath))
            .map(classInfo -> loadClass(classLoader, classInfo.getName()))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    public Class<?> loadClass(ClassLoader classLoader, String className) {
        try {
            return classLoader.loadClass(className);
        } catch (ClassNotFoundException e) {
            //log.error("Failed to load class {}: {}", className, e.getMessage());
            return null;
        }
    }
}
