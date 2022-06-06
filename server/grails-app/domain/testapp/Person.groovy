package testapp

import grails.rest.Resource

@Resource(uri = '/person')
class Person {

    String name

    static constraints = {
        name blank: false
    }
}
