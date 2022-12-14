// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wallet.proto

package bp.wallet.demo;

public final class WalletProto {
  private WalletProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_WalletRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_WalletRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_WalletResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_WalletResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BalanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wallet_BalanceResponse_BalancesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wallet_BalanceResponse_BalancesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014wallet.proto\022\006wallet\"?\n\rWalletRequest\022" +
      "\014\n\004user\030\001 \001(\t\022\016\n\006amount\030\002 \001(\001\022\020\n\010currenc" +
      "y\030\003 \001(\t\"!\n\016WalletResponse\022\017\n\007message\030\001 \001" +
      "(\t\"\036\n\016BalanceRequest\022\014\n\004user\030\001 \001(\t\"{\n\017Ba" +
      "lanceResponse\0227\n\010balances\030\001 \003(\0132%.wallet" +
      ".BalanceResponse.BalancesEntry\032/\n\rBalanc" +
      "esEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\001:\0028\0012" +
      "\277\001\n\006Wallet\022:\n\007Deposit\022\025.wallet.WalletReq" +
      "uest\032\026.wallet.WalletResponse\"\000\022;\n\010Withdr" +
      "aw\022\025.wallet.WalletRequest\032\026.wallet.Walle" +
      "tResponse\"\000\022<\n\007Balance\022\026.wallet.BalanceR" +
      "equest\032\027.wallet.BalanceResponse\"\000B\037\n\016bp." +
      "wallet.demoB\013WalletProtoP\001b\006proto3"
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
        }, assigner);
    internal_static_wallet_WalletRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wallet_WalletRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_WalletRequest_descriptor,
        new java.lang.String[] { "User", "Amount", "Currency", });
    internal_static_wallet_WalletResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wallet_WalletResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_WalletResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_wallet_BalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wallet_BalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BalanceRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_wallet_BalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wallet_BalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BalanceResponse_descriptor,
        new java.lang.String[] { "Balances", });
    internal_static_wallet_BalanceResponse_BalancesEntry_descriptor =
      internal_static_wallet_BalanceResponse_descriptor.getNestedTypes().get(0);
    internal_static_wallet_BalanceResponse_BalancesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wallet_BalanceResponse_BalancesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
