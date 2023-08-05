package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ExampleMod.EXAMPLE_BLOCK, RenderLayer.getCutout());
		// 如果有半透明纹理，可以将`RenderLayer.getCutout()` 替换为 `RenderLayer.getTranslucent()`。
	}
}