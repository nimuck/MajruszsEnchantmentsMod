package com.wonderfulworld.structures;

import com.mojang.serialization.Codec;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IglooPieces;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class KremowkaStructure extends Structure< NoFeatureConfig > {
	public KremowkaStructure() {
		super( NoFeatureConfig.field_236558_a_ );
	}

	public Structure.IStartFactory< NoFeatureConfig > getStartFactory() {
		return KremowkaStructure.Start::new;
	}

	public static class Start extends StructureStart<NoFeatureConfig> {
		public Start( Structure<NoFeatureConfig> p_i225806_1_, int p_i225806_2_, int p_i225806_3_, MutableBoundingBox p_i225806_4_, int p_i225806_5_, long p_i225806_6_) {
			super(p_i225806_1_, p_i225806_2_, p_i225806_3_, p_i225806_4_, p_i225806_5_, p_i225806_6_);
		}

		public void func_230364_a_( DynamicRegistries p_230364_1_, ChunkGenerator p_230364_2_, TemplateManager p_230364_3_, int p_230364_4_, int p_230364_5_, Biome p_230364_6_, NoFeatureConfig p_230364_7_) {
			int i = p_230364_4_ * 16;
			int j = p_230364_5_ * 16;
			BlockPos blockpos = new BlockPos(i, 90, j);
			Rotation rotation = Rotation.randomRotation(this.rand);
			IglooPieces.func_236991_a_(p_230364_3_, blockpos, rotation, this.components, this.rand);
			this.recalculateStructureSize();
		}
	}
}
