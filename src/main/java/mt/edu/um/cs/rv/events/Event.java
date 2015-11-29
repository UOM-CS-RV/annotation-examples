package mt.edu.um.cs.rv.events;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dwardu on 29/11/2015.
 */
public class Event {
    public Map<String, Object> params = new HashMap<>();

    public Event() {
    }

    public Event(Map<String, Object> params) {
        this.params = params;
    }

    public void addParam(String name, Object value){
        params.put(name, value);
    }
}
