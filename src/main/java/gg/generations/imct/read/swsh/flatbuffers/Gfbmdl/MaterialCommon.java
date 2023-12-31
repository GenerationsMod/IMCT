// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.swsh.flatbuffers.Gfbmdl;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MaterialCommon extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MaterialCommon getRootAsMaterialCommon(ByteBuffer _bb) { return getRootAsMaterialCommon(_bb, new MaterialCommon()); }
  public static MaterialCommon getRootAsMaterialCommon(ByteBuffer _bb, MaterialCommon obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MaterialCommon __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch switches(int j) { return switches(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch switches(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int switchesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector switchesVector() { return switchesVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector switchesVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt values(int j) { return values(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt values(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt.Vector valuesVector() { return valuesVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt.Vector valuesVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatInt.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor colors(int j) { return colors(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor colors(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int colorsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector colorsVector() { return colorsVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector colorsVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createMaterialCommon(FlatBufferBuilder builder,
      int switchesOffset,
      int valuesOffset,
      int colorsOffset) {
    builder.startTable(3);
    MaterialCommon.addColors(builder, colorsOffset);
    MaterialCommon.addValues(builder, valuesOffset);
    MaterialCommon.addSwitches(builder, switchesOffset);
    return MaterialCommon.endMaterialCommon(builder);
  }

  public static void startMaterialCommon(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addSwitches(FlatBufferBuilder builder, int switchesOffset) { builder.addOffset(0, switchesOffset, 0); }
  public static int createSwitchesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSwitchesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(1, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addColors(FlatBufferBuilder builder, int colorsOffset) { builder.addOffset(2, colorsOffset, 0); }
  public static int createColorsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startColorsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMaterialCommon(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MaterialCommon get(int j) { return get(new MaterialCommon(), j); }
    public MaterialCommon get(MaterialCommon obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

