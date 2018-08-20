public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      this.composer = comp;
   }
   public void display()
   {
      super.display();
      System.out.println("\nThe music is by " + composer);
   }
}