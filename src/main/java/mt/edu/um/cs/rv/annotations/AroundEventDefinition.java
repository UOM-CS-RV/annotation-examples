package mt.edu.um.cs.rv.annotations;

import mt.edu.um.cs.rv.builders.EventBuilder;

import java.lang.annotation.*;

/**
 * Created by dwardu on 29/11/2015.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AroundEventDefinition {
    boolean online() default false;
    Class<? extends EventBuilder> eventBuilder() default EventBuilder.class;
}
