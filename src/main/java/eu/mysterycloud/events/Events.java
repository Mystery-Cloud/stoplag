package eu.mysterycloud.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.world.StructureGrowEvent;

public class Events implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onWaterLavaUpdate(final BlockFromToEvent blockFromToEvent) {
        blockFromToEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void OnFade(final BlockFromToEvent blockFromToEvent) {
        blockFromToEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPhysics(final BlockPhysicsEvent blockPhysicsEvent) {
        blockPhysicsEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockSpread(final BlockSpreadEvent blockSpreadEvent) {
        blockSpreadEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockFormEvent(final EntityBlockFormEvent entityBlockFormEvent) {
        entityBlockFormEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockFormEvent2(final BlockFormEvent blockFormEvent) {
        blockFormEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockGrow(final BlockGrowEvent blockGrowEvent) {
        blockGrowEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockExplode(final BlockExplodeEvent blockExplodeEvent) {
        blockExplodeEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onStructureGrow(final StructureGrowEvent structureGrowEvent) {
        structureGrowEvent.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityChanges(final EntityChangeBlockEvent entityChangeBlockEvent) {
        if (entityChangeBlockEvent.getEntity() instanceof org.bukkit.entity.FallingBlock)
            entityChangeBlockEvent.setCancelled(true);
    }

}
