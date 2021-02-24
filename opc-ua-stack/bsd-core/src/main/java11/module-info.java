module org.eclipse.milo.opcua.binaryschema.core {
    requires transitive java.xml;
    requires transitive java.xml.bind;
//    requires jakarta.activation;
//    requires org.glassfish.jaxb.runtime;

    exports org.opcfoundation.opcua.binaryschema;
}