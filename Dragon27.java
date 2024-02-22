public class Dragon27 {
   
    int x, y, width, height;

    // Fungsi untuk menggerakkan dragon ke arah kiri
    void moveleft()
    {
        x--;
        if (x < 0 || x > width)
        {
            detectCollision();
        }
    }

    // Fungsi untuk menggerakan dragon ke arah kanan
    void moveRight()
    {
        x++;
        if(x < 0 || x > width){
            detectCollision();
        }
    }
    
    // Fungsi untuk menggerakan dragon ke arah atas
    void moveUp()
    {
        y--;
        if(y < 0 || y > height) 
        {
            detectCollision();
        }
    }

    // Fungsi untuk menggerakkan dragon ke arah bawah
    void moveDown()
    {
        y++;
        if (y < 0 || y > height)
        {
            detectCollision();
        }
    }

    // Fungsi untuk mencetak posisi dragon
    void printPosition()
    {
        System.out.println("Position: (" + x +", " + y + ")");
    }
    
    // Fungsi untuk mendeteksi tabrakan dengan batas area permainan
    void detectCollision()
    {
        System.out.println("Game Over");
    }
}

