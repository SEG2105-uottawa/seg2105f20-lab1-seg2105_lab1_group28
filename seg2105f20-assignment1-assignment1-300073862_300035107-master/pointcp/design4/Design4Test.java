package design4;

import java.util.Arrays;

public class Design4Test {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		long[][] totalResults = new long [1000][8];
		for(int i=0;i<50;i++) {
			PointCP4 testPoint;
			testPoint = new PointCP4('P',Math.random()*9.0, Math.random()*9.0);
			long[] result = performanceTest(testPoint);
			totalResults[i] = result;
		}
		for(int j=50;j<100;j++) {
			PointCP4 testPoint;
			testPoint = new PointCP4('C',Math.random()*9.0, Math.random()*9.0);
			long[] result = performanceTest(testPoint);
			totalResults[j] = result;
					
		}
		
		double[] average = new double[8];
		long[] maxs = new long[8];
		long[] mins = new long[8];
		
		for(int k=0;k<8;k++) {
			long getTotal = 0;
			long getMax = 0;
			long getMin = totalResults[0][k];
			
			for(int i=0;i<100;i++) {
				if(totalResults[i][k]>getMax) {
					getMax = totalResults[i][k];
				}
				if(totalResults[i][k]<getMin) {
					getMin = totalResults[i][k];
				}
				getTotal = totalResults[i][k]+getTotal;
			}
			
			average[k]=getTotal/100.0;
			maxs[k] = getMax;
			mins[k] = getMin;
		}
		
		long[] meds = new long[8];
		long[] getXtest = new long[100];
		long[] getYtest = new long[100];
		long[] getRhotest = new long[100];
		long[] getThetatest = new long[100];
		long[] convertStorageToPolartest = new long[100];
		long[] convertStorageToCartesiantest = new long[100];
		long[] getDistancetest = new long[100];
		long[] rotatePointtest = new long[100];
		
		for(int i1=0;i1<100;i1++) {
			getXtest[i1]=totalResults[i1][0];
			getYtest[i1]=totalResults[i1][1];
			getRhotest[i1]=totalResults[i1][2];
			getThetatest[i1]=totalResults[i1][3];
			convertStorageToPolartest[i1]=totalResults[i1][4];
			convertStorageToCartesiantest[i1]=totalResults[i1][5];
			getDistancetest[i1]=totalResults[i1][6];
			rotatePointtest[i1]=totalResults[i1][7];
		}
		
		meds[0]=getMedian(getXtest);
		meds[1]=getMedian(getYtest);
		meds[2]=getMedian(getRhotest);
		meds[3]=getMedian(getThetatest);
		meds[4]=getMedian(convertStorageToPolartest);
		meds[5]=getMedian(convertStorageToCartesiantest);
		meds[6]=getMedian(getDistancetest);
		meds[7]=getMedian(rotatePointtest);
		
		for(int i2=0;i2<10;i2++) {
			System.out.println("Run "+(i2+1)+": "+Arrays.toString(totalResults[i2]));
		}
		System.out.println("Average: "+Arrays.toString(average));
		System.out.println("Maxs: "+Arrays.toString(maxs));
		System.out.println("Mins: "+Arrays.toString(mins));
		System.out.println("Meds: "+Arrays.toString(meds));
		
		long finish = System.currentTimeMillis();
		System.out.println("Total Runtime: "+(finish-start));
		
	}
	
	private static long getMedian(long[] arr) {
		  Arrays.sort(arr);
		  long median;
		  median = (arr[arr.length/2]+arr[arr.length/2 -1])/2;
		  return median;
	}
	
	private static long[] performanceTest(PointCP4 point) {
		  long[] testOutput = new long[8];
		  testOutput[0] = testGetX(point);
		  testOutput[1] = testGetY(point);
		  testOutput[2] = testGetRho(point);
		  testOutput[3] = testGetTheta(point);
		  testOutput[4] = testConvertStorageToPolar(point);
		  testOutput[5] = testConvertStorageToCartesian(point);
		  testOutput[6] = testGetDistance(point);
		  testOutput[7] = testRotatePoint(point);
		  return testOutput;
		  
	}
	  
	private static long testGetX (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.getX();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testGetY (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.getY();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testGetRho (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.getRho();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testGetTheta (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.getTheta();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testConvertStorageToPolar (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.convertStorageToPolar();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testConvertStorageToCartesian (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.convertStorageToCartesian();
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testGetDistance (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.getDistance(point);
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  
	private static long testRotatePoint (PointCP4 point) {
		  long start = System.currentTimeMillis();
		  for(int i=0; i<300000; i++) {
			  point.rotatePoint(100);
		  }
		  long finish = System.currentTimeMillis();
		  return finish - start;
		  
	}
	  

}
