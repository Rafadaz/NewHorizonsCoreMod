package com.dreammaster.scripts;

import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.SuperSolarPanels;
import static gregtech.api.util.GT_ModHandler.getModItem;
import static gregtech.api.util.GT_Recipe.GT_Recipe_Map.sLaserEngraverRecipes;

import java.util.Arrays;
import java.util.List;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.Mods;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;

public class ScriptSuperSolarPanels implements IScriptLoader {

    @Override
    public String getScriptName() {
        return "Super Solar Panels";
    }

    @Override
    public List<String> getDependencies() {
        return Arrays.asList(Mods.SuperSolarPanels.ID, AdvancedSolarPanel.ID);
    }

    @Override
    public void loadRecipes() {
        addShapedRecipe(
                ItemList.Cover_SolarPanel_IV.get(1L),
                "craftingToolCrowbar",
                getModItem(SuperSolarPanels.ID, "SpectralSolarPanel", 1, 0, missing),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_LuV.get(1L),
                "craftingToolCrowbar",
                getModItem(SuperSolarPanels.ID, "SingularSolarPanel", 1, 0, missing),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_ZPM.get(1L),
                "craftingToolCrowbar",
                getModItem(SuperSolarPanels.ID, "AdminSolarPanel", 1, 0, missing),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_UV.get(1L),
                "craftingToolCrowbar",
                getModItem(SuperSolarPanels.ID, "PhotonicSolarPanel", 1, 0, missing),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                getModItem(SuperSolarPanels.ID, "solarsplitter", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing),
                getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing));
        addShapedRecipe(
                getModItem(SuperSolarPanels.ID, "enderquantumcomponent", 1, 0, missing),
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 3, missing),
                "plateElectrumFlux",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 3, missing),
                "plateElectrumFlux",
                "plateDenseInfinityCatalyst",
                "plateElectrumFlux",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 3, missing),
                "plateElectrumFlux",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 3, missing));

        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Emerald, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder().itemInputs(
                GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.GreenSapphire, 1L)),
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Olivine, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility
                                .copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.InfusedEarth, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "greencomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Sapphire, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Opal, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.BlueTopaz, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility
                                .copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.InfusedWater, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "bluecomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Firestone, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Jasper, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.FoolsRuby, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.Ruby, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility.copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.GarnetRed, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);
        GT_Values.RA.stdBuilder()
                .itemInputs(
                        GT_Utility
                                .copyAmount(0L, GT_OreDictUnificator.get(OrePrefixes.lens, Materials.InfusedFire, 1L)),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 5, missing))
                .itemOutputs(getModItem(SuperSolarPanels.ID, "redcomponent", 1, 0, missing)).duration(1000).eut(7680)
                .addTo(sLaserEngraverRecipes);

    }
}
