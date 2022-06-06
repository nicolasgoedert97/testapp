package testapp

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    PersonDataService personDataService

    def init = { servletContext ->
        Person person1 = personDataService.save("Mario")
        Person person2 = personDataService.save("Luigi")


    }
    def destroy = {
    }
}
