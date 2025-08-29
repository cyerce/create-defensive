package net.aepherastudios.createdefensive.item.augments;

import net.aepherastudios.createdefensive.item.augments.data.IAugmentCapability;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

public class DefensiveCapabilities {
    public static final Capability<IAugmentCapability> AUGMENT_CAPABILITY = CapabilityManager.get(new CapabilityToken<>(){});
}
