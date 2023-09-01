package annotations.customAnnotationClass;
import java.lang.annotation.*;


/*to create annotation-
 * empty the class 
 * replace class keyword with @interface
 * then import java.lang.annotation.*
 * use in-built annotaion @Target(ElementType.TYPE) to specify the level where TYPE is for class level,FIELD is for field level,PACKAGE for package level and METHOD for method level
 * and @Retention(RetentionPolicy.RUNTIME) to understandable at runtime
 * 
 * */

/*to use annotation
 * extend it to another class using @AnnotationName
 * Now to check if the class extends the annoation or not use if condition with obj.getClass().isAnnotationPresent(ToDoGo.class) where obj is object of class and ToDoGo is annotation name
 */



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToDoGo {

	

}
