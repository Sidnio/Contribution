package com.sidnio.contribution;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import icons.ContributeIcons;

public class sssss extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        System.out.println("dddddddddddddddddddddddddddddddddd");
        Messages.showMessageDialog(e.getProject(), "Hello from My Plugin!", "Information", ContributeIcons.contribute);
    }
}
