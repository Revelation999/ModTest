package edu.bc.testmod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy implements IProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) {
		// TODO Auto-generated method stub
		return ctx.side.isClient() ? Minecraft.getMinecraft().player : TestMod.proxy.getPlayerEntityFromContext(ctx);
	}

	@Override
	public void RegisterBlocks(Register<Block> event) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void RegisterItems(Register<Item> event) {
		// TODO Auto-generated method stub
		
	}

}
