// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.swsh.flatbuffers.Gfbmdl;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Bone extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Bone getRootAsBone(ByteBuffer _bb) { return getRootAsBone(_bb, new Bone()); }
  public static Bone getRootAsBone(ByteBuffer _bb, Bone obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Bone __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long boneType() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int parent() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public long zero() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean segmentScale() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 scale() { return scale(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 scale(gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 obj) { int o = __offset(14); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 rotation() { return rotation(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 rotation(gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 obj) { int o = __offset(16); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 translation() { return translation(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 translation(gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 obj) { int o = __offset(18); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 radiusStart() { return radiusStart(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 radiusStart(gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 obj) { int o = __offset(20); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 radiusEnd() { return radiusEnd(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 radiusEnd(gg.generations.imct.swsh.flatbuffers.Gfbmdl.Vector3 obj) { int o = __offset(22); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.BoneRigidData rigidCheck() { return rigidCheck(new gg.generations.imct.swsh.flatbuffers.Gfbmdl.BoneRigidData()); }
  public gg.generations.imct.swsh.flatbuffers.Gfbmdl.BoneRigidData rigidCheck(gg.generations.imct.swsh.flatbuffers.Gfbmdl.BoneRigidData obj) { int o = __offset(24); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startBone(FlatBufferBuilder builder) { builder.startTable(11); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addBoneType(FlatBufferBuilder builder, long boneType) { builder.addInt(1, (int) boneType, (int) 0L); }
  public static void addParent(FlatBufferBuilder builder, int parent) { builder.addInt(2, parent, 0); }
  public static void addZero(FlatBufferBuilder builder, long zero) { builder.addInt(3, (int) zero, (int) 0L); }
  public static void addSegmentScale(FlatBufferBuilder builder, boolean segmentScale) { builder.addBoolean(4, segmentScale, false); }
  public static void addScale(FlatBufferBuilder builder, int scaleOffset) { builder.addStruct(5, scaleOffset, 0); }
  public static void addRotation(FlatBufferBuilder builder, int rotationOffset) { builder.addStruct(6, rotationOffset, 0); }
  public static void addTranslation(FlatBufferBuilder builder, int translationOffset) { builder.addStruct(7, translationOffset, 0); }
  public static void addRadiusStart(FlatBufferBuilder builder, int radiusStartOffset) { builder.addStruct(8, radiusStartOffset, 0); }
  public static void addRadiusEnd(FlatBufferBuilder builder, int radiusEndOffset) { builder.addStruct(9, radiusEndOffset, 0); }
  public static void addRigidCheck(FlatBufferBuilder builder, int rigidCheckOffset) { builder.addStruct(10, rigidCheckOffset, 0); }
  public static int endBone(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Bone get(int j) { return get(new Bone(), j); }
    public Bone get(Bone obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

