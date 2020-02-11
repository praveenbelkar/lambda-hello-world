package com.praveen;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaHelloWorld implements RequestHandler<Object, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(Object o, Context context) {
        //String message = "{\"message\": \"Hellow from Praveen\"}";
        String message = "Hellow from Praveen";
        System.out.println(message);
        return createGatewayResponse(message);
    }

    private GatewayResponse createGatewayResponse(String message) {
        /*GatewayResponse.GatewayResponseBuilder gatewayResponseBuilder = new GatewayResponse.GatewayResponseBuilder();
        return gatewayResponseBuilder.withBody(message)
                .withStatusCode(200)
                .setBase64Encoded(false)
                .build();
        */
        return new GatewayResponse(message, 200, Collections.EMPTY_MAP, false);

    }

    /*public static void main(String[] args) {
        LambdaHelloWorld lambdaHelloWorld = new LambdaHelloWorld();
        System.out.println(lambdaHelloWorld.handleRequest(null, null));
    }*/
}
