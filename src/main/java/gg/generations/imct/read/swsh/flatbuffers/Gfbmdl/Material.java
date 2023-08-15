// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.swsh.flatbuffers.Gfbmdl;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Material extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static Material getRootAsMaterial(ByteBuffer _bb) { return getRootAsMaterial(_bb, new Material()); }
  public static Material getRootAsMaterial(ByteBuffer _bb, Material obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Material __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String shaderGroup() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer shaderGroupAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer shaderGroupInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public int renderLayer() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int unknown1() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int unknown2() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int parameter1() { int o = __offset(14); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int parameter2() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int parameter3() { int o = __offset(18); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int shaderIndex() { int o = __offset(20); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int parameter4() { int o = __offset(22); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int parameter5() { int o = __offset(24); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap textureMaps(int j) { return textureMaps(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap textureMaps(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap obj, int j) { int o = __offset(26); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int textureMapsLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap.Vector textureMapsVector() { return textureMapsVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap.Vector textureMapsVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.TextureMap.Vector obj) { int o = __offset(26); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch switches(int j) { return switches(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch switches(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch obj, int j) { int o = __offset(28); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int switchesLength() { int o = __offset(28); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector switchesVector() { return switchesVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector switchesVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatSwitch.Vector obj) { int o = __offset(28); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat values(int j) { return values(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat values(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat obj, int j) { int o = __offset(30); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(30); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat.Vector valuesVector() { return valuesVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat.Vector valuesVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatFloat.Vector obj) { int o = __offset(30); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor colors(int j) { return colors(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor(), j); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor colors(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor obj, int j) { int o = __offset(32); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int colorsLength() { int o = __offset(32); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector colorsVector() { return colorsVector(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector colorsVector(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MatColor.Vector obj) { int o = __offset(32); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public int unknown3() { int o = __offset(34); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int unknown4() { int o = __offset(36); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int unknown5() { int o = __offset(38); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int unknown6() { int o = __offset(40); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public int unknown7() { int o = __offset(42); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MaterialCommon common() { return common(new gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MaterialCommon()); }
  public gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MaterialCommon common(gg.generations.imct.read.swsh.flatbuffers.Gfbmdl.MaterialCommon obj) { int o = __offset(44); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createMaterial(FlatBufferBuilder builder,
      int nameOffset,
      int shaderGroupOffset,
      int renderLayer,
      int unknown1,
      int unknown2,
      int parameter1,
      int parameter2,
      int parameter3,
      int shaderIndex,
      int parameter4,
      int parameter5,
      int textureMapsOffset,
      int switchesOffset,
      int valuesOffset,
      int colorsOffset,
      int unknown3,
      int unknown4,
      int unknown5,
      int unknown6,
      int unknown7,
      int commonOffset) {
    builder.startTable(21);
    Material.addCommon(builder, commonOffset);
    Material.addColors(builder, colorsOffset);
    Material.addValues(builder, valuesOffset);
    Material.addSwitches(builder, switchesOffset);
    Material.addTextureMaps(builder, textureMapsOffset);
    Material.addParameter5(builder, parameter5);
    Material.addParameter4(builder, parameter4);
    Material.addShaderIndex(builder, shaderIndex);
    Material.addParameter3(builder, parameter3);
    Material.addParameter2(builder, parameter2);
    Material.addParameter1(builder, parameter1);
    Material.addRenderLayer(builder, renderLayer);
    Material.addShaderGroup(builder, shaderGroupOffset);
    Material.addName(builder, nameOffset);
    Material.addUnknown7(builder, unknown7);
    Material.addUnknown6(builder, unknown6);
    Material.addUnknown5(builder, unknown5);
    Material.addUnknown4(builder, unknown4);
    Material.addUnknown3(builder, unknown3);
    Material.addUnknown2(builder, unknown2);
    Material.addUnknown1(builder, unknown1);
    return Material.endMaterial(builder);
  }

  public static void startMaterial(FlatBufferBuilder builder) { builder.startTable(21); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addShaderGroup(FlatBufferBuilder builder, int shaderGroupOffset) { builder.addOffset(1, shaderGroupOffset, 0); }
  public static void addRenderLayer(FlatBufferBuilder builder, int renderLayer) { builder.addInt(2, renderLayer, 0); }
  public static void addUnknown1(FlatBufferBuilder builder, int unknown1) { builder.addByte(3, (byte) unknown1, (byte) 0); }
  public static void addUnknown2(FlatBufferBuilder builder, int unknown2) { builder.addByte(4, (byte) unknown2, (byte) 0); }
  public static void addParameter1(FlatBufferBuilder builder, int parameter1) { builder.addInt(5, parameter1, 0); }
  public static void addParameter2(FlatBufferBuilder builder, int parameter2) { builder.addInt(6, parameter2, 0); }
  public static void addParameter3(FlatBufferBuilder builder, int parameter3) { builder.addInt(7, parameter3, 0); }
  public static void addShaderIndex(FlatBufferBuilder builder, int shaderIndex) { builder.addInt(8, shaderIndex, 0); }
  public static void addParameter4(FlatBufferBuilder builder, int parameter4) { builder.addInt(9, parameter4, 0); }
  public static void addParameter5(FlatBufferBuilder builder, int parameter5) { builder.addInt(10, parameter5, 0); }
  public static void addTextureMaps(FlatBufferBuilder builder, int textureMapsOffset) { builder.addOffset(11, textureMapsOffset, 0); }
  public static int createTextureMapsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTextureMapsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSwitches(FlatBufferBuilder builder, int switchesOffset) { builder.addOffset(12, switchesOffset, 0); }
  public static int createSwitchesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSwitchesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(13, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addColors(FlatBufferBuilder builder, int colorsOffset) { builder.addOffset(14, colorsOffset, 0); }
  public static int createColorsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startColorsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnknown3(FlatBufferBuilder builder, int unknown3) { builder.addByte(15, (byte) unknown3, (byte) 0); }
  public static void addUnknown4(FlatBufferBuilder builder, int unknown4) { builder.addByte(16, (byte) unknown4, (byte) 0); }
  public static void addUnknown5(FlatBufferBuilder builder, int unknown5) { builder.addByte(17, (byte) unknown5, (byte) 0); }
  public static void addUnknown6(FlatBufferBuilder builder, int unknown6) { builder.addByte(18, (byte) unknown6, (byte) 0); }
  public static void addUnknown7(FlatBufferBuilder builder, int unknown7) { builder.addByte(19, (byte) unknown7, (byte) 0); }
  public static void addCommon(FlatBufferBuilder builder, int commonOffset) { builder.addOffset(20, commonOffset, 0); }
  public static int endMaterial(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Material get(int j) { return get(new Material(), j); }
    public Material get(Material obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
