package io.github.flemmli97.flan.mixin;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(SimpleJsonResourceReloadListener.class)
public interface SimpleJsonResourceReloadListenerAccess {

    @Accessor("ops")
    @Mutable
    void setOps(DynamicOps<JsonElement> ops);
}
