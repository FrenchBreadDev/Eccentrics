package net.frenchbread.eccentrics.sound;

import net.frenchbread.eccentrics.EccentricsMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent MUSIC_DISC_FRAGMENTS = registerSoundEvent("music_disc_fragments");
    public static SoundEvent MUSIC_DISC_THE_CITADEL = registerSoundEvent("music_disc_the_citadel");
    public static SoundEvent MUSIC_DISC_SYMPHONY_OF_THE_OVERWORLD = registerSoundEvent("music_disc_symphony_of_the_overworld");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(EccentricsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
