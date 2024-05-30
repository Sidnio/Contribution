package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class ContributeIcons {
   public static final Icon contribute = load("/icons/contribute.svg");
   public static final Icon LogosActiveCampaign = load("/icons/LogosActiveCampaign.svg");

    public static Icon load(String path) {
        return IconLoader.getIcon(path, ContributeIcons.class);
    }
}
