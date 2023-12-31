// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.la.flatbuffers.Hayabusa.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Transform extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Transform getRootAsTransform(ByteBuffer _bb) { return getRootAsTransform(_bb, new Transform()); }
  public static Transform getRootAsTransform(ByteBuffer _bb, Transform obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Transform __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 scale() { return scale(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 scale(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 rotation() { return rotation(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 rotation(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 translation() { return translation(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 translation(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Vec3 obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startTransform(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addScale(FlatBufferBuilder builder, int scaleOffset) { builder.addStruct(0, scaleOffset, 0); }
  public static void addRotation(FlatBufferBuilder builder, int rotationOffset) { builder.addStruct(1, rotationOffset, 0); }
  public static void addTranslation(FlatBufferBuilder builder, int translationOffset) { builder.addStruct(2, translationOffset, 0); }
  public static int endTransform(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Transform get(int j) { return get(new Transform(), j); }
    public Transform get(Transform obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

