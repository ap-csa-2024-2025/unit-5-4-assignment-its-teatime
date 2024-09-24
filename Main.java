public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Distance: " + distance(0,5,0,0));

    System.out.println("Positive root: " + quadFormPositive(1,5,6));
    System.out.println("Negative root: " + quadFormNegative(1,5,6));
  }



  
  public static double distance (double x1, double y1, double x2, double y2)
  {
    double distX = (x1-x2)*(x1-x2);
    double distY = (y1-y2)*(y1-y2);
    double dist = Math.sqrt(distX + distY);
    return dist;
  }

  public static double quadFormPositive(double a, double b, double c)
  {
    return (-1 * b + Math.sqrt((b*b) - 4*a*c)) / (2*a);
  }

  public static double quadFormNegative(double a, double b, double c)
  {
    return (-1 * b - Math.sqrt((b*b) - 4*a*c)) / (2*a);
  }
}
