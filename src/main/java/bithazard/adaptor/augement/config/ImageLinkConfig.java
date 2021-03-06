package bithazard.adaptor.augement.config;

public class ImageLinkConfig {
    private final int minWidth;
    private final int minHeight;
    private final boolean addSurroundingText;
    private final int surroundingTextMinLength;
    private final int surroundingTextMaxLength;

    public ImageLinkConfig(int minWidth, int minHeight, boolean addSurroundingText, int surroundingTextMinLength,
                           int surroundingTextMaxLength) {
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        this.addSurroundingText = addSurroundingText;
        this.surroundingTextMinLength = surroundingTextMinLength;
        this.surroundingTextMaxLength = surroundingTextMaxLength;
    }

    public int getMinWidth() {
        return minWidth;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public boolean isAddSurroundingText() {
        return addSurroundingText;
    }

    public int getSurroundingTextMinLength() {
        return surroundingTextMinLength;
    }

    public int getSurroundingTextMaxLength() {
        return surroundingTextMaxLength;
    }
}
