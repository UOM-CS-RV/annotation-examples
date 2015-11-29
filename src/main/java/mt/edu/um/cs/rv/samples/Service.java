package mt.edu.um.cs.rv.samples;

import mt.edu.um.cs.rv.annotations.AroundEventDefinition;
import mt.edu.um.cs.rv.annotations.EventParameter;
import mt.edu.um.cs.rv.annotations.PostEventDefinition;
import mt.edu.um.cs.rv.annotations.PreEventDefinition;
import mt.edu.um.cs.rv.builders.ToUpperCaseEventBuilder;

/**
 * Created by dwardu on 29/11/2015.
 */
public class Service {

    /* *******************************************
     * BASIC EXAMPLES
     * *******************************************/


    @PreEventDefinition
    //creates an event with attribute value pairs for all method parameters
    public User addNewUser1(String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @PostEventDefinition
    //creates an event with attribute value pairs for all method parameters and the return value
    public User addNewUser2(String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @AroundEventDefinition
    //creates an event with attribute value pairs for all method parameters at the start of the method
    //creates an event with attribute value pairs for all method parameters and the return value after method execution
    public User addNewUser3(String username, String name, String surname) {
        return new User(username, name, surname);
    }


    /* *******************************************
     * ONLINE EXAMPLES
     * *******************************************/

    @PreEventDefinition(online = true)
    // Creates an ONLINE event with attribute value pairs for all method parameters.
    // The monitor can preempt execution of the method
    public User addNewUser4(String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @PostEventDefinition(online = true)
    //creates an ONLINE event with attribute value pairs for all method parameters and the return value
    // The monitor can generate an error on the system side and block the method from returning, BUT the execution has been completed
    public User addNewUser5(String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @AroundEventDefinition (online = true)
    // Creates an ONLINE event with attribute value pairs for all method parameters.
    // The monitor can preempt execution of the method
    //creates an ONLINE event with attribute value pairs for all method parameters and the return value
    // The monitor can generate an error on the system side and block the method from returning, BUT the execution has been completed
    public User addNewUser6(String username, String name, String surname) {
        return new User(username, name, surname);
    }

    /* *******************************************
     * ANNOTATE PARAMETERS
     * Note: If not compiled in debug, parameters names will be lost, therefore in these cases the @EventParameter is required.
     * Note: This is a quick way of reducing the number of elements sent in an event
     * *******************************************/
    @PreEventDefinition
    //creates an event with attribute value pairs of the annotated parameters
    public User addNewUser7(@EventParameter("username") String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @PostEventDefinition
    //creates an event with attribute value pairs of the annotated parameters
    //the result is not sent since the @EventParameter is used
    public User addNewUser8(@EventParameter("username") String username, String name, String surname) {
        return new User(username, name, surname);
    }

    @PostEventDefinition
    //creates an event with attribute value pairs of the annotated parameters
    //the result is also sent since @EventParameter annotates the method too
    public @EventParameter("result") User addNewUser9(@EventParameter("username") String username, String name, String surname) {
        return new User(username, name, surname);
    }

    /* *******************************************
     * EVENT BUILDERS
     * *******************************************/
    @PreEventDefinition(eventBuilder=ToUpperCaseEventBuilder.class)
    // Creates an ONLINE event with attribute value pairs for all method parameters.
    // The monitor can preempt execution of the method
    public User addNewUser10(String username, String name, String surname) {
        return new User(username, name, surname);
    }


    /* *******************************************
     * EVENT BUILDERS
     * *******************************************/

}
