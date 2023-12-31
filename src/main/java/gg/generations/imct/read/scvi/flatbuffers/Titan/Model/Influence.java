// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.scvi.flatbuffers.Titan.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Influence extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Influence getRootAsInfluence(ByteBuffer _bb) { return getRootAsInfluence(_bb, new Influence()); }
  public static Influence getRootAsInfluence(ByteBuffer _bb, Influence obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Influence __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long index() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public float scale() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createInfluence(FlatBufferBuilder builder,
      long index,
      float scale) {
    builder.startTable(2);
    Influence.addScale(builder, scale);
    Influence.addIndex(builder, index);
    return Influence.endInfluence(builder);
  }

  public static void startInfluence(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addIndex(FlatBufferBuilder builder, long index) { builder.addInt(0, (int) index, (int) 0L); }
  public static void addScale(FlatBufferBuilder builder, float scale) { builder.addFloat(1, scale, 0.0f); }
  public static int endInfluence(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Influence get(int j) { return get(new Influence(), j); }
    public Influence get(Influence obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

