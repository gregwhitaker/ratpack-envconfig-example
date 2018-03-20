package ratpack.envconfig.example.api.handler;

import com.google.inject.Inject;
import ratpack.envconfig.example.config.HelloConfig;
import ratpack.handling.Context;
import ratpack.handling.Handler;

/**
 * Handler responsible for returning a hello message.
 */
public class HelloEndpoint implements Handler {

    @Inject
    private HelloConfig config;

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.render(String.format(config.message, config.username));
    }
}
