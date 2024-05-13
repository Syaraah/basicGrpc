package org.example;

import com.example.demo.HelloRequest;
import com.example.demo.HelloResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.HelloServiceGrpc;

@GrpcService
public class DemoController extends HelloServiceGrpc.HelloServiceImplBase{

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        new Thread(new MyThread()).start();
        HelloResponse reply = HelloResponse.newBuilder()
                .setGreeting("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    
    @Override
        public void stopUDP(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        {
            new Thread(new MyThread()).stop();
            HelloResponse response = HelloResponse.newBuilder()
                    .setGreeting("UDP thread stopped")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
