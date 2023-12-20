// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.scvi.flatbuffers.Titan.Model.Animaton;

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
public final class TrackMaterialChannels extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static TrackMaterialChannels getRootAsTrackMaterialChannels(ByteBuffer _bb) { return getRootAsTrackMaterialChannels(_bb, new TrackMaterialChannels()); }
  public static TrackMaterialChannels getRootAsTrackMaterialChannels(ByteBuffer _bb, TrackMaterialChannels obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public TrackMaterialChannels __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public TrackMaterialValueList red() { return red(new TrackMaterialValueList()); }
  public TrackMaterialValueList red(TrackMaterialValueList obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public TrackMaterialValueList green() { return green(new TrackMaterialValueList()); }
  public TrackMaterialValueList green(TrackMaterialValueList obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public TrackMaterialValueList blue() { return blue(new TrackMaterialValueList()); }
  public TrackMaterialValueList blue(TrackMaterialValueList obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public TrackMaterialValueList alpha() { return alpha(new TrackMaterialValueList()); }
  public TrackMaterialValueList alpha(TrackMaterialValueList obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createTrackMaterialChannels(FlatBufferBuilder builder,
      int redOffset,
      int greenOffset,
      int blueOffset,
      int alphaOffset) {
    builder.startTable(4);
    TrackMaterialChannels.addAlpha(builder, alphaOffset);
    TrackMaterialChannels.addBlue(builder, blueOffset);
    TrackMaterialChannels.addGreen(builder, greenOffset);
    TrackMaterialChannels.addRed(builder, redOffset);
    return TrackMaterialChannels.endTrackMaterialChannels(builder);
  }

  public static void startTrackMaterialChannels(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addRed(FlatBufferBuilder builder, int redOffset) { builder.addOffset(0, redOffset, 0); }
  public static void addGreen(FlatBufferBuilder builder, int greenOffset) { builder.addOffset(1, greenOffset, 0); }
  public static void addBlue(FlatBufferBuilder builder, int blueOffset) { builder.addOffset(2, blueOffset, 0); }
  public static void addAlpha(FlatBufferBuilder builder, int alphaOffset) { builder.addOffset(3, alphaOffset, 0); }
  public static int endTrackMaterialChannels(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public TrackMaterialChannels get(int j) { return get(new TrackMaterialChannels(), j); }
    public TrackMaterialChannels get(TrackMaterialChannels obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
