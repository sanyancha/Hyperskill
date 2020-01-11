public static void moveRobot(Robot robot, int toX, int toY) {
    while(robot.getX() != toX){
        if((robot.getDirection() != Direction.RIGHT && toX > robot.getX()) ||
           (robot.getDirection() != Direction.LEFT &&  robot.getX() > toX) ) {
            robot.turnRight();
        } else {
            robot.stepForward();
        }
    }

    while(robot.getY() != toY){
        if((robot.getDirection() != Direction.UP && toY > robot.getY()) ||
        (robot.getDirection() != Direction.DOWN &&  robot.getY() > toY) ) {
            robot.turnRight();
        } else {
            robot.stepForward();
        }
    }

}