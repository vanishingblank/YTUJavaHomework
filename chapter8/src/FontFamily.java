import java.awt.*;

public class FontFamily {
    public static String[] getFonts(){
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    }
}
