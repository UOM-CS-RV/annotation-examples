package mt.edu.um.cs.rv.builders;

import mt.edu.um.cs.rv.events.Event;

import java.util.Map;
import java.util.Set;

/**
 * Created by dwardu on 29/11/2015.
 */
public class ToUpperCaseEventBuilder implements EventBuilder
{
    @Override
    public Event build(Map<String, Object> params, Object retval) {
        if (params != null){
            Set<String> keys = params.keySet();

            for (String k: keys) {
                Object o = params.get(k);
                if (o instanceof String){
                    String s = (String) o;
                    params.put(k, s.toUpperCase());
                }
            }
        }

        return new Event(params);
    }
}
