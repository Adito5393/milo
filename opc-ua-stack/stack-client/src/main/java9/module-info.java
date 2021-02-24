module org.eclipse.milo.opcua.stack.client {
    requires com.google.common;
    requires io.netty.handler;
    requires slf4j.api;
    requires strict.machine;

    requires transitive io.netty.buffer;
    requires transitive io.netty.codec;
    requires transitive io.netty.codec.http;
    requires transitive io.netty.common;
    requires transitive io.netty.transport;
    requires transitive jsr305;
    requires transitive netty.channel.fsm;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.stack.client;
    exports org.eclipse.milo.opcua.stack.client.security;
    exports org.eclipse.milo.opcua.stack.client.transport;
    exports org.eclipse.milo.opcua.stack.client.transport.http;
    exports org.eclipse.milo.opcua.stack.client.transport.tcp;
    exports org.eclipse.milo.opcua.stack.client.transport.uasc;
    exports org.eclipse.milo.opcua.stack.client.transport.websocket;
}