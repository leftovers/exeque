package exeque

import grails.plugin.jms.Queue

class SimpleService {

    static transactional = false
    static expose = ['jms']

    @Queue(name = "queue.email")
    def serviceMethod(msg) {
        println msg
    }
}
