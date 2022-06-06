package testapp

import grails.gorm.services.Service

@Service(Person)
interface PersonDataService {
    Person save(String name)
}
