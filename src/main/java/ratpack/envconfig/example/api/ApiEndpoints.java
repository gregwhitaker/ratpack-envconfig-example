package ratpack.envconfig.example.api;

import ratpack.envconfig.example.api.handler.HelloEndpoint;
import ratpack.func.Action;
import ratpack.handling.Chain;

public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {
        chain.get(HelloEndpoint.class);
    }
}
