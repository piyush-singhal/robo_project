package util;

public class Consts {
	public static final int DEFAULT_SPEED = 150;
	public static final int OBST_DIST_THRES = 20;
	public static final int TURN_RIGHT = -45;
	public static final int TURN_LEFT = 45;
	public static final int BT = 2, USB = 1; //connection mode
	public static enum CORNER { A, B, C, CH }; //ch is charing center
	public static enum MYCOLOR { RED, YELLOW, GREEN };  //custum color id
	public static final int GREEN = 1; //colorid from sensor
	public static final int RED = 0;
	public static final int YELLOW = 3;
	public static final int CLAWOPEN = 1; //clam open status 1
	public static final int CLAWCLOSE = 0;
	public static final float WHEEL_DIA = 26f; //wheel diameter
	public static final float TRACK_WIDTH = 120f;

	// Go to Corner Constants
	public static final int MOVE_SPEED = 250;
	public static final int ROTATION_SPEED = 100;
	public static final int MOTOR_ACCELERATION = 2000;
	public static final float ANGLE_THRES = 3.0f;
	public static final float AB_ANGLE = 287.0f;
	public static final float CD_ANGLE = 90.0f;
	public static final float NORTH = 0.0f;
	public static final float EAST = 90.0f;
	public static final float SOUTH = 197.0f;
	public static final float WEST = 287.0f;
	
	
}