package cn.qihangerp.common.mq;

import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class MqUtils {
    private final StringRedisTemplate stringRedisTemplate;

    public void sendMessage(String channel, Object message) {
        stringRedisTemplate.convertAndSend(channel, message);
    }
    public void sendApiMessage(MqMessage message) {
        stringRedisTemplate.convertAndSend("ApiMessage", message);
    }
}
