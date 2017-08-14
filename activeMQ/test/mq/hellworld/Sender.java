package mq.hellworld;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by kobe on 2017/8/14.21:21
 * <br/>
 * Description:
 * 就可以把 ActiveMQ 当成一个 数据库样。就是一个服务，像 redis 样。
 *
 * ActiveMQ，发送端
 */
public class Sender {
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
//        Session session = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);

        // 使用事物 session
        Session session = connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);

        // 4、通过 session 来创建使用对象。
        Destination destination = session.createQueue("queue1");

        // 5
        MessageProducer messageProducer = session.createProducer(destination);

        // 6
        messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        // 7
        for (int i=0; i<5; i++) {
            TextMessage textMessage =  session.createTextMessage();
            textMessage.setText("我是消息内容！！，id为：" + i);
            messageProducer.send(textMessage);
            System.out.println("生产者：" + textMessage.getText());
        }
        if (connection != null) {
            connection.close();
        }
    }
}
