package workshop.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import workshop.WorkshopMod;

/*I used Dr. Thiel's code (which he got from https://wiki.mcjty.eu/modding/index.php?title=Tutorial_1.18_Episode_1) to derive this class.*/
public class Registration {

    //Register BLOCKS and ITEMS using DeferredRegisterObjects
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WorkshopMod.MOD_ID);
    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WorkshopMod.MOD_ID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    //Create RegistryObjects for blocks

    public static final RegistryObject<Block> SPECIAL_MUSHROOM_BLOCK = BLOCKS.register("special_mushroom_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    
    //Create RegistryObjects for items
    public static final RegistryObject <Item> MAGIC_WAND = ITEMS.register("magic_wand", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPECIAL_MUSHROOM_BLOCK_ITEM = fromBlock(SPECIAL_MUSHROOM_BLOCK);

   


    //Create item from existing block RegistryObject
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}


