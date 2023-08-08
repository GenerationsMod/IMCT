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
public final class MaterialPass extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MaterialPass getRootAsMaterialPass(ByteBuffer _bb) { return getRootAsMaterialPass(_bb, new MaterialPass()); }
  public static MaterialPass getRootAsMaterialPass(ByteBuffer _bb, MaterialPass obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MaterialPass __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader shaders(int j) { return shaders(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader shaders(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int shadersLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader.Vector shadersVector() { return shadersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader.Vector shadersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Shader.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter textureParameters(int j) { return textureParameters(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter textureParameters(gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int textureParametersLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter.Vector textureParametersVector() { return textureParametersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter.Vector textureParametersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.TextureParameter.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState samplers(int j) { return samplers(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState samplers(gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int samplersLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState.Vector samplersVector() { return samplersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState.Vector samplersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.SamplerState.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter floatParameters(int j) { return floatParameters(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter floatParameters(gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int floatParametersLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter.Vector floatParametersVector() { return floatParametersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter.Vector floatParametersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.FloatParameter.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk5(int j) { int o = __offset(14); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk5Length() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk5Vector() { return unk5Vector(new StringVector()); }
  public StringVector unk5Vector(StringVector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter float4LightParameters(int j) { return float4LightParameters(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter float4LightParameters(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter obj, int j) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int float4LightParametersLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector float4LightParametersVector() { return float4LightParametersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector float4LightParametersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector obj) { int o = __offset(16); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter float4Parameters(int j) { return float4Parameters(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter float4Parameters(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int float4ParametersLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector float4ParametersVector() { return float4ParametersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector float4ParametersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Float4Parameter.Vector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk8(int j) { int o = __offset(20); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk8Length() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk8Vector() { return unk8Vector(new StringVector()); }
  public StringVector unk8Vector(StringVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter intParameters(int j) { return intParameters(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter(), j); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter intParameters(gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter obj, int j) { int o = __offset(22); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int intParametersLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter.Vector intParametersVector() { return intParametersVector(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter.Vector()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter.Vector intParametersVector(gg.generations.imct.la.flatbuffers.Hayabusa.Model.IntParameter.Vector obj) { int o = __offset(22); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk10(int j) { int o = __offset(24); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk10Length() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk10Vector() { return unk10Vector(new StringVector()); }
  public StringVector unk10Vector(StringVector obj) { int o = __offset(24); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk11(int j) { int o = __offset(26); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk11Length() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk11Vector() { return unk11Vector(new StringVector()); }
  public StringVector unk11Vector(StringVector obj) { int o = __offset(26); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String unk12(int j) { int o = __offset(28); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int unk12Length() { int o = __offset(28); return o != 0 ? __vector_len(o) : 0; }
  public StringVector unk12Vector() { return unk12Vector(new StringVector()); }
  public StringVector unk12Vector(StringVector obj) { int o = __offset(28); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.WriteMask writeMask() { return writeMask(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.WriteMask()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.WriteMask writeMask(gg.generations.imct.la.flatbuffers.Hayabusa.Model.WriteMask obj) { int o = __offset(30); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Int_Extra intExtra() { return intExtra(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.Int_Extra()); }
  public gg.generations.imct.la.flatbuffers.Hayabusa.Model.Int_Extra intExtra(gg.generations.imct.la.flatbuffers.Hayabusa.Model.Int_Extra obj) { int o = __offset(32); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String alphaType() { int o = __offset(34); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer alphaTypeAsByteBuffer() { return __vector_as_bytebuffer(34, 1); }
  public ByteBuffer alphaTypeInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 34, 1); }

  public static int createMaterialPass(FlatBufferBuilder builder,
      int nameOffset,
      int shadersOffset,
      int textureParametersOffset,
      int samplersOffset,
      int floatParametersOffset,
      int unk5Offset,
      int float4LightParametersOffset,
      int float4ParametersOffset,
      int unk8Offset,
      int intParametersOffset,
      int unk10Offset,
      int unk11Offset,
      int unk12Offset,
      int writeMaskOffset,
      int intExtraOffset,
      int alphaTypeOffset) {
    builder.startTable(16);
    MaterialPass.addAlphaType(builder, alphaTypeOffset);
    MaterialPass.addIntExtra(builder, intExtraOffset);
    MaterialPass.addWriteMask(builder, writeMaskOffset);
    MaterialPass.addUnk12(builder, unk12Offset);
    MaterialPass.addUnk11(builder, unk11Offset);
    MaterialPass.addUnk10(builder, unk10Offset);
    MaterialPass.addIntParameters(builder, intParametersOffset);
    MaterialPass.addUnk8(builder, unk8Offset);
    MaterialPass.addFloat4Parameters(builder, float4ParametersOffset);
    MaterialPass.addFloat4LightParameters(builder, float4LightParametersOffset);
    MaterialPass.addUnk5(builder, unk5Offset);
    MaterialPass.addFloatParameters(builder, floatParametersOffset);
    MaterialPass.addSamplers(builder, samplersOffset);
    MaterialPass.addTextureParameters(builder, textureParametersOffset);
    MaterialPass.addShaders(builder, shadersOffset);
    MaterialPass.addName(builder, nameOffset);
    return MaterialPass.endMaterialPass(builder);
  }

  public static void startMaterialPass(FlatBufferBuilder builder) { builder.startTable(16); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addShaders(FlatBufferBuilder builder, int shadersOffset) { builder.addOffset(1, shadersOffset, 0); }
  public static int createShadersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startShadersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addTextureParameters(FlatBufferBuilder builder, int textureParametersOffset) { builder.addOffset(2, textureParametersOffset, 0); }
  public static int createTextureParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startTextureParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSamplers(FlatBufferBuilder builder, int samplersOffset) { builder.addOffset(3, samplersOffset, 0); }
  public static int createSamplersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSamplersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFloatParameters(FlatBufferBuilder builder, int floatParametersOffset) { builder.addOffset(4, floatParametersOffset, 0); }
  public static int createFloatParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFloatParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk5(FlatBufferBuilder builder, int unk5Offset) { builder.addOffset(5, unk5Offset, 0); }
  public static int createUnk5Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk5Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFloat4LightParameters(FlatBufferBuilder builder, int float4LightParametersOffset) { builder.addOffset(6, float4LightParametersOffset, 0); }
  public static int createFloat4LightParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFloat4LightParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFloat4Parameters(FlatBufferBuilder builder, int float4ParametersOffset) { builder.addOffset(7, float4ParametersOffset, 0); }
  public static int createFloat4ParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFloat4ParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk8(FlatBufferBuilder builder, int unk8Offset) { builder.addOffset(8, unk8Offset, 0); }
  public static int createUnk8Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk8Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIntParameters(FlatBufferBuilder builder, int intParametersOffset) { builder.addOffset(9, intParametersOffset, 0); }
  public static int createIntParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIntParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk10(FlatBufferBuilder builder, int unk10Offset) { builder.addOffset(10, unk10Offset, 0); }
  public static int createUnk10Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk10Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk11(FlatBufferBuilder builder, int unk11Offset) { builder.addOffset(11, unk11Offset, 0); }
  public static int createUnk11Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk11Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUnk12(FlatBufferBuilder builder, int unk12Offset) { builder.addOffset(12, unk12Offset, 0); }
  public static int createUnk12Vector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUnk12Vector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWriteMask(FlatBufferBuilder builder, int writeMaskOffset) { builder.addOffset(13, writeMaskOffset, 0); }
  public static void addIntExtra(FlatBufferBuilder builder, int intExtraOffset) { builder.addOffset(14, intExtraOffset, 0); }
  public static void addAlphaType(FlatBufferBuilder builder, int alphaTypeOffset) { builder.addOffset(15, alphaTypeOffset, 0); }
  public static int endMaterialPass(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MaterialPass get(int j) { return get(new MaterialPass(), j); }
    public MaterialPass get(MaterialPass obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

