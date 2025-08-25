public class Player {
    private Decoder decoder = new Decoder();
    private PlayerDisplay display = new PlayerDisplay();
    private Cache cache = new Cache();
    
    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        
        display.display(fileBytes);
        
        cache.cacheFrame(frame);
    }
}