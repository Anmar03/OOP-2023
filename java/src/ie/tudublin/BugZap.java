package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

	float playerX = 250;
	float playerY = 450;
	float playerWidth = 10;

	public void settings()
	{
		size(500, 500);
	}

	public void setup()
	{
		
	}

	public void draw()
	{
		if ((frameCount % 60) == 0)
		{
    		clear();
			background(0, 0, 0);
			
			drawBug();
		}
		
		drawPlayer(playerX, playerY, playerWidth);
	}

	void drawPlayer(float x, float y, float w)
	{
		stroke(255, 0, 0);
		circle(x, y, w);
	}

	void drawBug()
	{
		float x = random(width);
		float y = random(height - 100);
		square(x, y, 15);
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			if (playerX > 0)
			{
				playerX = playerX - 10;
			}
			
		}
		if (keyCode == RIGHT)
		{
			if (playerX < width)
			{
				playerX = playerX + 10;
			}
			
		}
		if (key == ' ')
		{
			line(playerX, playerY, playerX, 0);
			stroke(255, 255, 255);
		}
	}	
}
