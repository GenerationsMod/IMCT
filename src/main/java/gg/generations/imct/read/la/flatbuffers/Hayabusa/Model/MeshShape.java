// automatically generated by the FlatBuffers compiler, do not modify

package gg.generations.imct.read.la.flatbuffers.Hayabusa.Model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MeshShape extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_3_3(); }
  public static MeshShape getRootAsMeshShape(ByteBuffer _bb) { return getRootAsMeshShape(_bb, new MeshShape()); }
  public static MeshShape getRootAsMeshShape(ByteBuffer _bb, MeshShape obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MeshShape __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String meshShapeName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer meshShapeNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer meshShapeNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.AABB bounds() { return bounds(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.AABB()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.AABB bounds(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.AABB obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public long indexLayoutFormat() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout vertexLayout(int j) { return vertexLayout(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout(), j); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout vertexLayout(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int vertexLayoutLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout.Vector vertexLayoutVector() { return vertexLayoutVector(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout.Vector()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout.Vector vertexLayoutVector(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.VertexAttributeLayout.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh subMeshes(int j) { return subMeshes(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh(), j); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh subMeshes(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int subMeshesLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh.Vector subMeshesVector() { return subMeshesVector(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh.Vector()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh.Vector subMeshesVector(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.SubMesh.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public long res0() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res1() { int o = __offset(16); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res2() { int o = __offset(18); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long res3() { int o = __offset(20); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Sphere sphericalBounds() { return sphericalBounds(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Sphere()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Sphere sphericalBounds(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.Sphere obj) { int o = __offset(22); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight boneWeights(int j) { return boneWeights(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight(), j); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight boneWeights(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight obj, int j) { int o = __offset(24); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int boneWeightsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight.Vector boneWeightsVector() { return boneWeightsVector(new gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight.Vector()); }
  public gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight.Vector boneWeightsVector(gg.generations.imct.read.la.flatbuffers.Hayabusa.Model.BoneWeight.Vector obj) { int o = __offset(24); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String meshUnk7() { int o = __offset(26); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer meshUnk7AsByteBuffer() { return __vector_as_bytebuffer(26, 1); }
  public ByteBuffer meshUnk7InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 26, 1); }
  public String meshName() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer meshNameAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public ByteBuffer meshNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 28, 1); }

  public static void startMeshShape(FlatBufferBuilder builder) { builder.startTable(13); }
  public static void addMeshShapeName(FlatBufferBuilder builder, int meshShapeNameOffset) { builder.addOffset(0, meshShapeNameOffset, 0); }
  public static void addBounds(FlatBufferBuilder builder, int boundsOffset) { builder.addOffset(1, boundsOffset, 0); }
  public static void addIndexLayoutFormat(FlatBufferBuilder builder, long indexLayoutFormat) { builder.addInt(2, (int) indexLayoutFormat, (int) 0L); }
  public static void addVertexLayout(FlatBufferBuilder builder, int vertexLayoutOffset) { builder.addOffset(3, vertexLayoutOffset, 0); }
  public static int createVertexLayoutVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVertexLayoutVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSubMeshes(FlatBufferBuilder builder, int subMeshesOffset) { builder.addOffset(4, subMeshesOffset, 0); }
  public static int createSubMeshesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSubMeshesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addRes0(FlatBufferBuilder builder, long res0) { builder.addInt(5, (int) res0, (int) 0L); }
  public static void addRes1(FlatBufferBuilder builder, long res1) { builder.addInt(6, (int) res1, (int) 0L); }
  public static void addRes2(FlatBufferBuilder builder, long res2) { builder.addInt(7, (int) res2, (int) 0L); }
  public static void addRes3(FlatBufferBuilder builder, long res3) { builder.addInt(8, (int) res3, (int) 0L); }
  public static void addSphericalBounds(FlatBufferBuilder builder, int sphericalBoundsOffset) { builder.addStruct(9, sphericalBoundsOffset, 0); }
  public static void addBoneWeights(FlatBufferBuilder builder, int boneWeightsOffset) { builder.addOffset(10, boneWeightsOffset, 0); }
  public static int createBoneWeightsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBoneWeightsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addMeshUnk7(FlatBufferBuilder builder, int meshUnk7Offset) { builder.addOffset(11, meshUnk7Offset, 0); }
  public static void addMeshName(FlatBufferBuilder builder, int meshNameOffset) { builder.addOffset(12, meshNameOffset, 0); }
  public static int endMeshShape(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MeshShape get(int j) { return get(new MeshShape(), j); }
    public MeshShape get(MeshShape obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

