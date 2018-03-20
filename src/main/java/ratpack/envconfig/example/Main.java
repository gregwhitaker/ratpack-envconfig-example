package ratpack.envconfig.example;

import ratpack.envconfig.example.api.ApiEndpoints;
import ratpack.envconfig.example.api.ApiModule;
import ratpack.envconfig.example.config.HelloConfig;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

/**
 * Starts the ratpack-envconfig-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> {
                        c.env()
                            .yaml("config.yaml");

                        // This is janky, but appears to be the only way without creating a new
                        // environment aware implementation of ServerConfigBuilder
                        String environment = System.getenv("RATPACK_ENVIRONMENT");
                        if (environment != null && environment.equalsIgnoreCase("test")) {
                            c.yaml("config-test.yaml");
                        } else if (environment != null && environment.equalsIgnoreCase("prod")) {
                            c.yaml("config-prod.yaml");
                        }

                        c.require("/hello", HelloConfig.class)
                                .baseDir(BaseDir.find())
                                .build();
                })
                .registry(Guice.registry(b -> b
                        .module(ApiModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiEndpoints.class)
                )
        );
    }
}
