package net.mcreator.test;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementstest.ModElement.Tag
public class MCreatorEtherlandMod extends Elementstest.ModElement {
	public MCreatorEtherlandMod(Elementstest instance) {
		super(instance, 8);
	}
	public static CreativeTabs tab = new CreativeTabs("tabetherlandmod") {
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorEther.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
