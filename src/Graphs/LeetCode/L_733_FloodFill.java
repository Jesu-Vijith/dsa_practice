public class L_733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){
            return image;
        }
        int existingColor=image[sr][sc];
        floodfill(image,sr,sc,color,existingColor);
        return image;
    }
    public void floodfill(int[][] image, int sr, int sc, int color,int existingColor){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length){
            return;
        }
        if(image[sr][sc]==color || image[sr][sc]!=existingColor){
            return;
        }
        if(image[sr][sc]==existingColor){
            image[sr][sc]=color;
        }
        for(int[]i:image){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        //left
        floodfill(image,sr,sc-1,color,existingColor);
        //right
        floodfill(image,sr,sc+1,color,existingColor);
        //top
        floodfill(image,sr-1,sc,color,existingColor);
        //bottom
        floodfill(image,sr+1,sc,color,existingColor);

    }

    static void main() {
        L_733_FloodFill f1=new L_733_FloodFill();
        int[][]image={{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        int[][] flood=f1.floodFill(image,sr,sc,color);
        for(int[]i:flood){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
