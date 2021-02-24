module org.eclipse.milo.opcua.binaryschema.parser {
    requires java.xml;
    requires org.slf4j;

    requires transitive com.google.common;
    requires transitive java.xml.bind;
    requires transitive jsr305;
    requires transitive org.eclipse.milo.opcua.binaryschema.core;
    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.binaryschema;
    exports org.eclipse.milo.opcua.binaryschema.parser;

}