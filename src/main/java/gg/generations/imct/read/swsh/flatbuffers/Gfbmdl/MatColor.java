// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.swsh.flatbuffers.Gfbmdl;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MatColor extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MatColor getRootAsMatColor(ByteBuffer _bb) { return getRootAsMatColor(_bb, new MatColor()); }
  public static MatColor getRootAsMatColor(ByteBuffer _bb, MatColor obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MatColor __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.ColorRGB32 color() { return color(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.ColorRGB32()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.ColorRGB32 color(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.ColorRGB32 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startMatColor(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addColor(FlatBufferBuilder builder, int colorOffset) { builder.addStruct(1, colorOffset, 0); }
  public static int endMatColor(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MatColor get(int j) { return get(new MatColor(), j); }
    public MatColor get(MatColor obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
