package us.potatoboy.fedora.client;

public class HatHelper {
    private final double heightOffset;
    private final double forwardOffset;
    private final double sideOffset;
    private final float scale;

    public HatHelper(double heightOffset, double forwardOffset, double sideOffset, float scale) {
        this.heightOffset = heightOffset;
        this.forwardOffset = forwardOffset;
        this.sideOffset = sideOffset;
        this.scale = scale;
    }

    public double getHeightOffset() {
        return heightOffset;
    }

    public double getForwardOffset() {
        return forwardOffset;
    }

    public double getSideOffset() {
        return sideOffset;
    }

    public float getScale() {
        return scale;
    }
}