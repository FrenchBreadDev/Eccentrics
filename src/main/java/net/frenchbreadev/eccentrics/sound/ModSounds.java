package net.frenchbreadev.eccentrics.sound;

import net.frenchbreadev.eccentrics.EccentricsMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent MUSIC_DISC_FRAGMENTS = registerSoundEvent("music_disc_fragments");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(EccentricsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
