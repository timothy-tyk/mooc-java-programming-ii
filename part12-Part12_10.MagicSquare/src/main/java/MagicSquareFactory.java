
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int highestNumber = (size*size);
        square.placeValue(size/2, 0 ,1);
        int x = 0;
        int y = size/2;
        int currentNumber=2;
        while(true){
            System.out.println(currentNumber);
            if(currentNumber>highestNumber){
                break;
            }
            int newX = nextX(x,size);
            int newY = nextY(y,size);
            if(square.readValue(newX, newY)>0){
               y=y+1;
               square.placeValue(x, y, currentNumber);
            }else{
                square.placeValue(newX, newY, currentNumber);
            }
            
            currentNumber++;
        }
        
        return square;
    }
    
    private int nextX(int x, int size){
        x=x+1;
        if(x>size-1){
            x=x%(size-1);
        }
        return x;
    }
    
    private int nextY(int y, int size){
        y=y-1;
        if(y<0){
            y=size-1;
        }
        return y;
    }
}
