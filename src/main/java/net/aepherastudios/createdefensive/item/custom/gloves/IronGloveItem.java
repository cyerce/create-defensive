package net.aepherastudios.createdefensive.item.custom.gloves;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attribute;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.UUID;

public class IronGloveItem extends Item implements ICurioItem {

    private final float armor;
    private final float toughness;
    private final float knockbackResistance;
    private final float damageBoost;
    protected ResourceLocation GLOVE_TEXTURE;

    public IronGloveItem(Properties properties, float armor, float toughness, float knockbackResistance, float damageBoost) {
        super(properties);
        this.armor = armor;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.damageBoost = damageBoost;
    }

    public void setRenderTexture(String modId, String registryName) {
        this.GLOVE_TEXTURE = new ResourceLocation(modId, "textures/models/glove/" + registryName + ".png");
    }

    public ResourceLocation getGloveTexture() {
        return this.GLOVE_TEXTURE;
    }

    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(ItemStack stack) {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

        UUID uuid = UUID.nameUUIDFromBytes(stack.getItem().toString().getBytes());

        if (armor > 0) {
            builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "glove_armor", armor, AttributeModifier.Operation.ADDITION));
        }

        if (toughness > 0) {
            builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "glove_toughness", toughness, AttributeModifier.Operation.ADDITION));
        }

        if (knockbackResistance > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "glove_kb_resistance", knockbackResistance, AttributeModifier.Operation.ADDITION));
        }

        if (damageBoost > 0) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(uuid, "glove_damage_boost", damageBoost, AttributeModifier.Operation.ADDITION));
        }

        return builder.build();
    }
}
