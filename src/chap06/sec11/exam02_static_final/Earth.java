package chap06.sec11.exam02_static_final;

public class Earth {
	//상수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	// 정적블록
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * Math.pow(EARTH_RADIUS, 2);
	}
}
