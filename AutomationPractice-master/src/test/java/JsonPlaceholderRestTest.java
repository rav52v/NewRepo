package test.java;

import main.java.rest.JsonPlaceholderService;
import org.junit.Test;

public class JsonPlaceholderRestTest {

    @Test
    public void maxValForUserId(){
        JsonPlaceholderService service = new JsonPlaceholderService();
        String userId = service.getMaxUserIdVal();
        String postId = service.getMaxPostIdValForUserId(userId);
        service.addCommentForPostId(postId);
    }

}
