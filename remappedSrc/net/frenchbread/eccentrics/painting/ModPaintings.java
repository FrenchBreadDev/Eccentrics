package net.frenchbread.eccentrics.painting;


import net.frenchbread.eccentrics.EccentricsMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {
    public static final PaintingVariant FRENCHBREAD = registerPainting("frenchbread", new PaintingVariant(16, 32));
    public static final PaintingVariant ECCENTRIC = registerPainting("eccentric", new PaintingVariant(16, 16));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(EccentricsMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        EccentricsMod.LOGGER.debug("Registering Paintings for " + EccentricsMod.MOD_ID);
    }
}