package com.dreammaster.mixin.mixins.early;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.minecraft.client.Minecraft;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import com.dreammaster.client.util.IconLoader;
import com.dreammaster.coremod.DreamCoreMod;
import com.dreammaster.lib.Refstrings;
import com.gtnewhorizon.mixinextras.injector.ModifyExpressionValue;

@Mixin(Minecraft.class)
public class MixinMinecraft_ConfirmExit {

    @Unique
    private boolean dreamcraft$isCloseRequested;

    @ModifyExpressionValue(
            method = "runGameLoop",
            at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/Display;isCloseRequested()Z", remap = false))
    private boolean dreamcraft$confirmGameShutdown(boolean isCloseRequested) {
        if (!DreamCoreMod.showConfirmExitWindow) {
            return isCloseRequested;
        }
        if (this.dreamcraft$isCloseRequested) {
            return true;
        }
        if (isCloseRequested) {
            new Thread(() -> {
                final JFrame frame = new JFrame();
                frame.setAlwaysOnTop(true);
                final URL resource = IconLoader.class.getClassLoader()
                        .getResource("assets/dreamcraft/textures/icon/GTNH_42x42.png");
                final ImageIcon imageIcon = resource == null ? null : new ImageIcon(resource);
                final int result = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to exit the game ?",
                        Refstrings.NAME,
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        imageIcon);
                if (result == JOptionPane.YES_OPTION) {
                    this.dreamcraft$isCloseRequested = true;
                }
            }).start();
            return false;
        }
        return false;
    }

}
