// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.scvi.flatbuffers.Titan.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class TRMBF extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TRMBF getRootAsTRMBF(ByteBuffer _bb) { return getRootAsTRMBF(_bb, new TRMBF()); }
  public static TRMBF getRootAsTRMBF(ByteBuffer _bb, TRMBF obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TRMBF __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long unused() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer buffers(int j) { return buffers(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer(), j); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer buffers(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int buffersLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer.Vector buffersVector() { return buffersVector(new gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer.Vector()); }
  public gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer.Vector buffersVector(gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Buffer.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createTRMBF(FlatBufferBuilder builder,
      long unused,
      int buffersOffset) {
    builder.startTable(2);
    TRMBF.addBuffers(builder, buffersOffset);
    TRMBF.addUnused(builder, unused);
    return TRMBF.endTRMBF(builder);
  }

  public static void startTRMBF(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addUnused(FlatBufferBuilder builder, long unused) { builder.addInt(0, (int) unused, (int) 0L); }
  public static void addBuffers(FlatBufferBuilder builder, int buffersOffset) { builder.addOffset(1, buffersOffset, 0); }
  public static int createBuffersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBuffersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTRMBF(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishTRMBFBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedTRMBFBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TRMBF get(int j) { return get(new TRMBF(), j); }
    public TRMBF get(TRMBF obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

