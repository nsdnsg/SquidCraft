package io.github.squid233.squidcraft.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;

public class AuthorsGUI extends Screen {
    private final Screen screen;

    public AuthorsGUI(Screen screen) {
        super(new LiteralText(""));
        this.screen = screen;
    }
    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float delta) {
        renderBackground(matrixStack);
        tooltip("authors.squidcraft.info", this.width / 100, this.height / 9);
        tooltip("squid233", 21 * this.width / 100, this.height / 9);
        tooltip("baka4n",  41 * this.width / 100, this.height / 9);
        super.render(matrixStack, mouseX, mouseY, delta);
    }
    @Override
    public void init() {
        super.init();
        MyButton(3 * this.width / 4, 8 * this.height / 9, "authors.squidcraft.back", (buttonWidget) -> this.screen.onClose());
    }
    private void MyButton(int x, int y, String translationKey, ButtonWidget.PressAction button) { this.addButton(new ButtonWidget(x, y, 100, 20, new TranslatableText(translationKey), button)); }
    private void tooltip(String translationKey, int x, int y) { renderTooltip(new MatrixStack(), new TranslatableText(translationKey), x, y); }
}
