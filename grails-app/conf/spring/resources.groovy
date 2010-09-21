// Place your Spring DSL code here
import org.apache.activemq.pool.PooledConnectionFactory
import org.apache.activemq.ActiveMQConnectionFactory

beans = {
    jmsConnectionFactory(PooledConnectionFactory){bean ->
        bean.destroyMethod ="stop"
        connectionFactory(ActiveMQConnectionFactory) {
            brokerURL = "tcp://localhost:61616"
        }
    }
}
