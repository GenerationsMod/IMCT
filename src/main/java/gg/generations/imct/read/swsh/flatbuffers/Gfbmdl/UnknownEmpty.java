// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.swsh.flatbuffers.Gfbmdl;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class UnknownEmpty extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static UnknownEmpty getRootAsUnknownEmpty(ByteBuffer _bb) { return getRootAsUnknownEmpty(_bb, new UnknownEmpty()); }
  public static UnknownEmpty getRootAsUnknownEmpty(ByteBuffer _bb, UnknownEmpty obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public UnknownEmpty __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long unk() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createUnknownEmpty(FlatBufferBuilder builder,
      long unk) {
    builder.startTable(1);
    UnknownEmpty.addUnk(builder, unk);
    return UnknownEmpty.endUnknownEmpty(builder);
  }

  public static void startUnknownEmpty(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addUnk(FlatBufferBuilder builder, long unk) { builder.addInt(0, (int) unk, (int) 0L); }
  public static int endUnknownEmpty(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public UnknownEmpty get(int j) { return get(new UnknownEmpty(), j); }
    public UnknownEmpty get(UnknownEmpty obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
