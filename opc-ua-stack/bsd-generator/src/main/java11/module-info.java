module org.eclipse.milo.opcua.binaryschema.generator {
    requires java.xml;
    requires java.xml.bind;
    requires org.eclipse.milo.opcua.binaryschema.core;
    requires org.glassfish.jaxb.runtime;
    requires org.slf4j;

    requires transitive org.eclipse.milo.opcua.stack.core;

    exports org.eclipse.milo.opcua.binaryschema.generator;
}