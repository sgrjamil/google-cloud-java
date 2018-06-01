// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

public final class DatastoreProto {
  private DatastoreProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_LookupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_LookupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_LookupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_RunQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_RunQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_BeginTransactionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_BeginTransactionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_RollbackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_RollbackResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_RollbackResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_CommitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_CommitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_CommitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_AllocateIdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_AllocateIdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_AllocateIdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_ReserveIdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReserveIdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_ReserveIdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReserveIdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_Mutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_Mutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_MutationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_MutationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_ReadOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_ReadOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_TransactionOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_datastore_v1_TransactionOptions_ReadOnly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/datastore/v1/datastore.proto\022\023g" +
      "oogle.datastore.v1\032\034google/api/annotatio" +
      "ns.proto\032 google/datastore/v1/entity.pro" +
      "to\032\037google/datastore/v1/query.proto\"\203\001\n\r" +
      "LookupRequest\022\022\n\nproject_id\030\010 \001(\t\0226\n\014rea" +
      "d_options\030\001 \001(\0132 .google.datastore.v1.Re" +
      "adOptions\022&\n\004keys\030\003 \003(\0132\030.google.datasto" +
      "re.v1.Key\"\242\001\n\016LookupResponse\0220\n\005found\030\001 " +
      "\003(\0132!.google.datastore.v1.EntityResult\0222" +
      "\n\007missing\030\002 \003(\0132!.google.datastore.v1.En",
      "tityResult\022*\n\010deferred\030\003 \003(\0132\030.google.da" +
      "tastore.v1.Key\"\204\002\n\017RunQueryRequest\022\022\n\npr" +
      "oject_id\030\010 \001(\t\0226\n\014partition_id\030\002 \001(\0132 .g" +
      "oogle.datastore.v1.PartitionId\0226\n\014read_o" +
      "ptions\030\001 \001(\0132 .google.datastore.v1.ReadO" +
      "ptions\022+\n\005query\030\003 \001(\0132\032.google.datastore" +
      ".v1.QueryH\000\0222\n\tgql_query\030\007 \001(\0132\035.google." +
      "datastore.v1.GqlQueryH\000B\014\n\nquery_type\"s\n" +
      "\020RunQueryResponse\0224\n\005batch\030\001 \001(\0132%.googl" +
      "e.datastore.v1.QueryResultBatch\022)\n\005query",
      "\030\002 \001(\0132\032.google.datastore.v1.Query\"s\n\027Be" +
      "ginTransactionRequest\022\022\n\nproject_id\030\010 \001(" +
      "\t\022D\n\023transaction_options\030\n \001(\0132\'.google." +
      "datastore.v1.TransactionOptions\"/\n\030Begin" +
      "TransactionResponse\022\023\n\013transaction\030\001 \001(\014" +
      "\":\n\017RollbackRequest\022\022\n\nproject_id\030\010 \001(\t\022" +
      "\023\n\013transaction\030\001 \001(\014\"\022\n\020RollbackResponse" +
      "\"\203\002\n\rCommitRequest\022\022\n\nproject_id\030\010 \001(\t\0225" +
      "\n\004mode\030\005 \001(\0162\'.google.datastore.v1.Commi" +
      "tRequest.Mode\022\025\n\013transaction\030\001 \001(\014H\000\0220\n\t",
      "mutations\030\006 \003(\0132\035.google.datastore.v1.Mu" +
      "tation\"F\n\004Mode\022\024\n\020MODE_UNSPECIFIED\020\000\022\021\n\r" +
      "TRANSACTIONAL\020\001\022\025\n\021NON_TRANSACTIONAL\020\002B\026" +
      "\n\024transaction_selector\"f\n\016CommitResponse" +
      "\022=\n\020mutation_results\030\003 \003(\0132#.google.data" +
      "store.v1.MutationResult\022\025\n\rindex_updates" +
      "\030\004 \001(\005\"P\n\022AllocateIdsRequest\022\022\n\nproject_" +
      "id\030\010 \001(\t\022&\n\004keys\030\001 \003(\0132\030.google.datastor" +
      "e.v1.Key\"=\n\023AllocateIdsResponse\022&\n\004keys\030" +
      "\001 \003(\0132\030.google.datastore.v1.Key\"d\n\021Reser",
      "veIdsRequest\022\022\n\nproject_id\030\010 \001(\t\022\023\n\013data" +
      "base_id\030\t \001(\t\022&\n\004keys\030\001 \003(\0132\030.google.dat" +
      "astore.v1.Key\"\024\n\022ReserveIdsResponse\"\207\002\n\010" +
      "Mutation\022-\n\006insert\030\004 \001(\0132\033.google.datast" +
      "ore.v1.EntityH\000\022-\n\006update\030\005 \001(\0132\033.google" +
      ".datastore.v1.EntityH\000\022-\n\006upsert\030\006 \001(\0132\033" +
      ".google.datastore.v1.EntityH\000\022*\n\006delete\030" +
      "\007 \001(\0132\030.google.datastore.v1.KeyH\000\022\026\n\014bas" +
      "e_version\030\010 \001(\003H\001B\013\n\toperationB\035\n\033confli" +
      "ct_detection_strategy\"c\n\016MutationResult\022",
      "%\n\003key\030\003 \001(\0132\030.google.datastore.v1.Key\022\017" +
      "\n\007version\030\004 \001(\003\022\031\n\021conflict_detected\030\005 \001" +
      "(\010\"\325\001\n\013ReadOptions\022L\n\020read_consistency\030\001" +
      " \001(\01620.google.datastore.v1.ReadOptions.R" +
      "eadConsistencyH\000\022\025\n\013transaction\030\002 \001(\014H\000\"" +
      "M\n\017ReadConsistency\022 \n\034READ_CONSISTENCY_U" +
      "NSPECIFIED\020\000\022\n\n\006STRONG\020\001\022\014\n\010EVENTUAL\020\002B\022" +
      "\n\020consistency_type\"\343\001\n\022TransactionOption" +
      "s\022G\n\nread_write\030\001 \001(\01321.google.datastore" +
      ".v1.TransactionOptions.ReadWriteH\000\022E\n\tre",
      "ad_only\030\002 \001(\01320.google.datastore.v1.Tran" +
      "sactionOptions.ReadOnlyH\000\032)\n\tReadWrite\022\034" +
      "\n\024previous_transaction\030\001 \001(\014\032\n\n\010ReadOnly" +
      "B\006\n\004mode2\354\007\n\tDatastore\022~\n\006Lookup\022\".googl" +
      "e.datastore.v1.LookupRequest\032#.google.da" +
      "tastore.v1.LookupResponse\"+\202\323\344\223\002%\" /v1/p" +
      "rojects/{project_id}:lookup:\001*\022\206\001\n\010RunQu" +
      "ery\022$.google.datastore.v1.RunQueryReques" +
      "t\032%.google.datastore.v1.RunQueryResponse" +
      "\"-\202\323\344\223\002\'\"\"/v1/projects/{project_id}:runQ",
      "uery:\001*\022\246\001\n\020BeginTransaction\022,.google.da" +
      "tastore.v1.BeginTransactionRequest\032-.goo" +
      "gle.datastore.v1.BeginTransactionRespons" +
      "e\"5\202\323\344\223\002/\"*/v1/projects/{project_id}:beg" +
      "inTransaction:\001*\022~\n\006Commit\022\".google.data" +
      "store.v1.CommitRequest\032#.google.datastor" +
      "e.v1.CommitResponse\"+\202\323\344\223\002%\" /v1/project" +
      "s/{project_id}:commit:\001*\022\206\001\n\010Rollback\022$." +
      "google.datastore.v1.RollbackRequest\032%.go" +
      "ogle.datastore.v1.RollbackResponse\"-\202\323\344\223",
      "\002\'\"\"/v1/projects/{project_id}:rollback:\001" +
      "*\022\222\001\n\013AllocateIds\022\'.google.datastore.v1." +
      "AllocateIdsRequest\032(.google.datastore.v1" +
      ".AllocateIdsResponse\"0\202\323\344\223\002*\"%/v1/projec" +
      "ts/{project_id}:allocateIds:\001*\022\216\001\n\nReser" +
      "veIds\022&.google.datastore.v1.ReserveIdsRe" +
      "quest\032\'.google.datastore.v1.ReserveIdsRe" +
      "sponse\"/\202\323\344\223\002)\"$/v1/projects/{project_id" +
      "}:reserveIds:\001*B\241\001\n\027com.google.datastore" +
      ".v1B\016DatastoreProtoP\001Z<google.golang.org",
      "/genproto/googleapis/datastore/v1;datast" +
      "ore\252\002\031Google.Cloud.Datastore.V1\312\002\031Google" +
      "\\Cloud\\Datastore\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.datastore.v1.EntityProto.getDescriptor(),
          com.google.datastore.v1.QueryProto.getDescriptor(),
        }, assigner);
    internal_static_google_datastore_v1_LookupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_datastore_v1_LookupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_LookupRequest_descriptor,
        new java.lang.String[] { "ProjectId", "ReadOptions", "Keys", });
    internal_static_google_datastore_v1_LookupResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_datastore_v1_LookupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_LookupResponse_descriptor,
        new java.lang.String[] { "Found", "Missing", "Deferred", });
    internal_static_google_datastore_v1_RunQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_datastore_v1_RunQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_RunQueryRequest_descriptor,
        new java.lang.String[] { "ProjectId", "PartitionId", "ReadOptions", "Query", "GqlQuery", "QueryType", });
    internal_static_google_datastore_v1_RunQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_datastore_v1_RunQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_RunQueryResponse_descriptor,
        new java.lang.String[] { "Batch", "Query", });
    internal_static_google_datastore_v1_BeginTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_BeginTransactionRequest_descriptor,
        new java.lang.String[] { "ProjectId", "TransactionOptions", });
    internal_static_google_datastore_v1_BeginTransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_datastore_v1_BeginTransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_BeginTransactionResponse_descriptor,
        new java.lang.String[] { "Transaction", });
    internal_static_google_datastore_v1_RollbackRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_RollbackRequest_descriptor,
        new java.lang.String[] { "ProjectId", "Transaction", });
    internal_static_google_datastore_v1_RollbackResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_datastore_v1_RollbackResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_RollbackResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_datastore_v1_CommitRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_datastore_v1_CommitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_CommitRequest_descriptor,
        new java.lang.String[] { "ProjectId", "Mode", "Transaction", "Mutations", "TransactionSelector", });
    internal_static_google_datastore_v1_CommitResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_datastore_v1_CommitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_CommitResponse_descriptor,
        new java.lang.String[] { "MutationResults", "IndexUpdates", });
    internal_static_google_datastore_v1_AllocateIdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_datastore_v1_AllocateIdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_AllocateIdsRequest_descriptor,
        new java.lang.String[] { "ProjectId", "Keys", });
    internal_static_google_datastore_v1_AllocateIdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_datastore_v1_AllocateIdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_AllocateIdsResponse_descriptor,
        new java.lang.String[] { "Keys", });
    internal_static_google_datastore_v1_ReserveIdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_datastore_v1_ReserveIdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_ReserveIdsRequest_descriptor,
        new java.lang.String[] { "ProjectId", "DatabaseId", "Keys", });
    internal_static_google_datastore_v1_ReserveIdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_datastore_v1_ReserveIdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_ReserveIdsResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_datastore_v1_Mutation_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_datastore_v1_Mutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_Mutation_descriptor,
        new java.lang.String[] { "Insert", "Update", "Upsert", "Delete", "BaseVersion", "Operation", "ConflictDetectionStrategy", });
    internal_static_google_datastore_v1_MutationResult_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_datastore_v1_MutationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_MutationResult_descriptor,
        new java.lang.String[] { "Key", "Version", "ConflictDetected", });
    internal_static_google_datastore_v1_ReadOptions_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_datastore_v1_ReadOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_ReadOptions_descriptor,
        new java.lang.String[] { "ReadConsistency", "Transaction", "ConsistencyType", });
    internal_static_google_datastore_v1_TransactionOptions_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_google_datastore_v1_TransactionOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_TransactionOptions_descriptor,
        new java.lang.String[] { "ReadWrite", "ReadOnly", "Mode", });
    internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor =
      internal_static_google_datastore_v1_TransactionOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_datastore_v1_TransactionOptions_ReadWrite_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_TransactionOptions_ReadWrite_descriptor,
        new java.lang.String[] { "PreviousTransaction", });
    internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor =
      internal_static_google_datastore_v1_TransactionOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_datastore_v1_TransactionOptions_ReadOnly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_datastore_v1_TransactionOptions_ReadOnly_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.datastore.v1.EntityProto.getDescriptor();
    com.google.datastore.v1.QueryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
