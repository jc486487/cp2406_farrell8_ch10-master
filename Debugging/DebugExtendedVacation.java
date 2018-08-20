public class DebugExtendedVacation extends DebugVacation
{
   public DebugExtendedVacation()
   {
      int days = getDays();
      days = 30;
   }

   @Override
   public int getDays() {
      return (super.getDays() + 20);
   }
}