package com.sidnio.contribution;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import icons.ContributeIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MyPluginAction extends AnAction {


    public MyPluginAction() {
       this(ContributeIcons.contribute);
    }

    public MyPluginAction(@Nullable Icon icon) {
        super(icon);

    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        System.out.println("dddddddddddddddddddddddddddddddddd");
        Messages.showMessageDialog(e.getProject(), "Hello from My Plugin!", "Information", ContributeIcons.contribute);
    }
}
