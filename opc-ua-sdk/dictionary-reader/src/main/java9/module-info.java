module org.eclipse.milo.opcua.sdk.dictionaryreader {
    requires com.google.common;
    requires io.netty.buffer;
    requires java.xml.bind;
    requires org.eclipse.milo.opcua.sdk.core;
    requires slf4j.api;

    requires transitive org.eclipse.milo.opcua.binaryschema.parser;
    requires transitive org.eclipse.milo.opcua.sdk.client;
    requires transitive org.eclipse.milo.opcua.stack.client;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.sdk.dictionaryreader;
}