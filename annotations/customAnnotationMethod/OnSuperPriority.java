package annotations.customAnnotationMethod;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnSuperPriority {


}
