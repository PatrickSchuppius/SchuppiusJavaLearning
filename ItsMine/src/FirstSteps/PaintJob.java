package FirstSteps;


public class PaintJob {

	public static void main(String[] args) {
		if (getBucketCount(-3.4, 2.1, 1.5, 2) == -1) {
			System.out.println("Test Successful, huurraa!");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(-3.4, 2.1, 1.5, 2));
		}

		if (getBucketCount(3.4, 2.1, 1.5, 2) == 3) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(3.4, 2.1, 1.5, 2));
		}

		if (getBucketCount(2.75, 3.25, 2.5, 1) == 3) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(2.75, 3.25, 2.5, 1));
		}
		System.out.println("AB HIER BEGINNT TEIL 2 !!!!!!!");


		if (getBucketCount(-3.4, 2.1, 1.5) == -1) {
			System.out.println("Test Successful, huurraa!");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(-3.4, 2.1, 1.5));
		}

		if (getBucketCount(3.4, 2.1, 1.5) == 5) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(3.4, 2.1, 1.5));
		}

		if (getBucketCount(7.25, 4.3, 2.35) == 14) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(7.25, 4.3, 2.35));
		}

		System.out.println("AB HIER BEGINNT TEIL 3 !!!!!!!");

		if (getBucketCount(3.4, 1.5) == 3) {
			System.out.println("Test Successful, huurraa!");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(3.4, 1.5));
		}

		if (getBucketCount(6.26, 2.2) == 3) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(6.26, 2.2));
		}

		if (getBucketCount(3.26, 0.75) == 5) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test Failure. Result was: " + getBucketCount(3.26, 0.75));
		}
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if ((width <= 0 || height <= 0 || areaPerBucket <= 0) || extraBuckets < 0) {
			return -1;
		}
		
		double wallSize = width * height;
		if (extraBuckets * areaPerBucket >= wallSize) {
			return 0;
		}
		
		double uncoveredWallArea = wallSize - (extraBuckets * areaPerBucket);
		return (int) Math.ceil(uncoveredWallArea / areaPerBucket);

	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if ((width <= 0 || height <= 0 || areaPerBucket <= 0)) {
			return -1;
		}

		double wallSize = width * height;

		return (int) Math.ceil(wallSize / areaPerBucket);
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if ((area <= 0 || areaPerBucket <= 0)) {
			return -1;
		}

		return (int) Math.ceil(area / areaPerBucket);
	}

}
