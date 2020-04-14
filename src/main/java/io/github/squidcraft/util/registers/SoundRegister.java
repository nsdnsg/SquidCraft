package io.github.squidcraft.util.registers;

import static io.github.squidcraft.api.SoundsRegister.*;
import static io.github.squidcraft.util.ModSounds.*;

public class SoundRegister {
    public SoundRegister() {
        registerSound(ANCIENT_DEBRIS_BREAK, ANCIENT_DEBRIS_BREAK_EVENT);
        registerSound(ANCIENT_DEBRIS_FALL, ANCIENT_DEBRIS_FALL_EVENT);
        registerSound(ANCIENT_DEBRIS_HIT, ANCIENT_DEBRIS_HIT_EVENT);
        registerSound(ANCIENT_DEBRIS_PLACE, ANCIENT_DEBRIS_PLACE_EVENT);
        registerSound(ANCIENT_DEBRIS_STEP, ANCIENT_DEBRIS_STEP_EVENT);

        registerSound(ITEM_ARMOR_EQUIP_NETHERITE_ID, ITEM_ARMOR_EQUIP_NETHERITE);
    }
}