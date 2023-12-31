// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.scvi.flatbuffers.Titan.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class TransformNode extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TransformNode getRootAsTransformNode(ByteBuffer _bb) { return getRootAsTransformNode(_bb, new TransformNode()); }
  public static TransformNode getRootAsTransformNode(ByteBuffer _bb, TransformNode obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TransformNode __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Transform transform() { return transform(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Transform()); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Transform transform(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Transform obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 scalePivot() { return scalePivot(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3()); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 scalePivot(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 rotatePivot() { return rotatePivot(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3()); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 rotatePivot(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Vec3 obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public int parentIdx() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : -1; }
  public int rigIdx() { int o = __offset(14); return o != 0 ? bb.getInt(o + bb_pos) : -1; }
  public String effectNode() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer effectNodeAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer effectNodeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public long type() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static void startTransformNode(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addTransform(FlatBufferBuilder builder, int transformOffset) { builder.addOffset(1, transformOffset, 0); }
  public static void addScalePivot(FlatBufferBuilder builder, int scalePivotOffset) { builder.addStruct(2, scalePivotOffset, 0); }
  public static void addRotatePivot(FlatBufferBuilder builder, int rotatePivotOffset) { builder.addStruct(3, rotatePivotOffset, 0); }
  public static void addParentIdx(FlatBufferBuilder builder, int parentIdx) { builder.addInt(4, parentIdx, -1); }
  public static void addRigIdx(FlatBufferBuilder builder, int rigIdx) { builder.addInt(5, rigIdx, -1); }
  public static void addEffectNode(FlatBufferBuilder builder, int effectNodeOffset) { builder.addOffset(6, effectNodeOffset, 0); }
  public static void addType(FlatBufferBuilder builder, long type) { builder.addInt(7, (int) type, (int) 0L); }
  public static int endTransformNode(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TransformNode get(int j) { return get(new TransformNode(), j); }
    public TransformNode get(TransformNode obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

