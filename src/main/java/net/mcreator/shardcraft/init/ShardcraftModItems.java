
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shardcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.shardcraft.item.ZombieSkelshardItem;
import net.mcreator.shardcraft.item.SkeletonshardItem;
import net.mcreator.shardcraft.item.DeadshardItem;
import net.mcreator.shardcraft.ShardcraftMod;

public class ShardcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShardcraftMod.MODID);
	public static final RegistryObject<Item> DEADSHARD = REGISTRY.register("deadshard", () -> new DeadshardItem());
	public static final RegistryObject<Item> SKELETONSHARD = REGISTRY.register("skeletonshard", () -> new SkeletonshardItem());
	public static final RegistryObject<Item> ZOMBIE_SKELSHARD = REGISTRY.register("zombie_skelshard", () -> new ZombieSkelshardItem());
}
