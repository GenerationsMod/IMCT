// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.la.flatbuffers.Hayabusa.Model;

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
public final class TextureParameter extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TextureParameter getRootAsTextureParameter(ByteBuffer _bb) { return getRootAsTextureParameter(_bb, new TextureParameter()); }
  public static TextureParameter getRootAsTextureParameter(ByteBuffer _bb, TextureParameter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TextureParameter __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String propertyBinding() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer propertyBindingAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer propertyBindingInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String textureFile() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer textureFileAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer textureFileInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public long textureSlot() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createTextureParameter(FlatBufferBuilder builder,
      int propertyBindingOffset,
      int textureFileOffset,
      long textureSlot) {
    builder.startTable(3);
    TextureParameter.addTextureSlot(builder, textureSlot);
    TextureParameter.addTextureFile(builder, textureFileOffset);
    TextureParameter.addPropertyBinding(builder, propertyBindingOffset);
    return TextureParameter.endTextureParameter(builder);
  }

  public static void startTextureParameter(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addPropertyBinding(FlatBufferBuilder builder, int propertyBindingOffset) { builder.addOffset(0, propertyBindingOffset, 0); }
  public static void addTextureFile(FlatBufferBuilder builder, int textureFileOffset) { builder.addOffset(1, textureFileOffset, 0); }
  public static void addTextureSlot(FlatBufferBuilder builder, long textureSlot) { builder.addInt(2, (int) textureSlot, (int) 0L); }
  public static int endTextureParameter(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TextureParameter get(int j) { return get(new TextureParameter(), j); }
    public TextureParameter get(TextureParameter obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
