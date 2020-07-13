package core.service.topic;

import com.intellij.util.messages.Topic;
import core.beans.Request;
import org.jetbrains.annotations.Nullable;

/**
 * @author ZhangYuanSheng
 * @version 1.0
 */
public interface RestDetailTopic extends RestTopic<RestDetailTopic> {

    Topic<RestDetailTopic> TOPIC = Topic.create("RestTopic.RestDetailTopic-ClearCache", RestDetailTopic.class);

    /**
     * clear Caches
     *
     * @param request request(key)
     */
    void clearCache(@Nullable Request request);
}