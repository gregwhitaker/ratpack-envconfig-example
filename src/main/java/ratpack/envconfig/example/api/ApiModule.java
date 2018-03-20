package ratpack.envconfig.example.api;

import com.google.inject.AbstractModule;
import ratpack.envconfig.example.api.handler.HelloEndpoint;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiEndpoints.class);

        bind(HelloEndpoint.class);
    }
}
