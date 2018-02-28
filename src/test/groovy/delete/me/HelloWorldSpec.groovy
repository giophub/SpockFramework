package delete.me

import spock.lang.Specification

class HelloWorldSpec extends Specification {

    def "Say Hello World"() {
        given:
        String string = "Hello World"

        expect:
        string == "Hello World"
    }
}
