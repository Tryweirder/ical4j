package net.fortuna.ical4j.model.property

import net.fortuna.ical4j.model.ParameterList
import spock.lang.Specification

class VersionSpec extends Specification {

    Version.Factory factory = []

    def 'test factory use of constants'() {
        when: 'factory is invoked with a constant value'
        def version = factory.createProperty(new ParameterList(), value)

        then: 'the returned value is the constant instance'
        version.is(constantInstance)

        where:
        value   | constantInstance
        '2.0' | Version.VERSION_2_0
    }
}
