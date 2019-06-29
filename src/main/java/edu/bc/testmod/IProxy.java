package edu.bc.testmod;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public interface IProxy
{
    /**
     *
     * @param event the event
     */
    void preInit(FMLPreInitializationEvent event);

    /**
     *
     * @param event the event
     */
    void init(FMLInitializationEvent event);

    /**
     *
     * @param event the event
     */
    void postInit(FMLPostInitializationEvent event);

    /**
     *
     * @param event the event
     */
    void serverStarting(FMLServerStartingEvent event);
    
    /**
    *
    * @param event the event
    */
    void RegisterBlocks(RegistryEvent.Register<Block> event);
    
    /**
    *
    * @param event the event
    */
    void RegisterItems(RegistryEvent.Register<Item> event);


    /**
     *
     * @param parContext the context
     * @return the player entity from context
     */
    EntityPlayer getPlayerEntityFromContext(MessageContext parContext);
}