public class Cache {
    private Frame lastFrame;
    
    public void cacheFrame(Frame frame) {
        this.lastFrame = frame;
        System.out.println("Cached last frame? " + (lastFrame != null));
    }
    
    public Frame getLastFrame() {
        return lastFrame;
    }
}