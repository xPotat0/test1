class Tank
{
    int position_x = 0;
    int position_y = 0;
    int cur_move = 1;
    int fuel = 100;
    int b = 1;


    public Tank()
    {

    }

    public Tank(int x, int y)
    {
        this.position_x = x;
        this.position_y = y;
    }

    public Tank(int x, int y, int fuel)
    {
        this.position_x = x;
        this.position_y = y;
        this.fuel = fuel;
    }

    public void goForward(int num)
    {
        if(this.fuel > 0)
        {
            int movement = ((this.fuel - num) >= 0) ? num : this.fuel;
            this.fuel -= movement;
            if(this.cur_move == 1)
                this.position_x += movement;
            else if(this.cur_move == 2)
                this.position_y += movement;
            else if (this.cur_move == 3)
                this.position_x -= movement;
            else
                this.position_y -= movement;
        }
    }

    public void goBackward(int num)
    {
        if(this.fuel > 0) {
            int movement = ((this.fuel - num) >= 0) ? num : this.fuel;
            this.fuel -= movement;
            if (this.cur_move == 1)
                this.position_x -= movement;
            else if (this.cur_move == 2)
                this.position_y -= movement;
            else if (this.cur_move == 3)
                this.position_x += movement;
            else
                this.position_y += movement;
        }
    }

    public void printPosition()
    {
        System.out.println(String.format("The Tank is at %d, %d now.", this.position_x, this.position_y));
    }

    public void turnRight()
    {
        if(this.cur_move == 1)
            this.cur_move = 2;
        else if (cur_move == 2)
            this.cur_move = 3;
        else if (cur_move == 3)
            this.cur_move = 4;
        else
            this.cur_move = 1;
    }

    public void turnLeft()
    {
        if(this.cur_move == 1)
            this.cur_move = 4;
        else if (cur_move == 2)
            this.cur_move = 1;
        else if (cur_move == 3)
            this.cur_move = 2;
        else
           this. cur_move = 3;
    }
}

public class Hello
{
    public static void main(String[] args)
    {

        Tank tank = new Tank();
        tank.goForward(13);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(37);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();
    }
}