// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.scvi.flatbuffers.Titan.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Lod extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Lod getRootAsLod(ByteBuffer _bb) { return getRootAsLod(_bb, new Lod()); }
  public static Lod getRootAsLod(ByteBuffer _bb, Lod obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Lod __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex index(int j) { return index(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex(), j); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex index(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int indexLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex.Vector indexVector() { return indexVector(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex.Vector()); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex.Vector indexVector(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.LodIndex.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String lodType() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer lodTypeAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer lodTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createLod(FlatBufferBuilder builder,
      int indexOffset,
      int lodTypeOffset) {
    builder.startTable(2);
    Lod.addLodType(builder, lodTypeOffset);
    Lod.addIndex(builder, indexOffset);
    return Lod.endLod(builder);
  }

  public static void startLod(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addIndex(FlatBufferBuilder builder, int indexOffset) { builder.addOffset(0, indexOffset, 0); }
  public static int createIndexVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIndexVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addLodType(FlatBufferBuilder builder, int lodTypeOffset) { builder.addOffset(1, lodTypeOffset, 0); }
  public static int endLod(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Lod get(int j) { return get(new Lod(), j); }
    public Lod get(Lod obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

