package design4;

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP4
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  private char typeCoord;
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double theta;
  private double x;
  private double y;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP4(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if(type == 'C') {
    	x = xOrRho;
    	y = yOrTheta;
    	rho = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    	theta = Math.toDegrees(Math.atan2(y, x));
    	typeCoord = 'C';
    }else {
    	rho = xOrRho;
    	theta = yOrTheta;
    	x = (Math.cos(Math.toRadians(theta)) * rho);
    	y = (Math.sin(Math.toRadians(theta)) * rho);
    	typeCoord = 'P';
    }
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getRho()
  {
    return rho;
  }
  
  public double getTheta()
  {
    return theta;
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public PointCP4 convertStorageToPolar()
  {
	  if(typeCoord != 'P')
	    {
	      //Calculate RHO and THETA
	      double temp = getRho();
	      theta = getTheta();
	      rho = temp;
	      
	      typeCoord = 'P';  //Change coord type identifier
	    }
	  return new PointCP4(typeCoord,rho,theta);
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public PointCP4 convertStorageToCartesian()
  {
	  if(typeCoord != 'C')
	    {
	      //Calculate X and Y
	      double temp = getX();
	      y = getY();
	      x = temp;
	   
	      typeCoord = 'C';	//Change coord type identifier
	    }
	  return new PointCP4(typeCoord,x,y);
	  
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP4 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP4 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP4('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as " + (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
  }
}

