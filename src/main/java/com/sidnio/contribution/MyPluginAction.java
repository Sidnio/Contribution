package com.sidnio.contribution;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import icons.ContributeIcons;
import org.jetbrains.annotations.NotNull;

public class MyPluginAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        System.out.println("dddddddddddddddddddddddddddddddddd");
        Messages.showMessageDialog(e.getProject(), "Hello from My Plugin!", "Information", ContributeIcons.contribute);
    }
}
