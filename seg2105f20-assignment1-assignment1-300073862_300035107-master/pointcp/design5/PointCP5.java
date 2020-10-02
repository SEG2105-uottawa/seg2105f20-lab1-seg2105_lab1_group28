package design5;
import design2.PointCP2;

import design3.PointCP3;

public interface PointCP5{
	public double getX();
	public double getY();
	public double getRho();
	public double getTheta();
	public PointCP2 convertStorageToPolar();
	public PointCP3 convertStorageToCartesian();
	public double getDistance(PointCP5 pointB);
	public PointCP5 rotatePoint(double rotation);
	public String toString();
	
}
