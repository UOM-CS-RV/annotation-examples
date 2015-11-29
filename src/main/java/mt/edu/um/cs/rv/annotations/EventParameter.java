package mt.edu.um.cs.rv.annotations;

import java.lang.annotation.*;

/**
 * Created by dwardu on 29/11/2015.
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EventParameter {
    String value();
}
