// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.example.demo;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_demo_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_demo_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_demo_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\020com.example.demo\"\034\n\014Hel" +
      "loRequest\022\014\n\004name\030\001 \001(\t\"!\n\rHelloResponse" +
      "\022\020\n\010greeting\030\001 \001(\t2X\n\014HelloService\022H\n\005he" +
      "llo\022\036.com.example.demo.HelloRequest\032\037.co" +
      "m.example.demo.HelloResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_demo_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_demo_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_demo_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_demo_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_demo_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_demo_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}