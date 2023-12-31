// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.la.flatbuffers.Hayabusa.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class IKControl extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static IKControl getRootAsIKControl(ByteBuffer _bb) { return getRootAsIKControl(_bb, new IKControl()); }
  public static IKControl getRootAsIKControl(ByteBuffer _bb, IKControl obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public IKControl __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String ikName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ikNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer ikNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String ikChainStart() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ikChainStartAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer ikChainStartInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String ikChainEnd() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ikChainEndAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer ikChainEndInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String ikType() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer ikTypeAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer ikTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public long res4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 ikPos() { return ikPos(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 ikPos(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 obj) { int o = __offset(14); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec4 ikRot() { return ikRot(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec4()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec4 ikRot(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec4 obj) { int o = __offset(16); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startIKControl(FlatBufferBuilder builder) { builder.startTable(7); }
  public static void addIkName(FlatBufferBuilder builder, int ikNameOffset) { builder.addOffset(0, ikNameOffset, 0); }
  public static void addIkChainStart(FlatBufferBuilder builder, int ikChainStartOffset) { builder.addOffset(1, ikChainStartOffset, 0); }
  public static void addIkChainEnd(FlatBufferBuilder builder, int ikChainEndOffset) { builder.addOffset(2, ikChainEndOffset, 0); }
  public static void addIkType(FlatBufferBuilder builder, int ikTypeOffset) { builder.addOffset(3, ikTypeOffset, 0); }
  public static void addRes4(FlatBufferBuilder builder, long res4) { builder.addInt(4, (int) res4, (int) 0L); }
  public static void addIkPos(FlatBufferBuilder builder, int ikPosOffset) { builder.addStruct(5, ikPosOffset, 0); }
  public static void addIkRot(FlatBufferBuilder builder, int ikRotOffset) { builder.addStruct(6, ikRotOffset, 0); }
  public static int endIKControl(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public IKControl get(int j) { return get(new IKControl(), j); }
    public IKControl get(IKControl obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

