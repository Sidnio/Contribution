package com.sidnio.contribution;

import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import com.intellij.openapi.wm.impl.customFrameDecorations.header.toolbar.MainMenuButton;
import com.intellij.openapi.wm.impl.headertoolbar.MainToolbar;
import com.intellij.util.ui.JBUI;
import com.sidnio.contribution.gui.test;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.jar.Manifest;

public class MyPluginStartupActivity implements ProjectActivity {
    @Nullable
    @Override
    public Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        System.out.println("项目启动");

        BaseComponent mainToolbarCenter = project.getActualComponentManager().getComponent("MainToolbarCenter");

        System.out.println( mainToolbarCenter.toString());


        return null;
    }


}
