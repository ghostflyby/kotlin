// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock}
 */
public final class IrInlinedFunctionBlock extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock)
    IrInlinedFunctionBlockOrBuilder {
  // Use IrInlinedFunctionBlock.newBuilder() to construct.
  private IrInlinedFunctionBlock(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrInlinedFunctionBlock(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrInlinedFunctionBlock defaultInstance;
  public static IrInlinedFunctionBlock getDefaultInstance() {
    return defaultInstance;
  }

  public IrInlinedFunctionBlock getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrInlinedFunctionBlock(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            inlinedFunctionSymbol_ = input.readInt64();
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = inlinedFunctionFileEntry_.toBuilder();
            }
            inlinedFunctionFileEntry_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inlinedFunctionFileEntry_);
              inlinedFunctionFileEntry_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = base_.toBuilder();
            }
            base_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(base_);
              base_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            inlinedFunctionStartOffset_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            inlinedFunctionEndOffset_ = input.readInt32();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            inlinedFunctionFileEntryId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrInlinedFunctionBlock> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrInlinedFunctionBlock>() {
    public IrInlinedFunctionBlock parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrInlinedFunctionBlock(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrInlinedFunctionBlock> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int INLINED_FUNCTION_SYMBOL_FIELD_NUMBER = 1;
  private long inlinedFunctionSymbol_;
  /**
   * <code>optional int64 inlined_function_symbol = 1;</code>
   */
  public boolean hasInlinedFunctionSymbol() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 inlined_function_symbol = 1;</code>
   */
  public long getInlinedFunctionSymbol() {
    return inlinedFunctionSymbol_;
  }

  public static final int INLINED_FUNCTION_FILE_ENTRY_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlinedFunctionFileEntry_;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
   *
   * <pre>
   * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
   * </pre>
   */
  public boolean hasInlinedFunctionFileEntry() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
   *
   * <pre>
   * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
   * </pre>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry getInlinedFunctionFileEntry() {
    return inlinedFunctionFileEntry_;
  }

  public static final int BASE_FIELD_NUMBER = 3;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
   */
  public boolean hasBase() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock getBase() {
    return base_;
  }

  public static final int INLINED_FUNCTION_START_OFFSET_FIELD_NUMBER = 4;
  private int inlinedFunctionStartOffset_;
  /**
   * <code>required int32 inlined_function_start_offset = 4;</code>
   */
  public boolean hasInlinedFunctionStartOffset() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required int32 inlined_function_start_offset = 4;</code>
   */
  public int getInlinedFunctionStartOffset() {
    return inlinedFunctionStartOffset_;
  }

  public static final int INLINED_FUNCTION_END_OFFSET_FIELD_NUMBER = 5;
  private int inlinedFunctionEndOffset_;
  /**
   * <code>required int32 inlined_function_end_offset = 5;</code>
   */
  public boolean hasInlinedFunctionEndOffset() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>required int32 inlined_function_end_offset = 5;</code>
   */
  public int getInlinedFunctionEndOffset() {
    return inlinedFunctionEndOffset_;
  }

  public static final int INLINED_FUNCTION_FILE_ENTRY_ID_FIELD_NUMBER = 6;
  private int inlinedFunctionFileEntryId_;
  /**
   * <code>optional int32 inlined_function_file_entry_id = 6;</code>
   *
   * <pre>
   * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
   * </pre>
   */
  public boolean hasInlinedFunctionFileEntryId() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional int32 inlined_function_file_entry_id = 6;</code>
   *
   * <pre>
   * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
   * </pre>
   */
  public int getInlinedFunctionFileEntryId() {
    return inlinedFunctionFileEntryId_;
  }

  private void initFields() {
    inlinedFunctionSymbol_ = 0L;
    inlinedFunctionFileEntry_ = org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.getDefaultInstance();
    base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.getDefaultInstance();
    inlinedFunctionStartOffset_ = 0;
    inlinedFunctionEndOffset_ = 0;
    inlinedFunctionFileEntryId_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasBase()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasInlinedFunctionStartOffset()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasInlinedFunctionEndOffset()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasInlinedFunctionFileEntry()) {
      if (!getInlinedFunctionFileEntry().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    if (!getBase().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, inlinedFunctionSymbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, inlinedFunctionFileEntry_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, base_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, inlinedFunctionStartOffset_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt32(5, inlinedFunctionEndOffset_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeInt32(6, inlinedFunctionFileEntryId_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt64Size(1, inlinedFunctionSymbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, inlinedFunctionFileEntry_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(3, base_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(4, inlinedFunctionStartOffset_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(5, inlinedFunctionEndOffset_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(6, inlinedFunctionFileEntryId_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlockOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      inlinedFunctionSymbol_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      inlinedFunctionFileEntry_ = org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000004);
      inlinedFunctionStartOffset_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      inlinedFunctionEndOffset_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      inlinedFunctionFileEntryId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.inlinedFunctionSymbol_ = inlinedFunctionSymbol_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.inlinedFunctionFileEntry_ = inlinedFunctionFileEntry_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.base_ = base_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.inlinedFunctionStartOffset_ = inlinedFunctionStartOffset_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.inlinedFunctionEndOffset_ = inlinedFunctionEndOffset_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.inlinedFunctionFileEntryId_ = inlinedFunctionFileEntryId_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock.getDefaultInstance()) return this;
      if (other.hasInlinedFunctionSymbol()) {
        setInlinedFunctionSymbol(other.getInlinedFunctionSymbol());
      }
      if (other.hasInlinedFunctionFileEntry()) {
        mergeInlinedFunctionFileEntry(other.getInlinedFunctionFileEntry());
      }
      if (other.hasBase()) {
        mergeBase(other.getBase());
      }
      if (other.hasInlinedFunctionStartOffset()) {
        setInlinedFunctionStartOffset(other.getInlinedFunctionStartOffset());
      }
      if (other.hasInlinedFunctionEndOffset()) {
        setInlinedFunctionEndOffset(other.getInlinedFunctionEndOffset());
      }
      if (other.hasInlinedFunctionFileEntryId()) {
        setInlinedFunctionFileEntryId(other.getInlinedFunctionFileEntryId());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasBase()) {
        
        return false;
      }
      if (!hasInlinedFunctionStartOffset()) {
        
        return false;
      }
      if (!hasInlinedFunctionEndOffset()) {
        
        return false;
      }
      if (hasInlinedFunctionFileEntry()) {
        if (!getInlinedFunctionFileEntry().isInitialized()) {
          
          return false;
        }
      }
      if (!getBase().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long inlinedFunctionSymbol_ ;
    /**
     * <code>optional int64 inlined_function_symbol = 1;</code>
     */
    public boolean hasInlinedFunctionSymbol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 inlined_function_symbol = 1;</code>
     */
    public long getInlinedFunctionSymbol() {
      return inlinedFunctionSymbol_;
    }
    /**
     * <code>optional int64 inlined_function_symbol = 1;</code>
     */
    public Builder setInlinedFunctionSymbol(long value) {
      bitField0_ |= 0x00000001;
      inlinedFunctionSymbol_ = value;
      
      return this;
    }
    /**
     * <code>optional int64 inlined_function_symbol = 1;</code>
     */
    public Builder clearInlinedFunctionSymbol() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inlinedFunctionSymbol_ = 0L;
      
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlinedFunctionFileEntry_ = org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.getDefaultInstance();
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public boolean hasInlinedFunctionFileEntry() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry getInlinedFunctionFileEntry() {
      return inlinedFunctionFileEntry_;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder setInlinedFunctionFileEntry(org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inlinedFunctionFileEntry_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder setInlinedFunctionFileEntry(
        org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.Builder builderForValue) {
      inlinedFunctionFileEntry_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder mergeInlinedFunctionFileEntry(org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          inlinedFunctionFileEntry_ != org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.getDefaultInstance()) {
        inlinedFunctionFileEntry_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.newBuilder(inlinedFunctionFileEntry_).mergeFrom(value).buildPartial();
      } else {
        inlinedFunctionFileEntry_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry inlined_function_file_entry = 2;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder clearInlinedFunctionFileEntry() {
      inlinedFunctionFileEntry_ = org.jetbrains.kotlin.backend.common.serialization.proto.FileEntry.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public boolean hasBase() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock getBase() {
      return base_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public Builder setBase(org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock value) {
      if (value == null) {
        throw new NullPointerException();
      }
      base_ = value;

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public Builder setBase(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.Builder builderForValue) {
      base_ = builderForValue.build();

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public Builder mergeBase(org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock value) {
      if (((bitField0_ & 0x00000004) == 0x00000004) &&
          base_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.getDefaultInstance()) {
        base_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.newBuilder(base_).mergeFrom(value).buildPartial();
      } else {
        base_ = value;
      }

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock base = 3;</code>
     */
    public Builder clearBase() {
      base_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrBlock.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    private int inlinedFunctionStartOffset_ ;
    /**
     * <code>required int32 inlined_function_start_offset = 4;</code>
     */
    public boolean hasInlinedFunctionStartOffset() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 inlined_function_start_offset = 4;</code>
     */
    public int getInlinedFunctionStartOffset() {
      return inlinedFunctionStartOffset_;
    }
    /**
     * <code>required int32 inlined_function_start_offset = 4;</code>
     */
    public Builder setInlinedFunctionStartOffset(int value) {
      bitField0_ |= 0x00000008;
      inlinedFunctionStartOffset_ = value;
      
      return this;
    }
    /**
     * <code>required int32 inlined_function_start_offset = 4;</code>
     */
    public Builder clearInlinedFunctionStartOffset() {
      bitField0_ = (bitField0_ & ~0x00000008);
      inlinedFunctionStartOffset_ = 0;
      
      return this;
    }

    private int inlinedFunctionEndOffset_ ;
    /**
     * <code>required int32 inlined_function_end_offset = 5;</code>
     */
    public boolean hasInlinedFunctionEndOffset() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 inlined_function_end_offset = 5;</code>
     */
    public int getInlinedFunctionEndOffset() {
      return inlinedFunctionEndOffset_;
    }
    /**
     * <code>required int32 inlined_function_end_offset = 5;</code>
     */
    public Builder setInlinedFunctionEndOffset(int value) {
      bitField0_ |= 0x00000010;
      inlinedFunctionEndOffset_ = value;
      
      return this;
    }
    /**
     * <code>required int32 inlined_function_end_offset = 5;</code>
     */
    public Builder clearInlinedFunctionEndOffset() {
      bitField0_ = (bitField0_ & ~0x00000010);
      inlinedFunctionEndOffset_ = 0;
      
      return this;
    }

    private int inlinedFunctionFileEntryId_ ;
    /**
     * <code>optional int32 inlined_function_file_entry_id = 6;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public boolean hasInlinedFunctionFileEntryId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 inlined_function_file_entry_id = 6;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public int getInlinedFunctionFileEntryId() {
      return inlinedFunctionFileEntryId_;
    }
    /**
     * <code>optional int32 inlined_function_file_entry_id = 6;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder setInlinedFunctionFileEntryId(int value) {
      bitField0_ |= 0x00000020;
      inlinedFunctionFileEntryId_ = value;
      
      return this;
    }
    /**
     * <code>optional int32 inlined_function_file_entry_id = 6;</code>
     *
     * <pre>
     * Required: either `inlined_function_file_entry` or `inlined_function_file_entry_id` is present.
     * </pre>
     */
    public Builder clearInlinedFunctionFileEntryId() {
      bitField0_ = (bitField0_ & ~0x00000020);
      inlinedFunctionFileEntryId_ = 0;
      
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock)
  }

  static {
    defaultInstance = new IrInlinedFunctionBlock(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrInlinedFunctionBlock)
}
