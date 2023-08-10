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
public final class BoundingBox extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public BoundingBox __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float minX() { return bb.getFloat(bb_pos + 0); }
  public float minY() { return bb.getFloat(bb_pos + 4); }
  public float minZ() { return bb.getFloat(bb_pos + 8); }
  public float maxX() { return bb.getFloat(bb_pos + 12); }
  public float maxY() { return bb.getFloat(bb_pos + 16); }
  public float maxZ() { return bb.getFloat(bb_pos + 20); }

  public static int createBoundingBox(FlatBufferBuilder builder, float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
    builder.prep(4, 24);
    builder.putFloat(maxZ);
    builder.putFloat(maxY);
    builder.putFloat(maxX);
    builder.putFloat(minZ);
    builder.putFloat(minY);
    builder.putFloat(minX);
    return builder.offset();
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public BoundingBox get(int j) { return get(new BoundingBox(), j); }
    public BoundingBox get(BoundingBox obj, int j) {  return obj.__assign(__element(j), bb); }
  }
}

