package com.sohatuy.medieval_structures.datagen;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.sohatuy.medieval_structures.MedievalStructuresMod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModPoiTagsProvider extends PoiTypeTagsProvider {

    public ModPoiTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, MedievalStructuresMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .addOptional(ResourceLocation.fromNamespaceAndPath(MedievalStructuresMod.MODID, "hermit_poi"));
    }
}