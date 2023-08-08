// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.la.flatbuffers.Hayabusa.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class SamplerState extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static SamplerState getRootAsSamplerState(ByteBuffer _bb) { return getRootAsSamplerState(_bb, new SamplerState()); }
  public static SamplerState getRootAsSamplerState(ByteBuffer _bb, SamplerState obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SamplerState __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long samplerState0() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState1() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState2() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState5() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState6() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState7() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long samplerState8() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long repeatU() { int o = __offset(22); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long repeatV() { int o = __offset(24); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long repeatW() { int o = __offset(26); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public RGBA borderColor() { return borderColor(new gg.generations.imct.la.flatbuffers.Hayabusa.Model.RGBA()); } // FIXME: imported SV RGBA. may be broken?
  public RGBA borderColor(gg.generations.imct.la.flatbuffers.Hayabusa.Model.RGBA obj) { int o = __offset(28); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startSamplerState(FlatBufferBuilder builder) { builder.startTable(13); }
  public static void addSamplerState0(FlatBufferBuilder builder, long samplerState0) { builder.addInt(0, (int) samplerState0, (int) 0L); }
  public static void addSamplerState1(FlatBufferBuilder builder, long samplerState1) { builder.addInt(1, (int) samplerState1, (int) 0L); }
  public static void addSamplerState2(FlatBufferBuilder builder, long samplerState2) { builder.addInt(2, (int) samplerState2, (int) 0L); }
  public static void addSamplerState3(FlatBufferBuilder builder, long samplerState3) { builder.addInt(3, (int) samplerState3, (int) 0L); }
  public static void addSamplerState4(FlatBufferBuilder builder, long samplerState4) { builder.addInt(4, (int) samplerState4, (int) 0L); }
  public static void addSamplerState5(FlatBufferBuilder builder, long samplerState5) { builder.addInt(5, (int) samplerState5, (int) 0L); }
  public static void addSamplerState6(FlatBufferBuilder builder, long samplerState6) { builder.addInt(6, (int) samplerState6, (int) 0L); }
  public static void addSamplerState7(FlatBufferBuilder builder, long samplerState7) { builder.addInt(7, (int) samplerState7, (int) 0L); }
  public static void addSamplerState8(FlatBufferBuilder builder, long samplerState8) { builder.addInt(8, (int) samplerState8, (int) 0L); }
  public static void addRepeatU(FlatBufferBuilder builder, long repeatU) { builder.addInt(9, (int) repeatU, (int) 0L); }
  public static void addRepeatV(FlatBufferBuilder builder, long repeatV) { builder.addInt(10, (int) repeatV, (int) 0L); }
  public static void addRepeatW(FlatBufferBuilder builder, long repeatW) { builder.addInt(11, (int) repeatW, (int) 0L); }
  public static void addBorderColor(FlatBufferBuilder builder, int borderColorOffset) { builder.addStruct(12, borderColorOffset, 0); }
  public static int endSamplerState(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SamplerState get(int j) { return get(new SamplerState(), j); }
    public SamplerState get(SamplerState obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

