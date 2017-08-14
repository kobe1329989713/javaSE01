package mq.hellworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by kobe on 2017/8/14.21:54
 * <br/>
 * Description:
 * 消费者
 */
@SuppressWarnings("ALL")
public class Receiver {
    public static void main(String[] args) throws Exception {
        // 1, 配置 用户名 密码 链接地址。
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                "tcp://localhost:61616"
        );

        // 2 打开连接。
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // 3 用的是 session， 第一个参数是：是否接收事物。二：代表 sesion 接收模式。
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

        // 4、通过 session 来创建使用对象。
        Destination destination = session.createQueue("queue1");

        // 5
        MessageConsumer messageConsumer = session.createConsumer(destination);


        // 7
        while (true) {
            TextMessage msg = (TextMessage) messageConsumer.receive();
            msg.acknowledge();
            if (msg == null) break;
            System.out.println("接收的内容：" + msg.getText());
        }

        if (connection != null) {
            connection.close();
        }
    }

}
