package mt.edu.um.cs.rv.builders;

import mt.edu.um.cs.rv.events.Event;

import java.util.Map;

/**
 * Created by dwardu on 29/11/2015.
 */
public interface EventBuilder {
    Event build(Map<String,Object> params, Object retval);
}
